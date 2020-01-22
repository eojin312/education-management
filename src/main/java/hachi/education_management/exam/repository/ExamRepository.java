package hachi.education_management.exam.repository;

import hachi.education_management.exam.vo.Exam;
import hachi.education_management.exam.vo.ExamDetail;
import hachi.education_management.exam.vo.ExamStudentApply;

import java.util.List;

public interface ExamRepository {
    List<ExamStudentApply> findByExamApplyAndStudent(long examStudentApplyNo);

    List<Exam> findByExam(int grade);

    List<ExamDetail> findByExamDeatilForStudent(int examNo);

    int insertExam();
}


