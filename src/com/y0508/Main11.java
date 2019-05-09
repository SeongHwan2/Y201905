package com.y0508;

import java.util.ArrayList;
import java.util.List;

public class Main11 implements Main11Interface {
	
	
	
	@Override
	public boolean studentAdd(Student stu) {//학생 추가
		Util11.stuList.add(stu); //클래스 명을 달아서 정확한 위치 지정!!
								 //클래스명 표시 안할시 static은 전역변수 처럼 사용되기때문에
								 //여러개가 생성될수 있음!!
								 //정확하게 쓰려면 메모리 관리 클래스를 따로 만들어서 사용하는것이 가장 좋음!
		return false;
	}

	@Override
	public Student studentSer(String name) {// 학생검색
		for(int i = 0; i < Util11.stuList.size(); i++) {
			if(Util11.stuList.get(i).getName().equals(name)) {
				return Util11.stuList.get(i);
			}
		}
		return null;		
	}

	@Override
	public boolean studentCh(Student stu) {//학생정보 변경
		for(int i = 0; i < Util11.stuList.size(); i++) {
			if(stu.getName().equals(Util11.stuList.get(i).getName()) && stu.getId().equals(Util11.stuList.get(i).getId())) {
				Util11.stuList.remove(i);
				Util11.stuList.add(stu);
			}
		}
		return false;
	}

	@Override
	public boolean studentRemo(Student stu) {//학생정보 삭제
		for(int i = 0; i < Util11.stuList.size(); i++) {
			if(stu.getName().equals(Util11.stuList.get(i).getName())) {
				Util11.stuList.remove(i);
			}
		}
		return false;
	}

}
