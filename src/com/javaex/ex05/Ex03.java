//타입[] 변수명 = new 타입[크기]

package com.javaex.ex05;

public class Ex03 {
	public static void main(String[] args) {
		
		//선언과 함께 생성
//		int[] intArray //선언
//		intArray = new int[6]; //생성 
		
		int[] nums = new int[6];

//		nums[0] = (int) (Math.random() * 45) + 1;
//		nums[1] = (int) (Math.random() * 45) + 1;
//		nums[2] = (int) (Math.random() * 45) + 1;
//		nums[3] = (int) (Math.random() * 45) + 1;
//		nums[4] = (int) (Math.random() * 45) + 1;
//		nums[5] = (int) (Math.random() * 45) + 1;
		
		System.out.println("=====for문으로 출력====");
		for(int i=0; i<6; i++) {
			nums[i] = (int) (Math.random() * 45) + 1;
		}
		

		System.out.println(nums[0]);
		System.out.println(nums[1]);

		System.out.println("=====for문으로 출력====");
		// int i =0 --> nums 의 방번호가 0 부터 시작이니까
//		for (int i = 0; i < 6; i++) {
//			System.out.println(nums[i]);
//		}

		System.out.println("=====intArray.length====");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}
}
