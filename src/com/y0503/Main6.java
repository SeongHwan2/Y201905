package com.y0503;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@WebServlet("/Main6")
public class Main6 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		사용자 user = new 사용자();
//		user.나이 = 1;
//		user.키 = 2;
//		user.몸무게 = 1000;
//		user.이름 = "나";
//		
//		user.set이름("구디");
//		String 이름 = user.get이름();
//		System.out.println(이름);
		
//		사용자 구디 = new 사용자("구디", 1,2,1000); //정보 담기!! (자료를 담을수있는 객체)
//		사용자 가산 = new 사용자("가산", 10,185,50);
//		
//		if(구디.get나이() > 가산.get나이()) {
//			System.out.println("구디");
//		}else {
//			System.out.println("가산");
//		}
		
		HashMap<String, Object> resultMap =  new HashMap<String, Object>();// k = key 값을 찾을때 쓰는 것  V = value  = 값 Object = 가장 상위 자료형
		resultMap.put("이름", "구디");                         //HashMap은 값을 저장 할때 일정한 순서 없이 key와 연결!!
		resultMap.put("나이", 1);                            //key값을 순서가 있게 만들면 List처럼 사용가능
		resultMap.put("키", 2);
		resultMap.put("몸무게", 1000);
		resultMap.put("학교", "구디아카데미");
		
		String 이름 = resultMap.get("이름").toString(); // .toString() = 문자열 형변환
		System.out.println(이름);
////		System.out.println(resultMap.keySet());
////		for(Integer key : resultMap.keySet()) {
////			System.out.println(resultMap.get(key));
//		}
		
		
		List<사용자> 사용자목록 = new ArrayList<사용자>(); // 배열 형식으로 객체를 담는다
		사용자목록.add(new 사용자("구디", 1,2,1000));  // 0인덱스 위치에 사용자 객체 담기
		사용자목록.add(new 사용자("가산", 10,185,50)); // 1인덱스 위치에 사용자 객체 담기
		
//		if(사용자목록.get(0).get나이() > 사용자목록.get(1).get나이()) {//E = elements
//			System.out.println(사용자목록.get(0).get이름());
//		}else {
//			System.out.println(사용자목록.get(1).get이름());
//		}
		
		사용자 구디 = 사용자목록.get(0);
		사용자 가산 = 사용자목록.get(1);		
		
		if(구디.get나이() > 가산.get나이()) {
			System.out.println("구디");
		}else {
			System.out.println("가산");
		}
		
		List 정수형리스트 = new ArrayList();// 기본자료형 값도 넣을수 있음!
		정수형리스트.add(1);
		정수형리스트.add("2");
		정수형리스트.add(3.4);
		정수형리스트.add(true);
		
		for(int i = 0; i < 정수형리스트.size(); i++) {
			System.out.println(정수형리스트.get(i));
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
