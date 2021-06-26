package com.vhr.mapper;

import java.util.List;
import com.vhr.model.Menu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper {


    List<Menu> getAllMenus();
}
