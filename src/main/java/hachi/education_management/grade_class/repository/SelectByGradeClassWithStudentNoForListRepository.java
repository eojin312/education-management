package hachi.education_management.grade_class.repository;

import java.util.List;

public interface SelectByGradeClassWithStudentNoForListRepository {

    List selectByGradeClassWithSchoolNo(long gradeClassNo, int schoolNo);
}
