// for 반복문 
package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");

		int dan = sc.nextInt();

		// for (초기화값; 조건식; 증감식) { // 증감식뒤에 세미클론 없음 !
		// 조건식이 맞을 때 실행할 내용
		// }
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}

		sc.close();
	}
}
