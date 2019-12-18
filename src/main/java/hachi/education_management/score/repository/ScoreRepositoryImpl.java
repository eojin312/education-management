package hachi.education_management.score.repository;

import hachi.education_management.score.vo.ScoreWithStudent;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ScoreRepositoryImpl implements ScoreRepository {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<ScoreWithStudent> selectByScoreNoWithStudentNo() {
        return sqlSessionTemplate.selectList("score.selectByScoreNoWithStudentNo");
    }
}
