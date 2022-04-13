/*
작성자 : ZZOO
작성 날짜 : 2022-04-13
프로그램 설명 : 나이기록 프로그램 
*/
package com.javaex.ex01;

public class Ex01 {
	public static void main(String[] args) {
		
		//변수 선언과 초기화를 동시에 
		int myAge = 25;
		/*
		int myAge; //변수선언 
		myAge = 25; //초기화 
		*/
		//화면에 메모리의 값을 출력하는 메소드
		System.out.println(myAge);
		
		myAge = 26;
		System.out.println(myAge);

		byte no;
		no = -128;
		System.out.println(no);
		
		long no2;
		//long형을 작성할 때는 숫자 맨 뒤에 'L'을 써야한다.
		//하지만 int 범위까지는'L'을 쓰지 않아도 된다.
		no2 = 922337203685477580L;
		System.out.println(no2);
		
		//변수선언, 초기화
		
		//변수 여러개일 때 선언 후 초기화 
		int var01;
		int var02;
		int var03;
		
		var01 = 10;
		var02 = 20;
		var03 = 30;
		
		// 변수 여러개 일떄, 변수 + 초기화 
		int var04 = 10;
		int var05 = 20;
		int var06 = 30;
		// int var04=10, int var05=20, int var06=30;
		
		System.out.println(var04);
		//위에 노란 표시는 왜 변수 선언하고 사용을 하지 않냐는 것을 물어보는 표시
		
	}
}
