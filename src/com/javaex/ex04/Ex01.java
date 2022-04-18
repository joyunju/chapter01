//while 반복문
package com.javaex.ex04;

public class Ex01 {
	public static void main(String[] args) {
		
		// while 반복문 문법
		// int i = 0; --> 초기화
		// while(조건식) { --> 반복 조건 작성 
		// 조건식이 true 면 실행되는 영역  --> 반복 영역 
		// i ++; --> 증감식 ( 탈출 조건)
		// }
		
		int i = 0;
		
		while(i<=5) {  // 6이되면 조건식이 false이 되어 멈춤 
			System.out.println("I like java" + i);
			i++;   //i=i+1;
		}
		
	}
}
