package hachi.education_management.school.repository;

import hachi.education_management.grade_class.vo.GradeClassWithStudent;
import hachi.education_management.school.controller.request.SchoolSearchParameter;
import hachi.education_management.school.model.School;
import hachi.education_management.school.vo.GradeClassWithSchool;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class SchoolRepositoryImpl implements SchoolRepository {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public int insert(School school) {
        return sqlSessionTemplate.insert("school.insert", school);
    }

    @Override
    public School selectByNo(long schoolNo) {
        return sqlSessionTemplate.selectOne("school.selectByNo", schoolNo);
    }

    @Override
    public Map<String,Object> findByNoToMap(long schoolNo) {
        return sqlSessionTemplate.selectOne("school.findByNoToMap", schoolNo);
    }

    @Override
    public List<School> findAll() {
        return sqlSessionTemplate.selectList("school.findAll");
    }

    @Override
    public List<School> findAll(SchoolSearchParameter schoolSearchParameter) {
        return sqlSessionTemplate.selectList("school.findAll", schoolSearchParameter);
    }

    @Override
    public List<School> findAboutSchool(long schoolNo) {
        return sqlSessionTemplate.selectList("school.");
    }

    @Override
    public int modify(School school) {
        return sqlSessionTemplate.update("school.modify", school);
    }

    @Override
    public int updateToRemoved(long schoolNo) {
        return sqlSessionTemplate.update("school.updateToRemoved", schoolNo);
    }

    @Override
    public List<GradeClassWithSchool> findByGradeClassWithSchool(long schoolNo) {
        return sqlSessionTemplate.selectList("school.findByGradeClassWithSchool", schoolNo);
    }

    @Override
    public List<GradeClassWithStudent> findStudentByGradeClassAndSchoolNo(int gradeClassNo) {
        Map<String, Object> params = new HashMap<>();
        params.put("gradeClassNo", gradeClassNo);
        return sqlSessionTemplate.selectList("school.findStudentByGradeClassAndSchoolNo", params);
    }


}
