package com.kh.vine_ver2.controller;

import com.kh.vine_ver2.model.dao.VineDAO;
import com.kh.vine_ver2.model.vo.Vine;

public class VineController {
	
	public int makeWine(Vine vine) {
		VineDAO vDao = new VineDAO();
		int result = vDao.inputInfo(vine);
		return result;	
	}
	
	
	

}
