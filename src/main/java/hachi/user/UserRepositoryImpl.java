package hachi.user;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    @Qualifier("mysqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<User> selectAll() {
        List<User> userList = sqlSessionTemplate.selectList("selectAll");
        return userList;
    }
}