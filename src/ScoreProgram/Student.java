package ScoreProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Student {
	private String StudentName;
	private String StudentNum;
	private String major;
	private HashMap<Integer, Score> myScore = new HashMap<Integer, Score>();

	public Student(String studentName, String studentNum, String major) {
		StudentName = studentName;
		StudentNum = studentNum;
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void addScore(int SubjectCode, Score myScore) {
		this.myScore.put(SubjectCode, myScore);
	}

	public String whatsMainSubject(String major) {
		if (major.equals("컴퓨터공학과"))
			return "수학";
		else if (major.equals("국어국문학과"))
			return "국어";
		return major;
	}

	public String showSubjectScore(int subjectCode) {
		return StudentName + "|" + StudentNum + "|" + whatsMainSubject(this.major) + "|" + myScore.get(subjectCode);
	}

	@Override
	public String toString() {
		return StudentName + "|" + StudentNum + "|" + whatsMainSubject(this.major) + "|" + myScore;
	}
}
