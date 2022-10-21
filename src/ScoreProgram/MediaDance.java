package ScoreProgram;

import java.util.ArrayList;
import java.util.Objects;

public class MediaDance implements Subject{
	private int classID;
	private ArrayList<Student> student = new ArrayList<Student>();

	//과목 개설
	public MediaDance(int classID) {
		this.classID = classID;
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

	@Override
	public int hashCode() {
		return Objects.hash(classID);
	}
}
