package hachi.education_management.school.service;

import hachi.education_management.grade_class.vo.GradeClassWithStudent;
import hachi.education_management.school.controller.request.SchoolSearchParameter;
import hachi.education_management.school.model.School;
import hachi.education_management.school.vo.GradeClassWithSchool;

import java.util.List;

/**
 * 학교 service
 */

public interface SchoolService {

    long add(School school);

    School findByNo(long schoolNo);

    List<School> findAll();

    List<School> findAll(SchoolSearchParameter schoolSearchParameter);

    boolean modify(School school);

    boolean remove(long schoolNo) throws Exception;

    List<GradeClassWithStudent> findGradeClassByGradeClassNoAndSchoolNo(int gradeClassNo);
}
