package hachi.education_management.school.service;


import hachi.education_management.grade_class.vo.GradeClassWithStudent;
import hachi.education_management.school.controller.request.SchoolSearchParameter;
import hachi.education_management.school.repository.SchoolRepository;
import hachi.education_management.school.model.School;
import hachi.education_management.school.vo.GradeClassWithSchool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    @Override
    public long add(School school) {
        school.setUseYn("Y");
        if (school.getSchoolName().length() < 3) {
            throw new IllegalArgumentException("학교이름은 최소 세글자 이상이어야합니다.");
        }
        schoolRepository.insert(school);
        return school.getSchoolNo();
    }

//    상세보기
    @Override
    public School findByNo(long schoolNo) {
        return schoolRepository.selectByNo(schoolNo);
    }

//    리스트
    @Override
    public List<School> findAll() {
        return schoolRepository.findAll();
    }

    @Override
    public List<School> findAll(SchoolSearchParameter schoolSearchParameter) {
        return schoolRepository.findAll(schoolSearchParameter);
    }

    @Override
    public List<School> findAboutSchool(long schoolNo) {
        return schoolRepository.findAboutSchool(schoolNo);
    }

//    수정
    @Override
    public boolean modify(School school) {
        int updatedRows = schoolRepository.modify(school);
        if (updatedRows == 1) {
            return true;
        } else {
            return false;
        }
    }

//    삭제
    @Override
    public boolean remove(long schoolNo) throws Exception {
        if (schoolNo == 0) {
            throw new IllegalArgumentException("학교번호는 필수 입니다.");
        }
        int updatedRows =  schoolRepository.updateToRemoved(schoolNo);
        if (updatedRows == 1) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public List<GradeClassWithSchool> findByGradeClass(long schoolNo) {
        return schoolRepository.findByGradeClassWithSchool(schoolNo);
    }

    @Override
    public List<GradeClassWithStudent> findGradeClassByGradeClassNoAndSchoolNo(int gradeClassNo) {
        return schoolRepository.findStudentByGradeClassAndSchoolNo(gradeClassNo);
    }
}
