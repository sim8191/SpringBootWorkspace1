package com.kh.menu.model.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.menu.model.dto.MenuDto;
import com.kh.menu.model.dto.MenuDto.MenuPost;
import com.kh.menu.model.dto.MenuDto.MenuPut;
import com.kh.menu.model.vo.Menu;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MenuDao {
	
	private final SqlSessionTemplate session;
	 
	public List<Menu> selectMenus(HashMap<String, Object> parm) {
		List<Menu> list = session.selectList("menuMapper.selectMenus", parm);
		
		return list;
	}

	public int insertMenus(MenuPost menu) {
		// TODO Auto-generated method stub
		return session.insert("menuMapper.insertMenus", menu);
	}

	public Menu menuDetail(long id) {
		// TODO Auto-generated method stub
		return session.selectOne("menuMapper.menuDetail", id);
	}

	public int updateMenu(MenuPut menu) {
		return session.update("menuMapper.updateMenu", menu);
	}

	public int deleteMenu(long id) {
		// TODO Auto-generated method stub
		return session.delete("menuMapper.deleteMenu", id);
	} 

}
