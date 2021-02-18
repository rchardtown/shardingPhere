package com.richardtown.shardingpheredemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.richardtown.shardingpheredemo.entity.Student;
import com.richardtown.shardingpheredemo.mapper.StudentMapper;
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
 * @ create 2021-02-08 17:18
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ShardingJdbcSeprateDBAndTable {
    @Autowired
    private StudentMapper studentMapper;

    //添加操作
    @Test
    public void addStudent() {

        Student student = new Student();
        student.setCname("javademo");
        //分库根据 user_id
        student.setUserId(111L);
        student.setCstatus("Normal2");
        studentMapper.insert(student);

    }

    //查询操作
    @Test
    public void quereyStudent() {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", 111L);
        queryWrapper.eq("cid", 565838868767571969L);
        Student student = studentMapper.selectOne(queryWrapper);
        log.info("student",student);
    }
}
