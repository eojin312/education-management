package hachi.education_management.school.repository;

import hachi.education_management.school.vo.GradeClassWithSchool;

import java.util.List;

public interface SelectByGradeClassWithSchoolRepository {
    List<GradeClassWithSchool> selectByGradeClassWithSchool(long schoolNo);
}
