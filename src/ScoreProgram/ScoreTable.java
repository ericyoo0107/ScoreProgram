package ScoreProgram;

import java.util.ArrayList;

public class ScoreTable {
	private Korean koreanTable = null;
	private Math mathTable = null;
	private MediaDance danceTable = null;

	public ScoreTable(Subject subject) {
		if (subject instanceof Korean)
			koreanTable = (Korean)subject;
		else if (subject instanceof Math) {
			mathTable = (Math)subject;
		} else if (subject instanceof MediaDance) {
			danceTable = (MediaDance)subject;
		}
	}

	public void ShowTable() {
		if (koreanTable != null) {
			System.out.println("-------------------------");
			System.out.println("      국어 수강생 학점      ");
			System.out.println("이름 | 학번 | 중점과목 | 점수");
			System.out.println("-------------------------");
			for (Student s : koreanTable.getStudent()) {
				System.out.println(s.showSubjectScore(1001));
				System.out.println("-------------------------");
			}
		} else if (mathTable != null) {
			System.out.println("-------------------------");
			System.out.println("      수학 수강생 학점      ");
			System.out.println("이름 | 학번 | 중점과목 | 점수");
			System.out.println("-------------------------");
			for (Student s : mathTable.getStudent()) {
				System.out.println(s.showSubjectScore(2001));
				System.out.println("-------------------------");
			}
		} else if (danceTable != null) {
			System.out.println("-------------------------");
			System.out.println("    방송댄스 수강생 학점     ");
			System.out.println("이름 | 학번 | 중점과목 | 점수");
			System.out.println("-------------------------");
			for (Student s : danceTable.getStudent()) {
				System.out.println(s.showSubjectScore(3001));
				System.out.println("-------------------------");
			}
		}

	}
}
