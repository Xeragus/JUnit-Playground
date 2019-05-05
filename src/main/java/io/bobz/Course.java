package io.bobz;

import java.util.HashMap;

public class Course {
	private String name;
    private HashMap<Student,Integer> studentsGradeMap = new HashMap<Student,Integer>(); 
    private StudentService service;

	public Course(String name, StudentService service) {
		this.name = name;
		this.service = service;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addStudentGrade(Student student, int grade) {
		this.studentsGradeMap.put(student, grade);
	}

	public HashMap<Student, Integer> getStudentsGradeMap() {
		return studentsGradeMap;
	}
	
	public int getStudentGrade(int studentId) {
		return service.getGrade(studentsGradeMap, studentId);
	}
	
	public float getAverageGradePerCourse() {
		return service.getAverageGradePerCourse();
	}
}
