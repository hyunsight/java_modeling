package ch01.gip;

public class Computer2 {
    //집약관계
    private MainBoard mb;
    private CPU c;
    private Memory m;
    private PowerSupply ps;

    //집약관계는 매개변수로 받아옴
    public Computer2 (MainBoard mb, CPU c, Memory m, PowerSupply ps) {
        this.mb = mb;
        this.c = c;
        this.m = m;
        this.ps = ps;
    }
}
