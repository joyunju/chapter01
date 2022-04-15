//example-2 : 임금계산기 2
//문제 내용 :
//8시간까지는 시간당 10,000원이고 초과시 시간당 1.5배가 계산되는 임금 계산기를 작성하기 
package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간: ");
	
		int time = sc.nextInt();
		int pay;
		
		if(time<=8) {
			pay = time*10000;
			System.out.println("임금은 " + pay + "원 입니다.");
		}else if (time>8) {
			pay = 8*10000 + (time-8)*((int)(10000*1.5));
			System.out.println("임금은 "+ pay + "원 입니다.");
		}
		
		sc.close();

	}

}
