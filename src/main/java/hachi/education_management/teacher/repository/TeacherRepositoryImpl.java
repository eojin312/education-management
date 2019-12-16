package hachi.education_management.teacher.repository;

import hachi.education_management.teacher.model.Teacher;
import hachi.education_management.teacher.model.TeacherSubject;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TeacherRepositoryImpl implements TeacherRepository {

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    @Override
    public int add(Teacher teacher) {
        return sqlSessionTemplate.insert("teacher.add", teacher);
    }

    @Override
    public Teacher findByTeacherNo(int teacherNo) {
        return sqlSessionTemplate.selectOne("teacher.findByTeacherNo", teacherNo);
    }

    @Override
    public List<TeacherSubject> findTeacherListWithSubject() {
        return sqlSessionTemplate.selectList("teacher.findTeacherWithSubject");
    }

    @Override
    public List<Teacher> findAll() {
        return sqlSessionTemplate.selectList("teacher.findAll");
    }

    @Override
    public Teacher findByIdAndPwd(String id, String pwd) {
        Map<String, Object> param = new HashMap<>();
        param.put("id", id);
        param.put("pwd", pwd);
        return sqlSessionTemplate.selectOne("teacher.findByIdAndPwd", param);
    }

}
