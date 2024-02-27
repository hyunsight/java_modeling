package ch01.asso2;

public class Main {
    public static void main(String[] args) {
        //과목
        Course java = new Course("java");
        Course python = new Course("python");

        //학생
        Student park = new Student("박서현");
        Student lee = new Student("이지은");

        //수강 신청
        park.registerCourse(java);
        park.registerCourse(python);

        //수강 취소
        park.dropCourse(python);

        //과목에 학생 추가
        java.addStudent(park);
        java.addStudent(lee);

        //과목에 학생 제거
        java.removeStudent(lee);
    }
}
