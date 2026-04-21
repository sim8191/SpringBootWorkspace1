package com.kh.menu.model.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.stereotype.Service;

import com.kh.menu.model.dao.MenuDao;
import com.kh.menu.model.dto.MenuDto;
import com.kh.menu.model.dto.MenuDto.MenuPost;
import com.kh.menu.model.dto.MenuDto.MenuPut;
import com.kh.menu.model.vo.Menu;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MenuService {
	
	private final MenuDao dao;
	
	public List<Menu> selectMenus(HashMap<String, Object> parm) {
		// TODO Auto-generated method stub
		return dao.selectMenus(parm);
	}

	public int insertMenus(MenuPost menu) {
		// TODO Auto-generated method stub
		return dao.insertMenus(menu);
	}

	public Menu menuDetail(long id) {
		// TODO Auto-generated method stub
		return dao.menuDetail(id);
	}

	public int updateMenu(MenuPut menu) {
		// TODO Auto-generated method stub
		return dao.updateMenu(menu);
	}

	public int deleteMenu(long id) throws NotFoundException{
		// TODO Auto-generated method stub
		int result = dao.deleteMenu(id);
		if(result == 0) throw new NotFoundException("삭제 할게 없음");
		return result;
	} 

}
