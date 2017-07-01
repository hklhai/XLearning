package cn.edu.ncut.dao;

import cn.edu.ncut.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2017/7/1.
 */
@Repository
public interface UserDao extends JpaRepository<User,Long> {

    @Query("select u from user u where u.name=:name")
    User findUserById(@Param("name") String name);
}
