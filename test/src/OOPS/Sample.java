package OOPS;

public class Sample implements InterFace1{
    public static void main(String[] args) {
        Sample obj = new Sample();
        obj.add();
        obj.sub1();
    }

    @Override
    public void add() {

    }

    @Override
    public int addition() {
        System.out.println("Sample Interface");
        return 0;
    }

    @Override
    public void sub1() {

    }
}
