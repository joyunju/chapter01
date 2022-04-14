//콘솔입력: Scanner
//Scanner 클래스는 다양한 리소스를 대상으로 입력을 받을 수 있도록 정의된 클래스이다.


package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		//↓ 아래 오류는 무조건 나는데, 이때 왼쪽 오류 표시를 누르고 import
		Scanner sc = new Scanner(System.in);
		//System.in : 키보드 연결
		
		int num = sc.nextInt();  // <-- 키보드 입력값
		System.out.println("입력하신 숫자는 " + num + "입니다.");

		sc.close();
	}
}
