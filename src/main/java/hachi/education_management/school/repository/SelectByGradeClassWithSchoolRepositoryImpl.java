package hachi.education_management.school.repository;

import hachi.education_management.school.vo.GradeClassWithSchool;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class SelectByGradeClassWithSchoolRepositoryImpl implements SelectByGradeClassWithSchoolRepository {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<GradeClassWithSchool> selectByGradeClassWithSchool(long schoolNo) {
        return sqlSessionTemplate.selectList("school.selectByGradeClassWithSchool", schoolNo);
    }
}
