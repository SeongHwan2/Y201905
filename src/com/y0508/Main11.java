package com.y0508;

import java.util.ArrayList;
import java.util.List;

public class Main11 implements Main11Interface {
	public static List<Student> stuList = new ArrayList<Student>();
	
	@Override
	public boolean studentAdd(Student stu) {
		stuList.add(stu);
		return false;
	}

	@Override
	public Student studentSer(String name) {// 학생검색
		for(int i = 0; i < stuList.size(); i++) {
			if(stuList.get(i).getName().equals(name)) {
				return stuList.get(i);
			}
		}
		return null;		
	}

	@Override
	public boolean studentCh(Student stu) {
		for(int i = 0; i < stuList.size(); i++) {
			if(stu.getName().equals(stuList.get(i).getName())) {
				stuList.remove(i);
				stuList.add(stu);
			}
		}
		return false;
	}

	@Override
	public boolean studentRemo(Student stu) {
		for(int i = 0; i < stuList.size(); i++) {
			if(stu.getName().equals(stuList.get(i).getName())) {
				stuList.remove(i);
			}
		}
		return false;
	}

}
