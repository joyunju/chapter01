//논리 연산자
//AND(&&), OR(||), NOT(!)
// 결과는 boolean 타입인 true or false로 나옴

package com.javaex.ex01;

public class Ex10 {
	public static void main(String[] args) {


		// 논리 연산자 기본 &&
		System.out.println("&& 연산자");
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		//↓ 느낌표나오는 곳에 deadcode가 전혀 실행되지않는코드인 이유는
		//이미 false 하나만 있어도 결과값이 false니까 뒤에 코드가 필요한 것 맞냐고 물어보는 것
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		System.out.println("false가 하나만 있어도 결과값이 false");
		
		
		// || 연산자
		System.out.println("====-||연산자====");
		System.out.println(true||true);  // true
		System.out.println(true||false);  //true
		System.out.println(false||true);  //true
		System.out.println(false||false);  //false
		System.out.println("true가 하나만 있어도 결과값이 true");
		
		
		// 논리 연산자
		int a = 5;
		int b = 7;
		
		System.out.println("====응용====");
		System.out.println( (a>b)&&(a<b)); // 5>7 --> false && 5<7--> true --> 결과값 : false
		System.out.println();
		
		System.out.println("========");
		System.out.println((a>b)||(a<b)); // f || t --> true
		
		//논리 연산자 !
		System.out.println("=========");
		System.out.println( (a>b) ); // 5>7 ---> false
		System.out.println( !(a>b) );  // !false  --> true
		System.out.println("논리연산자 !가 앞에 붙으면 결과값의 반대로 출력");
		
	}
}
