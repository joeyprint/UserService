package me.wasin.UserService;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {


    @Override
    public User mapRow(ResultSet rs, int i) throws SQLException {
        int userId = rs.getInt("id");
        String name = rs.getString("name");
        String surname = rs.getString("surname");

        User user = new User(userId, name, surname);
        return user;
    }
}
