package com.kh.vine_ver2.run;

import com.kh.vine_ver2.controller.VineController;
import com.kh.vine_ver2.model.vo.Vine;
import com.kh.vine_ver2.view.VineView;

public class VineRun {
	
	public static void main(String []args) {
		VineView vView = new VineView();
		VineController vCon = new VineController();
		Vine vine = null;
		int result = 0;
		
		Exit :
		while(true) {
			int input = vView.printMenu();
			switch(input) {
			case 1 : 
			//예약 하기
			vine = vView.makeWine();
			result = vCon.makeWine(vine);
			if(result > 0) {
				
			} else {
				
			}
			break;
			case 2 : 
			//예약 인원 변경하기 (번호로)
			break;
			case 3 : 
			//예약 일시 변경하기 (번호로)
			break;
			case 4 : 
			//예약 현황 확인 (번호로)
			break;
			case 5 : 
			//예약 현황 확인 (이름으로)
			break;
			case 6 : 
			//예약 취소 하기 (번호로)		
			break;
			case 0 : 
			//종료
				
			break Exit;
			
			default :
				
				break;
				
			}
		
		}
	}

}
