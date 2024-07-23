package OOPS;

public class MainProgram extends Abstraction implements InterFace1{


    @Override
    public void add() {
        System.out.println("interface 1 ");
    }

    @Override
    public int addition() {
        System.out.println("Interface");
        return 0;
    }

    @Override
    public void sub1() {
        System.out.println("Interface2");
    }

    @Override
    void Sub() {
        System.out.println("Abstraction");

    }

    public static void main(String[] args) {
        MainProgram obj = new MainProgram();
        obj.add();
        obj.addition();
        obj.Sub();
        obj.divi();
    }
}
