package hachi.education_management.exam.repository;

import hachi.education_management.exam.model.Exam;
import hachi.education_management.exam.vo.ExamList;
import hachi.education_management.exam.vo.ExamDetail;
import hachi.education_management.exam.vo.ExamStudentApply;

import java.util.List;

/**
 * 시험 관련 repository
 */
public interface ExamRepository {

    // 특정학생 시험 응시 리스트
    List<ExamStudentApply> findExamApplyListByStudentApplyNo(long examStudentApplyNo);

    //학년마다 존재하는 시험 정보
    List<ExamList> findExamListByGradeNo(int gradeNo);

    //특정 시험 상세 리스트
    List<ExamDetail> findExamDeatilByExamNo(int examNo);

    //시험 정보 추가
    int insert(Exam exam);
}


