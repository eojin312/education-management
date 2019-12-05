package hachi.education_management.teacher.service;

import hachi.education_management.teacher.exception.NoSuchTeacherException;
import hachi.education_management.teacher.model.Teacher;
import hachi.education_management.teacher.model.TeacherSubject;
import hachi.education_management.teacher.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherRepository teacherRepository;


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
    public List<TeacherSubject> getTeacherListWithSubject() {
        return teacherRepository.findTeacherListWithSubject();
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
}
