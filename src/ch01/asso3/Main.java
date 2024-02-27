package ch01.asso3;

public class Main {
    public static void main(String[] args) {
        //학생 생성
        Student s1 = new Student("박서현");
        Student s2 = new Student("이지은");

        //과목 생성
        Course java = new Course("java");
        Course python  = new Course("python");

        //성적 증명서
        Transcript t1 = new Transcript(s1, java);
        Transcript t2 = new Transcript(s2, java);
        Transcript t3 = new Transcript(s2, python);

        t1.setDate("2024-02-27");
        t1.setGrade("A");

        t2.setDate("2024-02-28");
        t2.setGrade("B+");

        t3.setDate("2024-02-29");
        t3.setGrade("A+s");
    }
}
