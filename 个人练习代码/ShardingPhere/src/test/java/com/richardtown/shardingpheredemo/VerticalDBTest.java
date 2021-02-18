package com.richardtown.shardingpheredemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.richardtown.shardingpheredemo.entity.User;
import com.richardtown.shardingpheredemo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author cuitao
 * @ className:
 * @ description:
 * @ create 2021-02-09 10:37
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class VerticalDBTest {
    @Autowired
    UserMapper userMapper;

    @Test
    /**
     * 添加
     */
    public void addUser(){
        User user = new User();
        user.setUserName("小红");
        user.setUserStatus("status1");
        userMapper.insert(user);
    }

    /**
     * 查询
     */
    @Test
    public void findUser(){
        QueryWrapper<User>queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id",565849633989853185L);
        User user= userMapper.selectOne(queryWrapper);
        System.out.println(user);
    }
}
