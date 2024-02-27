package ch01.gip;

public class Main {
    public static void main(String[] args) {
        //1.합성관계
        // - 컴퓨터만 생성해도 컴퓨터 부품들이 생성된다. (전체를 만들면 부분까지 생성)
        Computer c = new Computer();
        // - 컴퓨터가 사라지면 컴퓨터 부품들도 사라진다. (전체가 사라지면 부분까지 사라짐)
        c = null; //이와 같이 작성할 경우, 자바에서 사라짐 (메모리에서 사라짐)

        //2.집약관계
        // - 부품을 따로 생성한다.
        MainBoard mb = new MainBoard();
        CPU cpu = new CPU();
        Memory m = new Memory();
        PowerSupply ps = new PowerSupply();

        // - 컴퓨터가 사라져도 부품은 남아있다. (전체가 사라져도 부분이 남음)
        Computer2 c2 = new Computer2(mb, cpu, m, ps);
    }
}
