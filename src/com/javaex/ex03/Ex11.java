//if-else if-else --> swith-case로 변경

package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바 2.C 3.C++ 4.파이썬)");
		System.out.print("과목번호 : ");
		
		int code = sc.nextInt();
		
		//code --> 1 2 3 4 5 99
		switch(code) {
			case 1:
//				변수값이 1 일 때 실행내용
				System.out.println("R101호");
				break;
				
			case 2:
				System.out.println("R202");
				break;
				
			case 3:
				System.out.println("R303");
				break;
				
			case 4:
				System.out.println("R404");
				break;
			default:
				System.out.println("상담원");
				break;
			
		}
		
		
		sc.close();
	}
}
