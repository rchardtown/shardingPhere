package com.richardtown.shardingpheredemo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.richardtown.shardingpheredemo.entity.Udict;
import org.springframework.stereotype.Repository;

/**
 * @author cuitao
 * @ className:
 * @ description:
 * @ create 2021-02-09 11:21
 **/
@Repository
public interface PublicTableMapper extends BaseMapper<Udict> {
}
