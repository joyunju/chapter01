//배열 복사 비교 ( 주소값 복사) 
// page : 122p
package com.javaex.ex05;

public class Ex05 {
	public static void main(String[] args) {

		// A 배열선언 1,2,3
		int[] arrA = new int[3];
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;

		// B 배열선언
		int[] arrB;

		// arrB에 A의 주소 대입 : 주소가 복사 된다 (같은 주소)
		arrB = arrA;

		// 배열 A출력
		System.out.println("====arrA[]=====");
		for (int i = 0; i < arrA.length; i++) {
			System.out.println("i = " + arrA[i]);
		}

		// 배열 B출력
		System.out.println("====arrB[]=====");
		for (int i = 0; i < arrB.length; i++) {
			System.out.println("i = " + arrB[i]);
		}

		// test 배열의 arrA[1] 값 변경 --> arrB[1]의 값도 변경이 된다.
		System.out.println("====arrA[1] 값 변경======");
		arrA[1] = 100;

		// 배열 A출력
		System.out.println("====arrA[]=====");
		for (int i = 0; i < arrA.length; i++) {
			System.out.println("i = " + arrA[i]);
		}

		// 배열 B출력
		System.out.println("====arrB[]=====");
		for (int i = 0; i < arrB.length; i++) {
			System.out.println("i = " + arrB[i]);
		}

	}
}
