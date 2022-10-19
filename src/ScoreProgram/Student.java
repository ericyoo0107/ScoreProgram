package ScoreProgram;

import java.util.ArrayList;

public class Student {
    private String StudentName;
    private String StudentNum;
    private String major;
    private ArrayList<Score> myScore = new ArrayList<Score>();

    public Student(String studentName, String studentNum, String major) {
        StudentName = studentName;
        StudentNum = studentNum;
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void addScore(Score myScore)
    {
        this.myScore.add(myScore);
    }
}
