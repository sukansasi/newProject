package Assignment;

public class Methods {
    int a = 20, b= 15;
    static int x = 20, y= 5;
    public Methods(){
//        System.out.println("Initial Conditions");
//        add();
    }
    void add(){
        System.out.println("Addition of two numbers using non-return type : " + (a+b));
    }

    int addReturn(){
        System.out.println("Addition of two numbers using return type: " + (a+b));
        return a+b;
    }
    static int multiply(){

        System.out.println("Multiplication of two numbers using static without parameters:" +(x*y));
        return x*y;
    }
    static void multiply1(int x , int y){
        System.out.println("Multiplication of two numbers using static: " + (x*y));
    }

    void division(int x , int y){
        System.out.println("Division using parameters: " +(x/y));
    }

    int totalMarks(String name, int mark1, int mark2, int mark3, int mark4, int mark5){
        int totalMark = mark1 + mark2 + mark3 + mark4 + mark5 ;
        System.out.println(name +"\'s Total marks :" + totalMark);
        return totalMark;
    }
    boolean userName(String name){
        return true;
    }
    public static void main(String[] args) {
//        System.out.println("1. ------------>");
        Methods mc = new Methods();
        mc.userName("Alex");
//        System.out.println(mc.userName("John"));
//        mc.add();
//        System.out.println();
//        System.out.println("2. ------------>");
//        mc.addReturn();
//        System.out.println();
//        System.out.println("3. ------------>");
//        multiply();
//        System.out.println();
//        System.out.println("4. ------------>");
//        multiply1(5, 10);
//        System.out.println();
//        System.out.println("5. ------------>");
//        mc.division(20, 5);
//        System.out.println();
//        System.out.println("6. ------------>");
//        mc.totalMarks("Alex", 85, 75, 91, 95, 79);
//        System.out.println("method's output:");
//        System.out.println(mc.totalMarks("Alex", 85, 75, 91, 95, 79));


    }
}
