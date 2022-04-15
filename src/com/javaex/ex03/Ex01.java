//단축키 설정 : eclipse > preferences > keys > Content Assist
// mac : sysout 단축키 : option + space
//System.out.println();

//if 조건문

package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수");
		int point = sc.nextInt();
		
		if(point>=60) {
			
			//조건식이 true면 실행되는 영역
			System.out.println("합격입니다.");	
		}
		
		sc.close();
		
	}
}
