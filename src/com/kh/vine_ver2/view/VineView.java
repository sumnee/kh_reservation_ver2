package com.kh.vine_ver2.view;

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

}
