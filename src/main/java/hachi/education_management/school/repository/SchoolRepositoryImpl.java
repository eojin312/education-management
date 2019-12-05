package hachi.education_management.school.repository;

import hachi.education_management.school.controller.request.SchoolSearchParameter;
import hachi.education_management.school.model.School;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
        return sqlSessionTemplate.selectList("school.getTeacherListWithSubject");
    }

    @Override
    public List<School> findAll(SchoolSearchParameter schoolSearchParameter) {
        return sqlSessionTemplate.selectList("school.getTeacherListWithSubject", schoolSearchParameter);
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


}
