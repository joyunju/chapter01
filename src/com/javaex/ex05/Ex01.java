//배열
//Math.random() 로 정수값 생성하기
//int num = (int)(Math.random()*최대값)+최소값;
//예시 : 주사위 --> int num = (int)(Math.random()*6)+1

package com.javaex.ex05;

public class Ex01 {
	public static void main(String[] args) {

		// 0부터 0.9999.....사이 값만 나온
		double num = Math.random();
		System.out.println(num);
		
		//곱하기 10
		System.out.println("=====곱하기10=====");
		double num1 = Math.random()*10;
		System.out.println(num1);
		
		// 정수로 형변환하기
		System.out.println("=====정수로 형변환=====");
		int num2 = (int)(Math.random()*10);
		System.out.println(num2);
		
		// 정수로 형변환 --> 1부터 10까지 나오게
		System.out.println("=====1부터 10까지 나오게=====");
		int num3 = (int)(Math.random()*10)+1;
		System.out.println(num3);
		
		System.out.println("");
		//예제 문제 : 1~45 까지의 숫자중 임의의 6개의 숫자를 출력하세요
		//(중복체크는 하지 말 것
		System.out.println("=====미니 로또 만들기=====");
		int no1, no2, no3, no4, no5, no6;
		
		no1 = (int)(Math.random()*45)+1;
		no2 = (int)(Math.random()*45)+1;
		no3 = (int)(Math.random()*45)+1;
		no4 = (int)(Math.random()*45)+1;
		no5 = (int)(Math.random()*45)+1;
		no6 = (int)(Math.random()*45)+1;
		//출력 
		System.out.print(no1);
		System.out.print('\t'); // 하나씩 탭으로 띄기
		System.out.print(no2);
		System.out.print('\t');
		System.out.print(no3);
		System.out.print('\t');
		System.out.print(no4);
		System.out.print('\t');
		System.out.print(no5);
		System.out.print('\t');
		System.out.print(no6);
		
		//for문으로 가능한가?
		System.out.println("==========");
		
		
	}
}
