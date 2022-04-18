//for 반복문 연습문제(중첩 반복문)
//구구단을 출력하세요
package com.javaex.ex04;

public class Ex05 {
	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) {
			for (int x = 1; x < 10; x++) {
				System.out.println(i + "*" + x + "=" + (i * x));
			}
		}
	}
}
