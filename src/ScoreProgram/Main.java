package ScoreProgram;

public class Main {
	public static void main(String[] args) {
		School InhaUniv = School.getInstance();

		Student student1 = new Student("준혁", "12201914", "국어국문학과");
		Student student2 = new Student("승우", "12201532", "컴퓨터공학과");
		Student student3 = new Student("다영", "12201764", "국어국문학과");
		Student student4 = new Student("민겸", "12201346", "국어국문학과");
		Student student5 = new Student("강훈", "12201126", "컴퓨터공학과");

		InhaUniv.admit(student1);
		InhaUniv.admit(student2);
		InhaUniv.admit(student3);
		InhaUniv.admit(student4);
		InhaUniv.admit(student5);

		Subject korean = new Korean(1001);
		Subject math = new Math(2001);
		Subject mediaDance = new MediaDance(3001, "P/F과목");

		InhaUniv.makeClass(korean);
		InhaUniv.makeClass(math);
		InhaUniv.makeClass(mediaDance);

		korean.sugangAdmit(student1);
		korean.sugangAdmit(student2);
		korean.sugangAdmit(student3);
		korean.sugangAdmit(student4);
		korean.sugangAdmit(student5);

		math.sugangAdmit(student1);
		math.sugangAdmit(student2);
		math.sugangAdmit(student3);
		math.sugangAdmit(student4);
		math.sugangAdmit(student5);

		mediaDance.sugangAdmit(student1);
		mediaDance.sugangAdmit(student2);
		mediaDance.sugangAdmit(student3);

		scoreProcess(student1, korean, 95);
		scoreProcess(student2, korean, 95);
		scoreProcess(student3, korean, 100);
		scoreProcess(student4, korean, 89);
		scoreProcess(student5, korean, 85);

		scoreProcess(student1, math, 56);
		scoreProcess(student2, math, 95);
		scoreProcess(student3, math, 88);
		scoreProcess(student4, math, 95);
		scoreProcess(student5, math, 56);

		scoreProcess(student1, mediaDance, 60);
		scoreProcess(student2, mediaDance, 70);
		scoreProcess(student3, mediaDance, 70);

		ScoreTable koreanTable = new ScoreTable(korean);
		ScoreTable mathTable = new ScoreTable(math);
		ScoreTable danceTable = new ScoreTable(mediaDance);

		koreanTable.ShowTable();
		System.out.println();
		mathTable.ShowTable();
		System.out.println();
		danceTable.ShowTable();
	}

	public static void scoreProcess(Student student, Subject subject, int score) {
		if (subject instanceof Korean) {
			Korean korean = (Korean)subject;
			Score score_stu = new Score(student, subject, score);
			student.addScore(korean.getClassID(), score_stu);
		} else if (subject instanceof Math) {
			Math math = (Math)subject;
			Score score_stu = new Score(student, subject, score);
			student.addScore(math.getClassID(), score_stu);
		} else if (subject instanceof MediaDance) {
			MediaDance mediaDance = (MediaDance)subject;
			Score score_stu = new Score(student, subject, score);
			student.addScore(mediaDance.getClassID(), score_stu);
		}
	}
}
