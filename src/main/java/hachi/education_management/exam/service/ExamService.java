package hachi.education_management.exam.service;

import hachi.education_management.exam.model.Exam;
import hachi.education_management.exam.vo.ExamList;
import hachi.education_management.exam.vo.ExamDetail;
import hachi.education_management.exam.vo.ExamStudentApply;

import java.util.List;

public interface ExamService {
    List<ExamStudentApply> findExamApplyListByStudentApplyNo(long examStudentApplyNo);

    List<ExamList> findExamListByGradeNo(int gradeNo);

    List<ExamDetail> getExamDeatilListByExamNoAndStudentNo(int examNo, long studentNo);

    int insert(Exam exam);
}
