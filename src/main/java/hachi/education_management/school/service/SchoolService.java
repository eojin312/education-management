package hachi.education_management.school.service;

import hachi.education_management.school.controller.request.SchoolSearchParameter;
import hachi.education_management.school.model.School;

import java.util.List;

public interface SchoolService {

    long add(School school);

    School findByNo(long schoolNo);

    List<School> findAll();

    List<School> findAll(SchoolSearchParameter schoolSearchParameter);

    List<School> findAboutSchool(long schoolNo);

    boolean modify(School school);

    boolean remove(long schoolNo) throws Exception;
}
