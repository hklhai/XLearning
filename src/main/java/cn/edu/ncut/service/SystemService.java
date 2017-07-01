package cn.edu.ncut.service;

import cn.edu.ncut.dao.UserDao;
import cn.edu.ncut.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Ocean lin on 2017/7/1.
 */
@Transactional
@Service
public class SystemService {

    @Autowired private UserDao userDao;

    public User findUserById(String name)
    {
        return userDao.findUserById(name);
    }


}
