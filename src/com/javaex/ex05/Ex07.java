//page 126p 순서도 코드

package com.javaex.ex05;

public class Ex07 {
	public static void main(String[] args) {

		int[] leftArray = new int[] { 1, 20, 30 };
		int[] rightArray = new int[] { 10, 20, 30 };

		// 두 배열의 개수가 같은가?
		if (leftArray.length == rightArray.length) {
			// 같다면 세부검사
			// System.out.println("세부검사");

			for (int i = 0; i < leftArray.length; i++) {

				// != --> 값이 다르다면
				// 만약에 각방의 데이터가 값이 다르다면?
				if (leftArray[i] != rightArray[i]) {
					// 다른경우
					System.out.println(i + "번째 값이 다릅니다.");
				}

			}

		} else { // 다르다면
			System.out.println("두배열의 크기가 다릅니다.");
		}
	}
}
