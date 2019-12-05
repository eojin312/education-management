package hachi.user;

import java.util.List;

public interface UserRepository {
    List<User> selectAll();
}
