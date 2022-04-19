//do~while 반복문
//사용자의 숫자를 입력받아 더하는 프로그램을 작성하세요(0이면 종료)
package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요. [0이면 종료]");

		int num;
		int sum = 0; // 합계

		// System.out.println("======do-while========");

//		do {
//			num = sc.nextInt(); // 입력받은값
//			sum = sum + num;
//			System.out.println("합계:" + sum);
//		} while (num != 0);

		System.out.println("=====while========");

		while (true) {
			num = sc.nextInt(); // 입력받은값
			sum = sum + num;
			System.out.println("합계:" + sum);
			if (num == 0) {
				break;
			}

		}

		System.out.println("종료");

		sc.close();
	}
}

// do- while 문은 반복문이 실행되기 전에 먼저 한번 실행하고 while문
