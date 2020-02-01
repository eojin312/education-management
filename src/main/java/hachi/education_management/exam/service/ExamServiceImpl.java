package hachi.education_management.exam.service;

import hachi.education_management.exam.model.Exam;
import hachi.education_management.exam.repository.ExamRepository;
import hachi.education_management.exam.vo.ExamList;
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
    public List<ExamStudentApply> findExamApplyListByStudentApplyNo(long examStudentApplyNo) {
        return examRepository.findExamApplyListByStudentApplyNo(examStudentApplyNo);
    }

    @Override
    public List<ExamList> findExamListByGradeNo(int gradeNo) {
        return examRepository.findExamListByGradeNo(gradeNo);
    }

    @Override
    public List<ExamDetail> getExamDeatilListByExamNoAndStudentNo(int examNo, long studentNo) {
        return examRepository.findExamDeatilListByExamNoAndStduentNo(examNo, studentNo);
    }

    @Override
    public int insert(Exam exam) {
        return examRepository.insert(exam);
    }
}
