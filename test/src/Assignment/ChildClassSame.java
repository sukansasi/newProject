package Assignment;

public class ChildClassSame extends AssPublicVsDefault{
    public ChildClassSame(){

    }
    public void sub(){
        System.out.println("Subtraction from child class");
    }
        public void display(){
            System.out.println("Display from child class");
        }
        public void display(String name){
            System.out.println(name + " Display from child class");
        }
    public static void main(String[] args) {
        ChildClassSame obj = new ChildClassSame();
//        obj.stuResult("Alex", 95,94,93);
//        AssPublicVsDefault.add();
//

        obj.display();
    }
}
