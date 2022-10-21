package ScoreProgram;

import java.util.ArrayList;
import java.util.Objects;

public class Math extends Subject {
	private int classID;

	private ArrayList<Student> student = new ArrayList<Student>();

	//과목 개설
	public Math(int classID) {
		this.classID = classID;
		super.creditType = "일반과목";
	}

	public Math(int classID, String creditType) {
		this.classID = classID;
		super.creditType = creditType;
	}

	//학생 수강 신청
	@Override
	public void sugangAdmit(Student student) {
		this.student.add(student);
	}

	public ArrayList<Student> getStudent() {
		return student;
	}

	public int getClassID() {
		return classID;
	}

	public String getCreditType() {
		return super.creditType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(classID);
	}
}
