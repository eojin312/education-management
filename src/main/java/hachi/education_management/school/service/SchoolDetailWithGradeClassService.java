package hachi.education_management.school.service;

import hachi.education_management.school.vo.GradeClassWithSchool;

import java.util.List;

public interface SchoolDetailWithGradeClassService {
    List<GradeClassWithSchool> findByGradeClass(long schoolNo);
}
