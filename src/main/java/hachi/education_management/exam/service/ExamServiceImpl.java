package hachi.education_management.exam.service;

import hachi.education_management.exam.repository.ExamRepository;
import hachi.education_management.exam.vo.Exam;
import hachi.education_management.exam.vo.ExamDetail;
import hachi.education_management.exam.vo.ExamStudentApply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamServiceImpl implements ExamService {
    @Autowired
    private ExamRepository examRepository;

    @Override
    public List<ExamStudentApply> findByExamApplyAndStudent(long examStudentApplyNo) {
        return examRepository.findByExamApplyAndStudent(examStudentApplyNo);
    }

    @Override
    public List<Exam> findByExam(int grade) {
        return examRepository.findByExam(grade);
    }

    @Override
    public List<ExamDetail> findByExamDeatilForStudent(int examNo) {
        return examRepository.findByExamDeatilForStudent(examNo);
    }
}
