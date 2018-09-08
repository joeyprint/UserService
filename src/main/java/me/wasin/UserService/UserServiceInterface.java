package me.wasin.UserService;

import java.util.List;

public interface UserServiceInterface {

    User getUserById(int user_id);
    List<User> getAllUser ();

}
