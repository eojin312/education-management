package hachi.education_management.student.repository;

import hachi.education_management.student.model.Student;
import hachi.education_management.student.vo.StudentSchool;
import hachi.education_management.grade_class.vo.GradeClass;
import hachi.education_management.student.vo.StudentWithGradeClassForStudentDetailAndList;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * StudentRepository 를 구현한 클래스
 * 인터페이스를 할 땐 무조건 public 으로 해야함 안그러면
 * default 값으로 패키지 내에서만 접근 가능하게만 되어짐
 * Qualifier 는 의존 자동 주입
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public int insertIntoStudent(Student student) {
        return sqlSessionTemplate.insert("student.insert", student);
    }

    @Override
    public List<StudentSchool> findStudentSchool() {
        return sqlSessionTemplate.selectList("student.findStudentSchool");
    }

    @Override
    public List<StudentWithGradeClassForStudentDetailAndList> findByStudentNoWithGradeClass() {
        return sqlSessionTemplate.selectList("student.findByStudentNoWithGradeClass");
    }


    @Override
    public StudentWithGradeClassForStudentDetailAndList detail(long studentNo) {
        return sqlSessionTemplate.selectOne("student.detail", studentNo);
    }

    @Override
    public Student findByIdAndPwd(String id, String pwd) {
        Map<String, Object> param = new HashMap<>();
        param.put("id", id);
        param.put("pwd", pwd);
        return sqlSessionTemplate.selectOne("student.findByIdAndPwd", param);
    }
}
