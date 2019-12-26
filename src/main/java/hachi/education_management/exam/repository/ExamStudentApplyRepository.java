package hachi.education_management.exam.repository;

import hachi.education_management.exam.vo.ExamStudentApply;

import java.util.List;

public interface ExamStudentApplyRepository {

    List<ExamStudentApply> findByExamNoWithStudentNo();
}
