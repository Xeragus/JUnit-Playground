package io.bobz;

import java.util.HashMap;

public interface StudentService {
	public int getGrade(HashMap<Student, Integer> studentsGradeMap, int studentId);
	
	public float getAverageGradePerCourse();
	
	public float getAverageGradeForStudent(HashMap<Student, Integer> studentsGradeMap, int studentId);
}
