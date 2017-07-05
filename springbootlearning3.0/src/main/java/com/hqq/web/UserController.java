package com.hqq.web;

import com.hqq.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * UserController
 * Created by heqianqian on 2017/7/3.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    static Map<Integer,User> userMap = Collections.synchronizedMap(new HashMap<Integer, User>());

    /**
     * 获取所有用户信息
     * @return List<User>
     */
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<User> listUsers(){
        List<User> userList = new ArrayList<User>(userMap.values());
        return userList;
    }

    /**
     * 保存用户信息
     * @param user 用户
     * @return 成功/失败
     */
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String saveUser(@ModelAttribute User user){
        userMap.put(user.getId(),user);
        return "success";
    }

    /**
     * 获取用户信息
     * @param id 用户id
     * @return User
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable("id") Integer id){
        return userMap.get(id);
    }

    /**
     * 更新用户信息
     * @param id 用户id
     * @param user 用户信息
     * @return 成功/失败
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public String updateUser(@PathVariable("id") Integer id,@ModelAttribute User user){
        User u = userMap.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        userMap.put(id,u);
        return "success";
    }

    /**
     * 删除用户信息
     * @param id 用户id
     * @return 成功/失败
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable("id")Integer id){
        userMap.remove(id);
        return "success";
    }

}
