package com.javaex.ex02;

public class Ex01 {
	public static void main(String[] args) {
		
		String str = "굿모닝";
		int i = 23456;
		double d = 3.14;
		char c = 'A';
		String s = "한";
		String name ="완두콩";
		
		System.out.println("=====println: 줄바꿈효과=======");
		System.out.println("안녕하세요");
		System.out.println(str);
		
		System.out.println("====print====");
		System.out.print("안녕");
		System.out.print("하세요");

		System.out.println("====문자열+문자열===");
		System.out.println(str + str + "안녕하세요");
		System.out.println(str + i);  // 문자랑 숫자 더할 수 없으니 i변수가 문자로 변환
		
		String var01 = str+i;
		System.out.println(var01);
		
		System.out.println(str + d); //d 가 문자열로 변해서 출력
		System.out.println(i+i);  //둘다 정수이기 때문에 int 그대로 변하지 않고 숫자끼리 더해서 출력
		System.out.println(i + d); //정수가 실수로 바뀜
		System.out.println(c+c); //숫자로 연산 --> 문자를 유니코드로 바꿔서 계산해서 
		System.out.println(s+s);
		
		System.out.println("제이름은 " + name + " 입니다.");
		
		System.out.println("=======이스케이프 시퀀스=========");
		// 줄바꿈 : \n
		System.out.println("안녕\n하세요");
		// 일정 간격으로 띄어쓰기 : \t
		System.out.println("안녕\t하세요");
		// 쌍 따옴표를 넣고 싶을 때 : \"
		System.out.println("안녕\"하\"세요");
		// 역슬래쉬를 넣고 싶을 때 : \\
		System.out.println("안녕\\하세요");
		
		
		
		
		
		
		
		
		
		
	}
}
