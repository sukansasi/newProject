package DifferentPack;

import Assignment.AssPublicVsDefault;

public class ChildClassDiff extends AssPublicVsDefault{
    public void sub(){
        System.out.println("Subtraction from child class");
    }
    public static void main(String[] args) {
        ChildClassDiff obj1 = new ChildClassDiff();
        obj1.stuResult("Alex", 95,94,93);

    }
}
