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
		
		/////////////////////////////////////////
		//강제 형변환
		float var04 = 1111.2345f;
		//int var05 = var04; -> var 05는 int형, var04는 float 형이라서들어갈 수 없음
		//강제 변환 하기 위해 선언한 변수 앞에 자료형을 지정해주어야함
		int var05 = (int)var04;
		//결과값에 소수점이 버려지고 나옴
		System.out.println(var05);
		
		
		//축소 변환
		//int (4byte) -> byte(1byte)로 변환하면 더 작은 크기의 자료형에 값을 저장하면 자료를 잃을 가능성이 있음
		// ↓ 앞에 3칸이 날라갔지만, 원래 맨 뒤만 써서 운이 좋아서 자료가 안날라가는 경우
		int v01 = 10;
		byte v02 = (byte)v01;
		System.out.println(v02);
		
		//축소변환 문제 생긴 경우
		//int (4byte) -> byte(1byte)로 변환
		int v03 = 203029770;
		byte v04 = (byte) v03;
		System.out.println(v04);
		
		//확대 변환
		byte v05 = 10;
		int v06 = (int)v05;
		System.out.println(v06);
		
		//실수 -> 정수
		double v07 = 5.57;
		int v08 = (int)v07;
		System.out.println(v08);
		
		//정수 --> 실수(소수점)
		int v09 = 7;
		double v10 = (double)v09;
		System.out.println(v10);
		
		//단축키
		//*****sysout 치고 ctrl + space하면 아래자동완성 됨******
		//System.out.println();
		//줄삭제 ctrl + d
		
	}
}
