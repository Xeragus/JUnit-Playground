package io.bobz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestStudentGradesAnalyser {

	private Course courseA;
	private Course courseB;
	private Student studentA;
	private Student studentB;
	private Student studentC;
	private StudentService service = mock(StudentService.class);
	
	@BeforeEach
	public void init() {
		courseA = new Course("SKIT", service);
		courseB = new Course("BP", service);
		studentA = new Student(1423, "John Snow");
		studentB = new Student(3289, "Daenerys Targaryan");
		studentC = new Student(9203, "Arya Stark");
	
		courseA.addStudentGrade(studentA, 8);
		courseA.addStudentGrade(studentB, 7);
		courseA.addStudentGrade(studentC, 6);

		courseB.addStudentGrade(studentA, 8);
		courseB.addStudentGrade(studentB, 9);
		courseB.addStudentGrade(studentC, 10);
		
	}
	
	@Test
	public void testGetAverageGradePerCourse() {
		when(service.getAverageGradePerCourse()).thenReturn((float) 8);
		assertEquals(courseA.getAverageGradePerCourse(), 8, 0);
		
		when(service.getAverageGradePerCourse()).thenReturn((float) 9);
		assertEquals(courseB.getAverageGradePerCourse(), 9, 0);
	}
	

}
