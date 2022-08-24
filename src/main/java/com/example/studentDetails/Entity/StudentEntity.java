package com.example.studentDetails.Entity;

public class StudentEntity
{
	int id;
	String name;
	int rollNo;
	int age;
	
	
	public StudentEntity(int id, String name, int rollNo, int age) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	public String toString()
	{
		return "Student [id= "+ id +", name = "+name+", rollNo = "+rollNo+", age = "+age+"]";
	}
	
}
