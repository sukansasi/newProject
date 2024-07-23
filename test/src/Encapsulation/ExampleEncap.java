
package Encapsulation;

public class ExampleEncap {
    private String name = "JOHN";
    private int rollNo = 25;
   private int marks;
    int mark = 498;
    private void Exam(){
        System.out.println("Checking - accessing private method");
    }
    private int markMethod(){
        int mark = 498;

        return mark;
    }
    public void setExam(){
        this.Exam();
    }
public void setMarkMethod(int mark){
        this.markMethod();
        this.mark = mark;

}
public int getMarkMethod() {

        return mark;
}
    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }
}

