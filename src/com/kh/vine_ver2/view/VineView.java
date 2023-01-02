package com.kh.vine_ver2.view;

import java.util.List;
import java.util.Scanner;

import com.kh.vine_ver2.model.vo.Vine;

public class VineView {
	Scanner sc = new Scanner(System.in);
	
	public int printMenu() {
		System.out.println(" ~~~~~@~~~ VineWine 예약 프로그램 ~~~@~~~~~ ");
		System.out.println("1. 예약 요청");
		System.out.println("2. 예약 인원 변경");
		System.out.println("3. 예약 일시 변경");
		System.out.println("4. 전화번호로 예약 확인");
		System.out.println("5. 예약자 이름으로 예약 확인");
		System.out.println("6. 예약 취소");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴를 선택해주세요 >>>> ");
		int input = sc.nextInt();
		return input;	
	}
	
	public Vine makeWine() {
		System.out.println(" ~~~@~~~ VineWine 예약 요청 페이지 ~~~@~~~ ");
		System.out.print("@ 예약자 이름 : ");
		String wineName = sc.next();
		System.out.println("@ 전화번호");
		System.out.print("(번호만 입력해주세요 ex.01012345678)");
		String winePhone = sc.next();
		System.out.print("@ 이메일 : ");
		String wineEmail = sc.next();
		System.out.print("@ 희망 날짜 : ");
		String wineDate = sc.next();
		System.out.print("@ 희망 시간 : ");
		String wineTime = sc.next();
		System.out.print("@ 예약 인원수 : ");
		int number = sc.nextInt();
		
		Vine vine = new Vine(wineName,winePhone,wineEmail,wineDate,wineTime,number);
		return vine;
	}
	
	public String inputPhone(String msg) {
		System.out.println(msg + "할 예약자 전화번호를 입력해주세요.");
		System.out.print("(번호만 입력 ex.01012345678) >>> ");
		String winePhone = sc.next();
		return winePhone;
	}
	
	public String inputName(String msg) {
		System.out.print(msg + "할 예약자 이름을 입력해주세요. >> ");
		String wineName = sc.next();
		return wineName;	
	}
	
	public void showOne(Vine vine) {
		System.out.println(" ~~~@~~~ 예약 현황 확인 ~~~@~~~ ");
		System.out.println("예약자 이름 : " + vine.getWineName());
		System.out.println("전화번호 : " + vine.getWinePhone());
		System.out.println("이메일 : " + vine.getWineEmail());
		System.out.println("예약 날짜 : " + vine.getWineDate());
		System.out.println("예약 시간 : " + vine.getWineTime());
		System.out.println("인원수 : " + vine.getNumber());
		System.out.println("예약 요청일 : " + vine.getWineSettime());
		System.out.println("취소 여부 : " + vine.getWineCancel());
		System.out.println(" VineWine에 예약해주셔서 감사합니다. 예약일에 뵙겠습니다!");
		System.out.println();
		
	}
	
	public void showAll(List<Vine> vines) {
		System.out.println( " ~~~@~~~ 예약 현황 확인 ~~~@~~~ ");
		for(Vine vOne : vines) {
			System.out.println("예약자 이름 : " + vOne.getWineName());
			System.out.println("전화번호 : " + vOne.getWinePhone());
			System.out.println("이메일 : " + vOne.getWineEmail());
			System.out.println("예약 날짜 : " + vOne.getWineDate());
			System.out.println("예약 시간 : " + vOne.getWineTime());
			System.out.println("인원수 : " + vOne.getNumber());
			System.out.println("예약 요청일 : " + vOne.getWineSettime());
			System.out.println("취소 여부 : " + vOne.getWineCancel());
			System.out.println(" VineWine에 예약해주셔서 감사합니다. 예약일에 뵙겠습니다!");
			System.out.println();
		}
	}
	
	public Vine modifyVineNumber(String winePhone) {
		Vine vine = new Vine();
		vine.setWinePhone(winePhone);
		System.out.println(" ~~~ 예약 인원수 변경 ~~~ ");
		System.out.print("변경 인원수를 입력해주세요 >>> ");
		int number = sc.nextInt();
		vine.setNumber(number);
		return vine;
	}
	
	public Vine modifyDateTime(Vine vine) {
		System.out.println(" ~~~ 예약 일시 변경 ~~~ ");
		System.out.print("변경 날짜를 입력해주세요 >>> ");
		String wineDate = sc.next();
		System.out.print("변경 시간 입력해주세요 >>> ");
		String wineTime = sc.next();
		
		vine.setWineDate(wineDate);
		vine.setWineTime(wineTime);
		return vine;
	}
	
	
	public void displaySuccess(String msg) {
		System.out.println("[성공] : " + msg);
	}

	public void displayError(String msg) {
		System.out.println("[오류] : " + msg);
	}
	
	public void printMessage(String msg) {
		System.out.println(msg);
	}
	
	
	
	
	
	
	
	
	
}
