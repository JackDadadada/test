package com.jt.manage.service;

import com.jt.manage.vo.EasyUI_Data;

public interface ItemService {

	EasyUI_Data findItemByPage(Integer page, Integer rows);
	
}
