package com.kh.vine_ver2.controller;

import java.util.List;

import com.kh.vine_ver2.model.dao.VineDAO;
import com.kh.vine_ver2.model.vo.Vine;

public class VineController {
	
	/** 
	 * 예약 입력
	 * @param vine
	 * @return
	 */
	public int makeWine(Vine vine) {
		VineDAO vDao = new VineDAO();
		int result = vDao.inputInfo(vine);
		return result;	
	}
	
	/**
	 * 전화번호로 조회
	 * @param winePhone
	 * @return
	 */
	public Vine printByPhone(String winePhone) {
		VineDAO vDao = new VineDAO();
		Vine vine = vDao.selectByPhone(winePhone);
		return vine;
	}
	
	/**
	 * 이름으로 조회(중복허용)
	 */
	public List<Vine> printByName(String wineName) {
		VineDAO vDao = new VineDAO();
		List<Vine> vList = vDao.selectByName(wineName);
		return vList;
		
	}

}
