package CreditProgram;

public class TestMain {

    Schhol goodSchool = School.getInnstance();
    Subject korean;
    Subject math;

    GenerateGradeReport gradeReport = new GenerateGradeReport();

    public static void main(String[] args) {
        TestMain test = new TestMain();

        test.creatSubject();
        test.createStudent();

        String report = test.gradeReport.getReport();
        System.out.println(report);
    }

    //열린 과목들
    public void creatSubject()
    {
        korean  = new Subject("국어", 1001);
        math = new Subject("수학", 2001);

        goodSchool.addSubject(korean);
        goodSchool.addSubject(math);
    }

    //학생 생성 + 수강신청 + 학생이 받은 점수
    public void createStudent()
    {
        //학생들 생성
        Student student1 = new Student(181213, "안성원", korean);
        Student student2 = new Student(181518, "오태훈", math);
        Student student3 = new Student(171230, "이동호", korean);
        Student student4 = new Student(171255, "조성욱", korean);
        Student student5 = new Student(171590, "최태평", math);

        //학교에 학생 추가
        goodSchool.addStudent(student1);
        goodSchool.addStudent(student2);
        goodSchool.addStudent(student3);
        goodSchool.addStudent(student4);
        goodSchool.addStudent(student5);

        //국어 과목 수강생 추가
        korean.register(student1);
        korean.register(student2);
        korean.register(student3);
        korean.register(student4);
        korean.register(student5);

        //수학 과목 수강생 추가
        math.register(student1);
        math.register(student2);
        math.register(student3);
        math.register(student4);
        math.register(student5);

        //학생의 과목별 점수 추가
        addScoreForStudent(student1, korean, 95);
        addScoreForStudent(student1, math, 56);

        addScoreForStudent(student2, korean, 95);
        addScoreForStudent(student2, math, 95);

        addScoreForStudent(student3, korean, 100);
        addScoreForStudent(student3, math, 88);

        addScoreForStudent(student4, korean, 89);
        addScoreForStudent(student4, math, 95);

        addScoreForStudent(student5, korean, 85);
        addScoreForStudent(student5, math, 56);
    }

    //학생들 개개인의 과목별 점수 추가
    public void addScoreForStudent(Student student, Subject subject, int point)
    {
        Score score = new Score(Student.getStudentId(), subject, point);
        student.addSubjectScore(score);
    }
}
