package ch01.asso;

import java.util.ArrayList;

public class Student {
    private String name; //학생 이름

    //Student는 Course를 알고 있다.(의존하고 있다.) > 단방향 관계
    // - 학생은 여러개의 과목을 수강한다. > ArrayList<>: 여러개 객체 저장 가능
    private ArrayList<Course> courses;

    //생성자
    public Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    //수강 신청 메소드
    public void registerCourse(Course course) {
        courses.add(course);
    }
    
    //수강 취소 메소드
    public void dropCourse(Course course) {
        courses.remove(course);
    }
}
