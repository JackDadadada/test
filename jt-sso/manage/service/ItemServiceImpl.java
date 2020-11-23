package com.jt.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.common.po.Item;
import com.jt.manage.mapper.ItemMapper;
import com.jt.manage.vo.EasyUI_Data;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemMapper itemMapper;

	@Override
	public EasyUI_Data findItemByPage(Integer page, Integer rows) {
		int total=itemMapper.findCount();
		//int start=(page-1)*rows;
		int start = (page - 1) * rows;
		List<Item>itemList=itemMapper.findItemByPage(start,rows);		
		
		return new EasyUI_Data(total,itemList);
	}
}
