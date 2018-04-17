package cn.gyyx.app.web;

import cn.gyyx.app.model.User;
import cn.gyyx.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : east.Fu
 * @Description :
 * @Date : Created in  2018/4/17 14:55
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add")
    public int addUser(User user){
        return userService.addUser(user);
    }

    @RequestMapping(value = "/all/{pageNum}/{pageSize}")
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }
}
