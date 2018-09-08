/* Connection to Database */

package me.wasin.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserADO implements UserADOInterface {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User getUserById (int user_id) {
        String sql = "SELECT id, name, surname FROM users WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new UserRowMapper(), user_id);
    }

    @Override
    public List<User> getAllUser () {
        String sql = "SELECT id, name, surname FROM users";
        return jdbcTemplate.query(sql, new UserRowMapper());
    }

}
