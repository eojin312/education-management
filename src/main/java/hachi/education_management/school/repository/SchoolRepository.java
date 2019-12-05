package hachi.education_management.school.repository;

import hachi.education_management.school.controller.request.SchoolSearchParameter;
import hachi.education_management.school.model.School;

import java.util.List;
import java.util.Map;

public interface SchoolRepository {
    int insert(School school);

    School selectByNo(long schoolNo);

    Map<String,Object> findByNoToMap(long schoolNo);

    List<School> findAll();

    List<School> findAll(SchoolSearchParameter schoolSearchParameter);

    List<School> findAboutSchool(long schoolNo);

    int modify(School school);

    int updateToRemoved(long schoolNo);
}
