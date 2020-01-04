package hachi.education_management.grade_class.repository;

import java.util.List;

public interface StudentGradeClassRepository {
    int insert(long studentNo, long gradeClassNo);

    List selectByGradeClassWithSchoolNo(long gradeClassNo, int schoolNo);
}
