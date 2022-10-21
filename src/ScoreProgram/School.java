package ScoreProgram;

import java.util.ArrayList;

public class School {
	private ArrayList<Subject> openSubject;
	private ArrayList<Student> students;

	public School() {
		openSubject = new ArrayList<>();
		students = new ArrayList<>();
	}

	public void makeClass(Subject openSubject) {
		this.openSubject.add(openSubject);
	}

	public void admit(Student students) {
		this.students.add(students);
	}
}
