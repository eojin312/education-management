package hachi.education_management.grade_class.repository;

import hachi.education_management.grade_class.vo.GradeClassWithStudent;

import java.util.List;

public interface StudentGradeClassRepository {
    int insert(long studentNo, long gradeClassNo);

    List<GradeClassWithStudent> selectByGradeClassWithSchoolNo(long gradeClassNo, int schoolNo);
}
