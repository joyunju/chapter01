//반복문 break, continue 비교
package com.javaex.ex04;

public class Ex10 {
	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				break;
				// continue;
			}
			System.out.println(i);
		}
	}
}

// continue; --> 결과값 6만 안나오고 계속 반복문이 돌고 종료 