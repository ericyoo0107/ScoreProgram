package ScoreProgram;

import java.util.ArrayList;
import java.util.Objects;

public class MediaDance extends Subject {
	private int classID;
	private String creditType;
	private ArrayList<Student> student = new ArrayList<Student>();

	//과목 개설
	public MediaDance(int classID) {
		this.classID = classID;
		super.creditType = "일반과목";
	}

	public MediaDance(int classID, String creditType) {
		this.classID = classID;
		super.creditType = creditType;
	}

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
