package hachi.education_management.exam.repository;

import hachi.education_management.exam.vo.ExamStudentApply;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ExamStudentApplyRepositoryImpl implements ExamStudentApplyRepository {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<ExamStudentApply> findByExamNoWithStudentNo() {
        return sqlSessionTemplate.selectList("exam.findByExamNoWithStudentNo");
    }
}
