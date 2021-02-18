package com.richardtown.shardingpheredemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.richardtown.shardingpheredemo.entity.Udict;
import com.richardtown.shardingpheredemo.mapper.PublicTableMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author cuitao
 * @ className:
 * @ description:
 * @ create 2021-02-09 11:16
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class PublicTable {
    //操作公共表时，一顿增加，会广播到所有库中的公共表都添加，
    //       一顿删除，会广播到所有的库中的公共表都删除
    //       一顿更新，会广播到所有的库中的公共表都更新
    @Autowired
    private PublicTableMapper publicTableMapper;

    /**
     * 新增
     */
    @Test
    public void addPubicTableData() {
        Udict udict = new Udict();
        udict.setUstatus(1L);
        udict.setUvalue("启用");
        publicTableMapper.insert(udict);
    }

    /**
     * 更新
     */
    @Test
    public void updatePublicTableData() {
        //将所有 ustatus 为 1 的，userValue 改为 “禁用”
        Udict udict = new Udict();
        udict.setUvalue("禁用");
        QueryWrapper<Udict> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("ustatus", 1L);
        publicTableMapper.update(udict, queryWrapper);
    }

    /**
     * 删除
     */
    @Test
    public void delPublicTableData(){
        QueryWrapper<Udict>queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("ustatus",1L);
        publicTableMapper.delete(queryWrapper);
    }

    /**
     * 查询时，会随机的到对应一个库中国的公共表  t_udict 中去查
     */
    @Test
    public void finadPublicTableData(){

        for (int i = 0; i < 10; i++) {
            QueryWrapper<Udict>queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("idctid",565884634462683137L);
            Udict udict = publicTableMapper.selectOne(queryWrapper);
            System.out.println(udict);
        }

    }
}
