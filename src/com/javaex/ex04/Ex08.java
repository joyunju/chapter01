//for반복문 vs while반복문
//반복의 횟수를 알 수 없을 때 while 반복문
//반복의 횟수를 알 수 있을 때 for 반복문

package com.javaex.ex04;

public class Ex08 {
	public static void main(String[] args) {

		// 문제 : 6의 배수이자 14의 배수인 가장 적은 정수 찾기
		int i = 1;

		while (true) {

			if (i % 6 == 0 && i % 14 == 0) {
				// if문이 true
				System.out.println(i);
				break;
			} else {
				i++;
			}
		}

	}

}
