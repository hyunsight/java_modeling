package ch02.singleton;

public class Printer {
    //필드
    private static Printer printer = null; //객체를 참조하지 않는 상태(객체 생성이 안된 상태)

    //생성자
    private Printer() {
    }

    //메소드
    // - 프린터 객체 리턴
    // - 정확히는 사용자가 이용해야 할 프린터 객체를 리턴 -> ★ 프린터 객체는 하나만 생성을 해서 공유되어야 한다. (싱글톤)
    public static Printer getPrinter() {
        if (printer == null) {
            //printer가 new Printer() 객체를 참조하지 않는다면 객체를 생성해 참조하도록 한다.
            printer = new Printer();
        }
        //printer가 new Printer() 객체를 참조하고 있다면 그냥 리턴을 해준다.
        return printer;
    }

    //프린트해주는 기능
    public void print(String str) {
        System.out.println(str);
    }
}
