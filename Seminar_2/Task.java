package Seminar_2;

import java.io.FileReader;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws Exception {
        
    }
    public static int[] readFile(String fileName, String a, String b) throws Exception {
        FileReader fr = new FileReader(fileName);
        Scanner scan = new Scanner(fr);
        int[] intArray = new int[2];
        while (scan.hasNextLine()) {
            String[] strArray = scan.nextLine().split(" ");
            if(a.equalsIgnoreCase(strArray[0])){
                intArray[0] = Integer.parseInt(strArray[1]); 
                System.out.println(intArray[0]);
            }
            else if (b.equalsIgnoreCase(strArray[0])) {
                intArray[1] = Integer.parseInt(strArray[1]);
            }                   
        }
        scan.close();
        return intArray;
    }
}
