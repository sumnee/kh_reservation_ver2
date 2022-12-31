package com.kh.vine_ver2.run;

import java.util.List;

import com.kh.vine_ver2.controller.VineController;
import com.kh.vine_ver2.model.vo.Vine;
import com.kh.vine_ver2.view.VineView;

public class VineRun {

	public static void main(String[] args) {
		VineView vView = new VineView();
		VineController vCon = new VineController();
		Vine vine = null;
		String winePhone = "";
		String wineName = "";
		int result = 0;
		List<Vine> vList = null;

		Exit: 
		while (true) {
		
			int input = vView.printMenu();
			switch (input) {
			case 1:
				// 예약 하기
				vine = vView.makeWine();
				result = vCon.makeWine(vine);
				if (result > 0) {
					vView.displaySuccess("예약 요청 완료! 감사합니다.");
				} else {
					vView.displayError("예약 요청 실패, 계속 오류 발생 시 전화문의 부탁드립니다.");
				}
				break;
				
			case 2:
				// 예약 인원 변경하기 (번호로)
				winePhone = vView.inputPhone("인원을 변경");
				vine = vCon.printByPhone(winePhone);
				if(winePhone != null) {
					vine = vView.modifyVineNumber(vine);
					vCon.modifyNumber(vine);
				} else {
					vView.displayError("해당 번호의 예약이 없습니다.");
				}
				break;
				
			case 3:
				// 예약 일시 변경하기 (번호로)
				winePhone = vView.inputPhone("날짜, 시간을 변경");
				vine = vCon.printByPhone(winePhone);
				if(winePhone != null) {
					vine = vView.modifyDateTime(vine);
					vCon.modifyDate(vine);
				} else {
					vView.displayError("해당 번호의 예약이 없습니다.");
				}
				break;
				
			case 4:
				// 예약 현황 확인 (번호로)
				winePhone = vView.inputPhone("조회");
				vine = vCon.printByPhone(winePhone);
				if(vine != null) {
					vView.showOne(vine);
				} else {
					vView.displayError("해당 번호의 예약이 없습니다. 재확인 부탁드립니다.");
				}
				break;
				
			case 5:
				// 예약 현황 확인 (이름으로)
				wineName = vView.inputName("조회");
				vList = vCon.printByName(wineName);
				if(!vList.isEmpty()) {
					vView.showAll(vList);
				} else {
					vView.displayError("해당 이름의 예약이 없습니다. 재확인 부탁드립니다.");
				}
				break;
				
			case 6:
				// 예약 취소 하기 (번호로)
				winePhone = vView.inputPhone("취소");
				result = vCon.removeWine(winePhone);
				if(result > 0) {
					vView.displaySuccess("예약 취소 완료");
				} else {
					vView.displayError("예약 취소 실패, 계속 오류 시 가게로 전화 부탁드립니다.");
				}
				break;
				
			case 0:
				// 종료
				vView.printMessage("[프로그램을 종료] VineWine 예약 프로그램에 방문해주셔서 감사합니다.");
				break Exit;

			default:
				vView.printMessage("1~6번 메뉴를 선택해주세요.");
				break;
			}

		}
	}

}
