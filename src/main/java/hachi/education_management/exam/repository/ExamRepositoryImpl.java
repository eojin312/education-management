package hachi.education_management.exam.repository;

import hachi.education_management.exam.model.Exam;
import hachi.education_management.exam.vo.ExamList;
import hachi.education_management.exam.vo.ExamDetail;
import hachi.education_management.exam.vo.ExamStudentApply;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ExamRepositoryImpl implements ExamRepository {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<ExamStudentApply> findByExamApplyAndStudent(long examStudentApplyNo) {
        return sqlSessionTemplate.selectList("exam.findByExamApplyAndStudent", examStudentApplyNo);
    }

    @Override
    public List<ExamList> findByExam(int grade) {
        return sqlSessionTemplate.selectList("exam.findByExam", grade);
    }

    @Override
    public List<ExamDetail> findByExamDeatilForStudent(int examNo) {
        return sqlSessionTemplate.selectList("exam.findByExamDeatilForStudent", examNo);
    }

    @Override
    public int insert(Exam exam) {
        return sqlSessionTemplate.insert("exam.insert", exam);
    }
}
