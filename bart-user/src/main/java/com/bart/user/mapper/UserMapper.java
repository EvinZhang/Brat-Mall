package com.bart.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bart.user.entity.BartMallUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<BartMallUser> {

    @Select("select * from bart_mall_user")
    List<BartMallUser> getAllBartMallUsers();

}
