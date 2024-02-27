package ch01.asso3;

import java.util.ArrayList;

public class Student {
    //필드
    private String name; //학생명

    //학생 한명당 여러개의 성적을 가지고 있다 (과목을 여러개 수강신청 하므로)
    private ArrayList<Transcript> transcripts; //성적 리스트

    //생성자
    public Student(String name) {
        this.name = name;
        transcripts = new ArrayList<>();
    }

    //메소드 - 성적 추가
    public void addTrascript(Transcript transcript) {
        transcripts.add(transcript);
    }
}

