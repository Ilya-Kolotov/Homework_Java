package Seminar_1;
import java.util.Scanner;
public class Task {

    public static int getData(String text) { 
        System.out.print(text); 
        return input.nextInt(); 
    }


    public static int triangNumber(int num) { 
        int result = (num*(num+1))/2;
        return result;
    }


    public static void outputResult(String text) { 
        System.out.println(text);
    }

}