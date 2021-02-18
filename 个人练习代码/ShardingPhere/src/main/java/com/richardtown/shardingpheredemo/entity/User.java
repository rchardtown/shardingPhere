package com.richardtown.shardingpheredemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author cuitao
 * @ className:
 * @ description:
 * @ create 2021-02-09 10:18
 **/
@Data
//在使用MyBatisPlus 时，如果实体类名称和数据库名称不匹配，要注解@TableName来关联二者
@TableName(value = "t_user")
public class User {
    private Long userId;
    private String userName;
    private String userStatus;
}
