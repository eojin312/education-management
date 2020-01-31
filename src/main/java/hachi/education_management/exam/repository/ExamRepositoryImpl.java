package hachi.education_management.exam.repository;

import hachi.education_management.exam.model.Exam;
import hachi.education_management.exam.vo.ExamList;
import hachi.education_management.exam.vo.ExamDetail;
import hachi.education_management.exam.vo.ExamStudentApply;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 시험 repository 구현
 */
@Repository
public class ExamRepositoryImpl implements ExamRepository {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<ExamStudentApply> findExamApplyListByStudentApplyNo(long examStudentApplyNo) {
        return sqlSessionTemplate.selectList("exam.findExamApplyListByStudentApplyNo", examStudentApplyNo);
    }

    @Override
    public List<ExamList> findExamListByGradeNo(int gradeNo) {
        return sqlSessionTemplate.selectList("exam.findExamListByGradeNo", gradeNo);
    }

    @Override
    public List<ExamDetail> findExamDeatilByExamNo(int examNo) {
        return sqlSessionTemplate.selectList("exam.findExamDeatilByExamNo", examNo);
    }

    @Override
    public int insert(Exam exam) {
        return sqlSessionTemplate.insert("exam.insert", exam);
    }
}
