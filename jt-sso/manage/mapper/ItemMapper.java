package com.jt.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jt.common.po.Item;

public interface ItemMapper {
	@Select("select count(*)from tb_item")
	int findCount();

	List<Item> findItemByPage(@Param("start")Integer start,@Param("rows")Integer rows);
	
}
