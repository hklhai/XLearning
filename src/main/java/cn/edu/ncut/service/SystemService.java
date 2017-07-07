package cn.edu.ncut.service;

import cn.edu.ncut.repository.UserRepository;
import cn.edu.ncut.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ocean lin on 2017/7/1.
 */
@Service("systemService")
public class SystemService {

    @Autowired
    private UserRepository userDao;

    public User findUserById(String name)
    {
        return userDao.findUserById(name);
    }


}
