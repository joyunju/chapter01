//if–else if–else 조건문
//점수를 입력받아 등급을 표시하는 프로그램 

package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		
		int point = sc.nextInt();
		
		if(point>=90) {
			System.out.println("A등급");
		}else if(point>=80) {
			System.out.println("B등급");
		}else if(point>=70) {
			System.out.println("C등급");
		}else if(point >=60) {
			System.out.println("D등급");
		}else {
			System.out.println("F등급");
		}
		
//		if(point>=90) {
//			System.out.println("A등급");
//			//조건식을 합쳐서 쓸 수 없음 --> else if(90>point>=80) 이런거 안됨 
//		}else if(90>point && point>=80) {
//			//&&는 둘다 true 일때 true가 나온다 --> 두개의 식 모두 만족 해야하니까 && 사용 
//			System.out.println("B등급");
//		}else if(80>point && point>=70) {
//			System.out.println("C등급");
//		}else if(70>point && point >=60) {
//			System.out.println("D등급");
//		}else {
//			System.out.println("F등급");
//		}
		
		sc.close();
		
	}
}
