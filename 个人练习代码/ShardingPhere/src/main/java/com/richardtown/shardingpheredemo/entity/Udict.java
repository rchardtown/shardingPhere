package com.richardtown.shardingpheredemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author cuitao
 * @ className:
 * @ description:
 * @ create 2021-02-09 11:17
 **/
@Data
@TableName(value = "t_udict")
public class Udict {
    private Long idctid;
    private Long ustatus;
    private String uvalue;
}
