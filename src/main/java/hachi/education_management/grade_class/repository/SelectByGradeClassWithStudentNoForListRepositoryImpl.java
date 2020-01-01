package hachi.education_management.grade_class.repository;

import hachi.education_management.grade_class.vo.GradeClassWithSchool;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SelectByGradeClassWithStudentNoForListRepositoryImpl implements SelectByGradeClassWithStudentNoForListRepository {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<GradeClassWithSchool> selectByGradeClassWithSchoolNo(long gradeClassNo, int schoolNo) {
        return sqlSessionTemplate.selectList("gradeClass.selectByGradeClassWithStudentNoForList", gradeClassNo);
    }
}
