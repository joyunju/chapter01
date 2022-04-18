//숫자를 입력받아 입력한 숫자(단)의 구구단을 출력하세요
package com.javaex.ex04;

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
	
		int dan = sc.nextInt();
		int i = 1;    //초기값 
		
		while(i<=9) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
			i++;   //i=i+1; 이라는 증감식 
		}
		
		sc.close();
	}
}
