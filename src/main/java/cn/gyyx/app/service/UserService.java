package cn.gyyx.app.service;

import cn.gyyx.app.model.User;

import java.util.List;

/**
 * @Author : east.Fu
 * @Description :
 * @Date : Created in  2018/4/17 14:48
 */
public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
