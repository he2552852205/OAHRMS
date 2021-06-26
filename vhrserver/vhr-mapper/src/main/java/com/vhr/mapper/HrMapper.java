package com.vhr.mapper;

import com.vhr.model.Hr;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HrMapper {

    Hr loadUserByUsername(String username);
}
