package ch01.asso2;

import java.util.ArrayList;

public class Course {
    private String name; //과목명

    //과목 하나를 여러명의 학생이 수강한다.
    private ArrayList<Student> students; //수강신청한 학생들

    //생성자
    public Course(String name) {
        this.name = name;
        students = new ArrayList<>(); //ArrayList 객체 할당
    }

    //과목명 리턴 메소드
    public String getName() {
        return name;
    }
    
    //수강 신청한 학생 추가
    public void addStudent(Student student) {
        students.add(student);
    }
    
    //수강 취소한 학생 제거
    public void removeStudent(Student student) {
        students.remove(student);
    }
}
