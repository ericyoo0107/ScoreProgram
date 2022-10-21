package ScoreProgram;

public class Score implements BasicCredit, MajorCredit, PassFailCredit {
	private Student student;
	private Subject subject;
	private int score;
	private char credit;

	public Score(Student student, Subject subject, int score) {
		this.student = student;
		this.subject = subject;
		this.score = score;
		this.credit = credit();
	}

	public char credit() {
		if (creditTypeCheck() == 0)
			return majorCredit(score);
		else if(creditTypeCheck()==1)
			return basicCredit(score);
		else if (creditTypeCheck()== 2) {
			return passFailCredit(score);
		}
		return 0;
	}

	public int creditTypeCheck() {
		if (student.getMajor().equals("컴퓨터공학과") && subject instanceof Math
			|| student.getMajor().equals("국어국문학과") && subject instanceof Korean)
			return 0;
		else if(subject instanceof MediaDance)
			return 2;
		return 1;
	}

	@Override
	public char majorCredit(int score) {
		if (score >= 95 && score <= 100)
			return 'S';
		else if (score >= 90 && score <= 94)
			return 'A';
		else if (score >= 80 && score <= 89)
			return 'B';
		else if (score >= 70 && score <= 79)
			return 'C';
		else if (score >= 60 && score <= 69)
			return 'D';
		else if (score < 60)
			return 'F';
		else
			return '@';
	}

	@Override
	public char basicCredit(int score) {
		if (score >= 90 && score <= 100)
			return 'A';
		else if (score >= 80 && score <= 89)
			return 'B';
		else if (score >= 70 && score <= 79)
			return 'C';
		else if (score >= 55 && score <= 69)
			return 'D';
		else if (score < 55)
			return 'F';
		else
			return '@';
	}

	@Override
	public char passFailCredit(int score) {
		if (score >= 70 && score <= 100)
			return 'P';
		else if (score < 70)
			return 'F';
		else
			return '@';
	}

	@Override
	public String toString() {
		return score + ":" + credit;
	}
}
