package Assignment;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        try{
           int a = 10;
            System.out.println(a/0);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Checking");
        }


    }
}
