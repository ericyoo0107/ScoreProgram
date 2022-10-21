package ScoreProgram;

import java.util.ArrayList;

public class School {
	private ArrayList<Subject> openSubject;
	private ArrayList<Student> students;
	private static School instance = new School();

	private School() {
		openSubject = new ArrayList<>();
		students = new ArrayList<>();
	}

	public static School getInstance() {
		if (instance == null)
			instance = new School();
		return instance;
	}

	public void makeClass(Subject openSubject) {
		this.openSubject.add(openSubject);
	}

	public void admit(Student students) {
		this.students.add(students);
	}
}
