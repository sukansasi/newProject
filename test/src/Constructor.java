public class Constructor {
    public Constructor(String name){
        System.out.println("My Project's Name :" + name);
    }
    void add(){
        System.out.println("Addition");
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor("Space");
        obj.add();
    }
}
