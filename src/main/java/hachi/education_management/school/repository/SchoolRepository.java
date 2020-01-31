package hachi.education_management.school.repository;

import hachi.education_management.grade_class.vo.GradeClassWithStudent;
import hachi.education_management.school.controller.request.SchoolSearchParameter;
import hachi.education_management.school.model.School;
import hachi.education_management.school.vo.GradeClassWithSchool;

import java.util.List;
import java.util.Map;

/**
 * 학교 repository
 */
public interface SchoolRepository {

    //학교를 등록하기 위한 메소드
    int insert(School school);

    //특정학교 상세정보
    School findSchoolDetailBySchoolNo(long schoolNo);

    //Map 타입으로 만들어본 특정학교 상세정보
    Map<String,Object> findByNoToMap(long schoolNo);

    //학교 리스트
    List<School> findAll();

    //학교 리스트에서 검색했을 시에 나오는 리스트
    List<School> findAll(SchoolSearchParameter schoolSearchParameter);

    //학교 정보 수정 메소드
    int modify(School school);

    //힉교 정보 삭제하기 위한 메소드
    int updateToRemoved(long schoolNo);

    // 학생 학년 반 리스트를 위한 메소드
    List<GradeClassWithStudent> findStudentByGradeClassAndSchoolNo(int gradeClassNo);

    List<GradeClassWithSchool> findByGradeClass(long schoolNo);

}
