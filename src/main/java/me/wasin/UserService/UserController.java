package me.wasin.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceInterface userService;

    //Get List User
    @RequestMapping(value = "/allusers", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUser();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }

    //Get By ID
    @RequestMapping(value = "/user/{id:[\\d]}", method = RequestMethod.GET) // [\\d] is Regular Expression (Decimal)
    public ResponseEntity<User> getUser(@PathVariable(name = "id") int id) {
        User user = userService.getUserById(id);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

}
