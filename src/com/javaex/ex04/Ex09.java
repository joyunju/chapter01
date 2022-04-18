//숫자를 입력받아 3의 배수인지 판별하는 프로그램 
//0이 입력되면 프로그램이 종료됩니다.

package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();

		while (true) {
			if (num == 0) {
				System.out.println("종료");
				break;
			} else if (num % 3 == 0) {
				System.out.println("3의 배수입니다.");
				break;
			} else {
				System.out.println("3의 배수가 아닙니다");
				break;
			}
		}

		sc.close();

	}

}
