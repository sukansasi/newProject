package Assignment;
//Parent program
 public class AssPublicVsDefault {
    protected void stuResult(String stuName, int subject1, int subject2, int subject3){
        System.out.println(stuName+"'s Totalmarks :" + (subject1+subject2+subject3));}
        static void add(){
        System.out.println("Addition of two numbers using static: " + (20+15));
    }
    public void sub(){
        System.out.println("Subtraction from parent class");
    }

    public static void main(String[] args) {
        AssPublicVsDefault obj = new AssPublicVsDefault();
        obj.stuResult("Alex", 95,94,93);
        add();
    }
}
