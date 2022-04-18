//for 반복문 연습문제
//1부터 10까지의 합을 구하는 프로그램을 작성하세요
package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 10까지의 합을 구하는 프로그램");
		System.out.print("n의 값：");
		int n = sc.nextInt(); // 키보드 입력 값 중 정숫값 얻어내기
		
		int sum = 0;
		
		for(int i = 1; i<=n; i++) {
			//sum += i;  //sum에 i를 더합니다.
			sum = sum + i;
			System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		}
		
		
		sc.close();
	}
}
