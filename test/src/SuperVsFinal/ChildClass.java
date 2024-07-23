package SuperVsFinal;



public class ChildClass extends MainClass {
     void add(){
        System.out.println("Checking Overriding");
    }
  public ChildClass(String name, int marks){
//      System.out.println("Checking constructor method");
//      System.out.println(name+"'s total marks: "+marks);
        super.add();

   }

    public static void main(String[] args) {
       ChildClass obj3 = new ChildClass("John", 500);
       obj3.add();






    }
}
