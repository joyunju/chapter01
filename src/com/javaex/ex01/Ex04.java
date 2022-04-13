//char : 한글자인 문자를 저장할 때

package com.javaex.ex01;

public class Ex04 {
	public static void main(String[] args) {	
		
		char ch01 = 'A';
		char ch02 = '쭈';
		
		System.out.println(ch01);
		System.out.println(ch02);
		
		//문자형이기 때문에 숫자를 넣으면 값이 나오지 않음 
		char ch03 = 65;
		System.out.println(ch03);
		
		//문자형 자료형을 사용하는데 숫자값 보여주고 싶을 때
		char ch04 = '3';
		System.out.println(ch04);
		
		//문자열 작성시 string
		//String은 무조건 " " 쌍따옴표 안에 작성해야함 
		String str = "안녕하세요";
		System.out.println(str);
		
		
		
		
	}
}
