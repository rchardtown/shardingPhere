package com.richardtown.shardingpheredemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.richardtown.shardingpheredemo.entity.Course;
import com.richardtown.shardingpheredemo.mapper.CourseMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class ShardingJdbcSeperateTable {
    @Autowired
    private CourseMapper courseMapper;

    //添加课程的方法
    @Test
    public void addCourse() {
        for(int i=1;i<=100;i++) {
            Course course = new Course();
            course.setCname("java"+i);
            course.setUserId(100L);
            course.setCstatus("Normal"+i);
            courseMapper.insert(course);
        }
    }
    //查询课程的方法
    @Test
    public void findCourse() {
        QueryWrapper<Course>wrapper = new QueryWrapper<>();
        wrapper.eq("cid",565566794123706368L);
        Course course = courseMapper.selectOne(wrapper);
        log.info("course:{}",course);
    }
}
