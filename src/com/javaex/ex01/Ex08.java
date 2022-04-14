//대입연사자(=)와 산술연산자(+, -, *, /, %)

package com.javaex.ex01;

public class Ex08 {
	public static void main(String[] args) {

		// 대입연산자
		int a = 7;
		int b = 2;
		
		System.out.println("산술연산자");
		// 산술연산자
		System.out.println(a+b); //결과값 9
		System.out.println(a-b); //결과값 5
		System.out.println(a*b); //결과값 14
		System.out.println(a/b); //결과값 3
		System.out.println(a%b); //결과값 1 --> 7나누기 2 = 3.1... --> 나머지 값을 반환하니까
		
		// 산술 연산자 % 자세히
		System.out.println("산술연산자 / % 자세히");
		System.out.println("===========");
		System.out.println(7/2);       //결과값 3
		System.out.println(7.0/2.0);   //결과값 3.5
		System.out.println(7%2);       //결과값 1
		System.out.println(7.0%2.0);   //결과값 1.0
		System.out.println("========");
		
		//부호 연산자
		int var = -3;
		int pVar = +var; //현재 var 안에 있는 부호 그대로
		int mVar = -var; // 현재 var 안에 있는 부호 반대로
		
		System.out.println(var);  //결과값 3
		System.out.println(pVar); //결과값 -3 
		System.out.println(mVar);  //결과값 3
		

	}
}