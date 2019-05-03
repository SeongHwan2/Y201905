package com.y0503;

public class 구구단 {

	public String lv1() {
		String result = "";
		/****************************
		 * 1난이도 (한행에 하나씩)
		 * 1단 > 2단 (순차적으로 출력
		 ****************************/
		
		for(int i = 1; i <= 9; i++) {
			//System.out.println(i + "단");
			result = result + i + "단<br>";
			for(int j = 1; j <= 9; j++) {
				//System.out.println(i + "*" + j + "=" + i*j);
				result = result + i + "*" + j + "=" + (i*j) + "<br>";
			}
			//System.out.println();
			result = result + "<br>";
		}
		return result;
	}
	
	public String lv2() {
		String result = "";
		/****************************
		 * 2난이도 (한행에 3개씩)
		 * 1단2단3단 > 4단5단6단 > 7단8단9단 (순차적으로 출력
		 ****************************/
		for(int i = 1; i <= 9; i+=3) {
//			System.out.print(i + "단\t");
			result = result + i + "단\t";
//			System.out.print((i+1) + "단\t");
			result = result + (i+1) + "단\t";
//			System.out.print((i+2) + "단\t");
			result = result + (i+2) + "단\t";
//			System.out.println();
			result = result + "<br>";
			for(int j = 1; j <= 9; j++) {
//				System.out.print(i + "*" + j + "=" + i*j +"\t");
				result = result + i + "*" + j + "=" + i*j +"\t";
//				System.out.print((i+1) + "*" + j + "=" + (i+1)*j+"\t");
				result = result + (i+1) + "*" + j + "=" + (i+1)*j+"\t";
//				System.out.print((i+2) + "*" + j + "=" + (i+2)*j+"\t");
				result = result + (i+2) + "*" + j + "=" + (i+2)*j+"\t";
//				System.out.println();
				result = result + "<br>";
			}
//			System.out.println();
			result = result + "<br>";
		}
		return result;
	}
	
	public void lv3() {
		/****************************
		 * 3난이도 (한행에 3개씩)
		 * 1단4단7단 > 2단5단8단 > 3단6단9단 (순차적으로 출력
		 ****************************/
		for(int i = 1; i <= 3; i++) {//단수
			System.out.print(i + "단\t");
			System.out.print((i+1) + "단\t");
			System.out.print((i+2) + "단\t");
			System.out.println();
			for(int j = 1; j <= 9; j++) {//1 ~ 9
				System.out.print(i + "*" + j + "=" + i*j +"\t");
				System.out.print((i+3) + "*" + j + "=" + (i+3)*j+"\t");
				System.out.print((i+6) + "*" + j + "=" + (i+6)*j+"\t");
				System.out.println();
			}
			System.out.println();
		}
	}
}
