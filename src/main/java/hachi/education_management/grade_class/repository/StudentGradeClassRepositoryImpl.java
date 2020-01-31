package hachi.education_management.grade_class.repository;

import hachi.education_management.grade_class.vo.GradeClassWithStudent;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 학년 반 repository 를 구현
 */
@Repository
public class StudentGradeClassRepositoryImpl implements StudentGradeClassRepository {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * 학생 + 학년 반 정보 추가 메소드
     *
     * @param studentNo    학생을 추가할때
     * @param gradeClassNo 이 학생이 어떤 학년 어떤 반인지 동시에 insert 하기 위한 파라미터
     * @return
     */
    @Override
    public int insert(long studentNo, long gradeClassNo) {

        Map<String, Object> params = new HashMap<>();
        params.put("studentNo", studentNo);
        params.put("gradeClassNo", gradeClassNo);

        return sqlSessionTemplate.insert("gradeClass.insertStduentGradeClass", params);
    }
}