package hachi.education_management.exam.service;

import hachi.education_management.exam.vo.Exam;
import hachi.education_management.exam.vo.ExamStudentApply;

import java.util.List;

public interface ExamService {
    List<ExamStudentApply> findByExamApplyAndStudent(long examStudentApplyNo);

    List<Exam> findByExam(int grade);
}
