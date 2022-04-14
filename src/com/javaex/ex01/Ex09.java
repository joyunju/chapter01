//관계 연산자
package com.javaex.ex01;

public class Ex09 {
	public static void main(String[] args) {

		System.out.println("=========");
		// 관계연산자
		int n1 = 5;
		int n2 = 3;

		System.out.println(n1 < n2); // 5<3
		// 5보다 3이 작지 않으니까 결과값은 false
		System.out.println(n1 > n2); // 5>3 --> true
		System.out.println("n1 <= n2 n1이 n2보다 같거나 작은가?");
		System.out.println(n1<=n2);  // 5가 3보다 작거나 같지 않으니 false
		System.out.println("n1 >= n2 n1이 n2보다 같거나 큰가?");
		System.out.println(n1>=n2);  //true
		System.out.println("n1 == n2 n1이 n2이랑 같아?");
		System.out.println(n1==n2);  // 5와 3이 같지 않으니 false
		System.out.println("n1 != n2 n1이랑 n2는 달라?");
		System.out.println(n1!=n2);  //true
		
		
	}
}
