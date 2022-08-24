package com.example.studentDetails.Controller;

import java.util.ArrayList;

import com.example.studentDetails.Entity.StudentEntity;

public class StudentController {

	public static void main(String[] args) {
		
		ArrayList<StudentEntity> al = new ArrayList<>();
		
		al.add(new StudentEntity(1,"Padma",100,20));
		al.add(new StudentEntity(2,"Anitha",101,21));
		al.add(new StudentEntity(3,"Sujatha",102,22));
		al.add(new StudentEntity(4,"Durga",103,23));
		al.add(new StudentEntity(5,"Teja",104,24));
		al.add(new StudentEntity(6,"Chandana",105,25));
		al.add(new StudentEntity(7,"Gayatri",106,26));
		al.add(new StudentEntity(8,"Bhanu",107,27));
		al.add(new StudentEntity(9,"Indu",108,28));
		al.add(new StudentEntity(10,"Narayana",109,29));
		
		for(StudentEntity st:al)
			System.out.println(st.toString());

	}

}
