package com.richardtown.shardingpheredemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.richardtown.shardingpheredemo.entity.Course;
import com.richardtown.shardingpheredemo.entity.Student;
import org.springframework.stereotype.Repository;

/**
 * @author cuitao
 * @ className:
 * @ description:
 * @ create 2021-02-08 14:42
 **/
@Repository
public interface StudentMapper extends BaseMapper<Student> {
}
