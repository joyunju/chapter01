//형변환
package com.javaex.ex01;

public class Ex06 {
	public static void main(String[] args) {
		
		System.out.println(2+3.5);
		
		//자동 형변환
		double var01 = 2+3.5; //2 --> 2.0욿 자동 변환되어 계산진행
		System.out.println(var01);
		
		//자동 형변환
//		long -> 정수형
		long var02 = 12345L;
		//float -> 실수형
		float var03 = 1.1F;
		
		System.out.println(var02 + var03);
		
		float result = var02 + var03;
		// float을 사용했기 때문에 long var02에 담긴 12345가 -> 실수(소수점이 있는 ) 12345.0으로 변환되어 계산이 된다.
		System.out.println(result);
		
		
	}
}
