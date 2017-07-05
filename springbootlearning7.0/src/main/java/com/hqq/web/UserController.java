package com.hqq.web;

import com.hqq.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * UserController
 * Created by heqianqian on 2017/7/4.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    static Map<Integer, User> userMap = Collections.synchronizedMap(new HashMap<Integer, User>());

    /**
     * 获取所有用户信息
     *
     * @return List<User>
     */
    @ApiOperation(value = "获取所有用户信息", notes = "")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> listUsers() {
        List<User> userList = new ArrayList<User>(userMap.values());
        return userList;
    }

    /**
     * 保存用户信息
     *
     * @param user 用户
     * @return 成功/失败
     */
    @ApiOperation(value = "保存用户信息", notes = "")
    @ApiImplicitParam(name = "user", value = "用户实体User", required = true, dataType = "User")
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String saveUser(@RequestBody User user) {
        userMap.put(user.getId(), user);
        return "success";
    }

    /**
     * 获取用户信息
     *
     * @param id 用户id
     * @return User
     */
    @ApiOperation(value = "获取用户信息", notes = "根据ID查询用户信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") int id) {
        return userMap.get(id);
    }

    /**
     * 更新用户信息
     *
     * @param id   用户id
     * @param user 用户信息
     * @return 成功/失败
     */
    @ApiOperation(value = "更新用户信息", notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "user", value = "用户实体类", required = true, dataType = "User")
    })
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateUser(@PathVariable("id") int id, @RequestBody User user) {
        User u = userMap.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        userMap.put(id, u);
        return "success";
    }

    /**
     * 删除用户信息
     *
     * @param id 用户id
     * @return 成功/失败
     */
    @ApiOperation(value = "删除用户信息", notes = "")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable("id") int id) {
        userMap.remove(id);
        return "success";
    }

}
