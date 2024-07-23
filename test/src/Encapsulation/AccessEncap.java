package Encapsulation;

public class AccessEncap {
    public static void main(String[] args) {
       ExampleEncap obj = new ExampleEncap();

//        obj.setExam();
//        System.out.println(obj.getName());
//        System.out.println(obj.getName() + "'s Roll.no: "+obj.getRollNo());
//        obj.setExam();
        obj.setMarkMethod(350);
       System.out.println(obj.getMarkMethod());

    }
}
