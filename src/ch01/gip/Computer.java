package ch01.gip;

public class Computer {
    //합성관계
    private MainBoard mb;
    private CPU c;
    private Memory m;
    private PowerSupply ps;

    //합성관계는 전체가 합쳐짐
    public Computer() {
        this.mb = new MainBoard();
        this.c = new CPU();
        this.m = new Memory();
        this.ps = new PowerSupply();
    }
}
