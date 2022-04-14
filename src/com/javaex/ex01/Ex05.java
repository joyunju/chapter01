//상수(Constant)
package com.javaex.ex01;

public class Ex05 {
	public static void main(String[] args) {
		
		//일반적인 방식
		double pi = 3.14;
		//결과 값이 소수점으로 나올 예정이니까 double
		double result01 = pi*5*5;
		
		System.out.println(result01);
		
		//pi값이 변경되는 경우
		pi = 3.1415926;
		double result02 = pi*5*5;
		
		System.out.println(result02);
		
		//보통 변수의 이름을 소문자로 적지만 변경될 수 없는 고정하고 싶은 데이터는 대문자로 작성한다.
		//상수로 정의할 경우
		// ex) final double PI = 3.14;
		
		final double PI = 3.14;
		double result03 = PI*5*5;
		System.out.println(result03);
		
		//상수의 값을 변경할려고 할 때
		// 아래는 오류가 나는 것이 맞음
		// 위에서 PI의 값을 고정시켜서 바꿀 수 없음
		/*
		PI = 3.1415926;
		double result04 = PI*5*5;
		System.out.println(result04);
		*/
		
		
		
		
	}
}
