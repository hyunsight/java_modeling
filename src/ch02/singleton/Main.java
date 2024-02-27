package ch02.singleton;

public class Main {
    private static final int USER_NUM = 10; //직원수
    
    public static void main(String[] args) {
        //User 객체를 저장할 수 있는 배열
        User[] user = new User[USER_NUM];

        //0번 직원이 프린터 객체 생성하면 더이상 'printer == null'이 아님 > 따라서 동일한 프린터 객체를 1번 직원부터 사용하게 됨
        //즉, 싱글톤을 사용하는 이유는 자원을 공유하기 위함임
        for (int i = 0; i < USER_NUM; i++) {
            user[i] = new User(i + "번 직원");
            user[i].print();
        }
    }
}
