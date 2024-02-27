package ch01.asso;

public class Main {
    public static void main(String[] args) {
        //과목
        Course java = new Course("java");
        Course python = new Course("python");
        
        //학생
        Student student = new Student("박서현");
        
        //수강 신청
        student.registerCourse(java);
        student.registerCourse(python);

        //수강 취소
        student.dropCourse(python);
    }
}
