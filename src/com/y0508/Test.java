package com.y0508;

public class Test implements TestInterface, Test1Interface {
               // 인터페이스 가져다 쓸때 implements 사용!
			   // 상속은 하나만 사용 가능 but 인터페이스는 다중사용 가능!
	@Override
	public int add() {
		return 0;
	}
	
	public void print() {
		
	}

	@Override
	public void add(int a) {
		System.out.println(a);
	}
}
