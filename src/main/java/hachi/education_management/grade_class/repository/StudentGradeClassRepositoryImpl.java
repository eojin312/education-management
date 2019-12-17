package hachi.education_management.grade_class.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentGradeClassRepositoryImpl implements StudentGradeClassRepository {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public int insert(long studentNo, long gradeClassNo) {

        Map<String, Object> params = new HashMap<>();
        params.put("studentNo", studentNo);
        params.put("gradeClassNo", gradeClassNo);

        return sqlSessionTemplate.insert("gradeClass.insertStduentGradeClass", params);
    }
}