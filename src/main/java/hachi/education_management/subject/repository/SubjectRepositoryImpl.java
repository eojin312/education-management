package hachi.education_management.subject.repository;

import hachi.education_management.subject.model.Subject;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class SubjectRepositoryImpl implements SubjectRepository {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;


    @Override
    public Subject findBySubjectNo(int subjectNo) {
        return sqlSessionTemplate.selectOne("subject.findBySubjectNo", subjectNo);
    }

    @Override
    public List<Subject> findListBySubjectNoList(List subjectNoList) {
        Map<String, Object> param = new HashMap<>();
        param.put("subjectNoList", subjectNoList);
        return sqlSessionTemplate.selectList("subject.findListBySubjectNoList", param);
    }
}
