package ch02.singleton;

public class User {
    //필드
    private String name; //사용자 이름

    //생성자
    public User(String name) {
        this.name = name;
    }

    //메소드
    // - 사용자가 프린트를 사용해서 프린트 결과를 출력하는 메소드
    public void print() {
        Printer printer = Printer.getPrinter();

        printer.print(this.name + "이 프린트 사용중: " + printer.toString()); //toString: 문자 타입으로 바꿔주는 것 (printer.toString() 대신 객체(printer)만 찍어도 되나, 객체를 sout할 시 주소 출력)
    }
}
