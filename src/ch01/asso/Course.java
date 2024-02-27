package ch01.asso;

//단방향 관계이므로 Course는 Student 존재를 모름 (Student만 Course에 의존)
public class Course {
    private String name; //과목명
    
    //생성자
    public Course(String name) {
        this.name = name;
    }

    //과목명 리턴 메소드
    public String getName() {
        return name;
    }

}
