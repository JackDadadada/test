package com.jt.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jt.manage.service.ItemService;
import com.jt.manage.vo.EasyUI_Data;

@Controller
@RequestMapping("/item")
public class ItemController {
	@Autowired
	private ItemService itemService;
	@RequestMapping("/query")
	@ResponseBody
	public EasyUI_Data findItenByPage(Integer page,Integer rows) {
		return itemService.findItemByPage(page,rows);
	}
}
