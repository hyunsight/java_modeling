package ch01.asso3;

import java.util.ArrayList;

public class Course {
    //필드
    private String name; //과목명

    // - 과목 하나당 성적을 여러개 저장
    private ArrayList<Transcript> transcripts;

    //생성자
    public Course(String name) {
        this.name = name;
        transcripts = new ArrayList<>();
    }

    //메소드
    public String getName() {return name;}

    // - 성적 추가
    public void addTranscript(Transcript transcript) {
        transcripts.add(transcript);
    }
}
