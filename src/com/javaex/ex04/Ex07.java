// 별 프로그램 
package com.javaex.ex04;

public class Ex07 {
	public static void main(String[] args) {

		// y축 1칸씩 ---> x는 y칸 만큼
		for (int y = 1; y <= 6; y++) {

			// x는 y칸 만큼 --> x<=y;
			for (int x = 1; x <= y; x++) {
				// 별이 옆으로 나열되기 위해 println()이 아닌 print() 사용
				System.out.print("*");
			}
			// 줄 바꿈
			System.out.println("");
		}

	}
}
