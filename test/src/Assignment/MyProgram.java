package Assignment;

import java.lang.runtime.SwitchBootstraps;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
public class MyProgram {
//    String name;
//    int age;
//
//public MyProgram(String name , int age){
//    this.name = name;
//    this.age = age;
//}
//int a = 10;
//    public String sample(){
//        if(a<5){
//            return "a is less than 5";
//        }
//        else if(a==5){
//            return "a is equal to 5";
//        }
//        else{
//            return "a is greater than 5";
//        }
//    }
//public void add(){
//    System.out.println("Addition");
//}

    public static void main(String[] args) {
//       ---------------- USER INPUT ------------------------------------------
//        Scanner input = new Scanner(System.in);
// MyProgram obj = new MyProgram("Sukanya", 33);
//MyProgram obj = new MyProgram();
//        System.out.println(obj.sample());

//          System.out.println("Enter your name: ");
//        String Name = input.nextLine();
//        System.out.println("Enter your age: ");
//        int age = input.nextInt();
//        System.out.println("Are you a member?  yes or no");
//        String member = input.next().toLowerCase(Locale.ROOT);
//        if ((age >= 18) && member.equals("yes")) {
//            System.out.println("Hi " + Name + "!" + " You are " + age + " years old, You are eligible");
//        }
//        else{
//            System.out.println("Hi " + Name + "!" + " You are " + age + " years old, you are not member. You are not eligible");
//        }

//        ---------------------------------STRING(non-primitive) TO PRIMITIVE---------------------------------------
        String number = "15";//$
        String number2 = "16";
        System.out.println(number2 + number);


//        byte n1 = Byte.parseByte(number);
//        short n2 = Short.parseShort(number);
        int n3 = Integer.parseInt(number);
//        long n4 = Long.parseLong(number);
//        float n5 = Float.parseFloat(number);
//        double n6 = Double.parseDouble(number);
//        System.out.println(n1+n2+n3+n4+n5+n6);

//        --------------------------PRIMITIVE TO STRING -----------------------------
//        int n7 = 56;

//        int n8 = 44;
//        boolean n9 = true;
//        System.out.println("Before string conversion: " + (n7+n8));
//        System.out.println("After string conversion: " + (String.valueOf(n7) + String.valueOf(n8)) );
//        -----------------------STRING TO BOOLEAN-------------------------------------------------------------
//        String x = "true";
//        boolean y = Boolean.parseBoolean(x);
//        System.out.println(y);

//        --------------------------Array-------------------------------
//        String [] names = new String[5];
        int[] marks = new int[5];
        System.out.println(marks);
//        System.out.println("Enter first name: ");
//        names[0] = input.nextLine();
//        System.out.println("Enter second name : ");
//        names[1] =input.nextLine();
//        System.out.println("Enter third name: ");
//        names[2] =input.nextLine();
//        System.out.println("Enter fourth name: ");
//        names[3]=input.nextLine();
//        System.out.println("Enter fifth name: ");
//        names[4]=input.nextLine();
//        System.out.println("last element:" + names[1] );
//        for(String name : names){
//            System.out.print(name + " ");
//        }
//        for(int i = 0; i< names.length; i++){
//            System.out.println((i+1) +"."+names[i]);
//        }

//        ---------------------------Sum of array elements--------------------------------
//          int [] marks = new int[5];
//          System.out.println("Enter first mark: ");
//          marks[0] = input.nextInt();
//       System.out.println("Enter second mark : ");
//          marks[1] =input.nextInt();
//        System.out.println("Enter third mark: ");
//        marks[2] =input.nextInt();
//        System.out.println("Enter fourth mark: ");
//        marks[3]=input.nextInt();
//        System.out.println("Enter fifth mark: ");
//        marks[4]=input.nextInt();
//        int Sum = 0;
//        for(int i=0; i< marks.length;i++){
//            Sum += marks[i];
//
//        }
//        System.out.println("Sum of the marks:  " + Sum);
//-------------------------------------------------------------------------------------------
        for(int i = 5; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        float a = 1.5f;
//        float b = 2.5f;
//        System.out.println(String.valueOf(a)+" "+String.valueOf(b));
//        int n = 1;
//        while(n<=10){
//            System.out.print(n + " ");
//            n++;
//        }
//        int m = 11;
//        do {
//            System.out.println(m);
//            m++;
//
//        } while (m <= 10);
//        for(int i = 1; i<=10;i++){
//            System.out.print(i + " ");
//        }


    }
}