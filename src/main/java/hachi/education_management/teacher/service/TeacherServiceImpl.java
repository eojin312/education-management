package hachi.education_management.teacher.service;

import hachi.education_management.subject.model.Subject;
import hachi.education_management.subject.repository.SubjectRepository;
import hachi.education_management.teacher.exception.NoSuchTeacherException;
import hachi.education_management.teacher.model.Teacher;
import hachi.education_management.teacher.model.TeacherSubject;
import hachi.education_management.teacher.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    SubjectRepository subjectRepository;

    @Override
    public int add(Teacher teacher) {
        teacherRepository.add(teacher);
        return teacher.getTeacherNo();
    }

    @Override
    public Teacher findByTeacherNo(int teacherNo) {
        return teacherRepository.findByTeacherNo(teacherNo);
    }

    @Override
    public Teacher checkTeacherAndGet(String id, String pwd) throws NoSuchTeacherException {

        Teacher teacher = teacherRepository.findByIdAndPwd(id, pwd);

        if (teacher == null) {
            throw new NoSuchTeacherException();
        } else {
            return teacher;
        }
    }

    @Override
    public List<TeacherSubject> getTeacherListWithSubject() {
        return teacherRepository.findTeacherListWithSubject();
    }

    @Override
    public List<Teacher> findTeacherListWithSubjectAggregation() {
        List<Teacher> teacherList = teacherRepository.findAll();
        final int listSize = teacherList.size();
        for (int i = 0; i < listSize; i++) {
            int subjectNo = teacherList.get(i).getSubjectNo();
            Subject subject = subjectRepository.findBySubjectNo(subjectNo);
            teacherList.get(i).setSubject(subject);
        }
        return teacherList;
    }

    @Override
    public List<Teacher> findTeacherListWithSubjectAggregationEnhanced() {

        // 선생님목록(List<Teacher>)을 가지고 온다
        List<Teacher> teacherList = teacherRepository.findAll();

        // 선생님 목록에서 과목들을 중복 제거한다
        Set<Integer> deduplicatedSubjectNoSet = this.deduplicateSubjectNoWithTeacherList(teacherList);

        // 중복제거된 과목번호를 List로 변환한다
        List<Integer> subjectNoList = new ArrayList<>(deduplicatedSubjectNoSet);

        // 중복제거된 과목번호들로 과목들(List<Subject>) 을 DB로부터 가지고온다
        List<Subject> subjectList = subjectRepository.findListBySubjectNoList(subjectNoList);

        //
        Map<Integer, Subject> subjectMap = new HashMap<>();
        for (Subject subject : subjectList) {
            subjectMap.put(subject.getSubjectNo(), subject);
        }

        final int listSize = teacherList.size();
        for (int i = 0; i < listSize; i++) {
            int subjectNo = teacherList.get(i).getSubjectNo();
            Subject subject = subjectMap.get(subjectNo);
            teacherList.get(i).setSubject(subject);
        }
        return teacherList;
    }

    private Set<Integer> deduplicateSubjectNoWithTeacherList(List<Teacher> teacherList) {
        Set<Integer> deduplicatedSubjectNoSet = new HashSet<>();
        for (Teacher teacher : teacherList) {
            deduplicatedSubjectNoSet.add(teacher.getSubjectNo());
        }
        return deduplicatedSubjectNoSet;
    }
}
