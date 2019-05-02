package com.y0502;

public class 계산기 {
	
	public void 테스트 (int a, int b) {
		System.out.println("a: " + a + " b : " + b);
	}
	
	public int 덧셈(int a, int b) {
		return (a + b);
	}
	
	public int 뺄셈(int a, int b) {
		return (a - b);
	}
	
	public float 나눗셈(int a, int b) {
		//(float) 명시적 형변환
		return (float) (a / b);
	}
	
	public float 곱셈(int a, int b) {
		//(float) 명시적 형변환 - 기본자료형 변환
		return (float) (a * b);
	}
}
