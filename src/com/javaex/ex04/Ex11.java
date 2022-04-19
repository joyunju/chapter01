//1에서 20까지의 수에서 2의 배수와 3의 배수를 제외한 숫자를 출력하세요
//for문, continue문 사용

package com.javaex.ex04;

public class Ex11 {
	public static void main(String[] args) {
		
		for(int i=1; i<=20; i++) {
			if(i%2==0 || i%3==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
