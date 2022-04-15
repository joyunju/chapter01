//example 
//문제 : 점수를 입력받아 입력된 수가 3의 배수인지 판별하는 프로그램
// 나누기 3을 했을 때 나머지가 0인 숫자가 3이 배수
package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		int point = sc.nextInt();
		
		if(point%3==0) { //입력된 숫자 나누기 3의 나머지가 0이면 3의 배수가 true
			System.out.println(point + "은(는) 3의 배수입니다."); 
		}else {
			System.out.println(point + "은(는) 3의 배수가 압니다"); 
		}

		sc.close();	
	}

}
