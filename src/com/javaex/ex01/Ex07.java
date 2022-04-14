//형변환 연습문제
package com.javaex.ex01;

public class Ex07 {
	public static void main(String[] args) {
		
		//double --> 실수(소수점)  / int --> 정수
		
		double v01 = 5/4; // 정수 나누기 정수는 정수가 나온다.
		System.out.println(v01); //결과값 1.0
		//결과값이 왜 1.25가 아닌 1.0일까?
		// 이유 : java에서는 정수 연산을 기본으로 int로 처리하기때문에
		//5나누기4를 정수로 인식해 소수점을 날리고 1이 나왔지만,
		//이 값을 v01이라는 double 실수(소수점) 상자에 넣었기 때문에 1.0으로 결과값 도출
		//만약 둘 중 하나의 값이 실수라면?
		// ㄴ ex) double v01 = 5.0/4; --> 결과값은 1.25
		
		double v02 = (double)5/4; //결과값 1.25
		System.out.println(v02);
		
		double v03 = 5 / (double)4; //결과값 1.25
		System.out.println(v03);
		
		double v04 = (double)5 / (double)4; //결과값 1.25
		System.out.println(v04);
		
		int v05 = (int)1.3 + (int)1.8;
		//int v05 = 정수니까 1 + 정수니까 1 --> 그래서 1+1=2 --> int인 2를 int v05에 넣으니까 결과값이 2!!
		System.out.println(v05); //결과값 2
		
	}
}
