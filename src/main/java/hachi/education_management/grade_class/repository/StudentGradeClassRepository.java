package hachi.education_management.grade_class.repository;

import hachi.education_management.grade_class.vo.GradeClassWithStudent;

import java.util.List;

/**
 * 학년 반 repository
 */
public interface StudentGradeClassRepository {

    //학년 반을 추가하기위한 메소드
    int insert(long studentNo, long gradeClassNo);
}
