package me.wasin.UserService;

import java.util.List;

public interface UserADOInterface {

    User getUserById (int user_id);
    List<User> getAllUser();

}
