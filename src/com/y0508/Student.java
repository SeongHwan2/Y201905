package com.y0508;

public class Student {
	
	
	public Student(String name, String gender, String id, String pw) {
		setName(name);
		setGender(gender);
		setId(id);
		setPw(pw);
	}
	

	private String name;
	private String gender;
	private String id;
	private String pw;
	
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	private void setGender(String gender) {
		this.gender = gender;
	}
	public String getId() {
		return id;
	}
	private void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	private void setPw(String pw) {
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return "학생 [이름=" + name + ", 성별=" + gender + ", id=" + id + ", pw=" + pw + "]";
	}
	
	

	
}
