package Seminar_2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Integer num = getData("Введите число: ");
        Integer powNum = getData("Введите степень числа: ");  
        System.out.println("Число " + num + " в степени " + powNum + " -> " + powNumber(num, powNum));
        String pathInput = "Seminar_2/input.txt";
        String pathOutput = "Seminar_2/output.txt";
        String saveStr = String.format("a %d\nb %d", num, powNum);
        writeInFile(saveStr, pathInput);
        System.out.printf("\nВходные данные записаны в файл %s\n", pathInput);
        outputTerminal(pathInput);
        int[] argAB = readFile(pathInput, "a", "b"); 
        int newA = argAB[0];
        int newB = argAB[1];

        if (num ==0 && powNum == 0) {
            saveStr = "не определено";
        }
        else {
            Double intResult = powNumber(newA, newB);
            saveStr = String.valueOf(intResult);
        }
        writeInFile(saveStr, pathOutput);
        System.out.printf("\nРезультат записан в файл %s\n", pathOutput);
        outputTerminal(pathOutput);
    }
    public static int getData(String text) { 
        System.out.print(text); 
        return input.nextInt(); 
    }

    public static double powNumber(int value, int powValue) {
        double result = 1;
        if (powValue > 0) {
            for (int i = 1; i <= powValue; i++) {
                result *= value;
            }
            return result;
        } else if (powValue < 0) {
            for (int i = -1; i > powValue; i--) {
                result *= value;
            }
            result = 1 / (result * value);
            return result;
        } else {
            return 1;
        }
    }
    public static void writeInFile(String data, String path) {
        try (FileWriter wfile = new FileWriter(path, false)) {
            wfile.write(data);
            wfile.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static int[] readFile(String fileName, String a, String b) throws Exception {
        FileReader fr = new FileReader(fileName);
        Scanner scan = new Scanner(fr);
        int[] intArray = new int[2];
        while (scan.hasNextLine()) {
            String[] strArray = scan.nextLine().split(" ");
            if(a.equalsIgnoreCase(strArray[0])){
                intArray[0] = Integer.parseInt(strArray[1]); 
            }
            else if (b.equalsIgnoreCase(strArray[0])) {
                intArray[1] = Integer.parseInt(strArray[1]);
            }                   
        }
        scan.close();
        return intArray;
    }
    public static void outputTerminal(String text) throws Exception {
        File f = new File(text);
        Scanner scan = new Scanner(f);
        while (scan.hasNextLine()) {
            String msg = scan.nextLine();
            System.out.println(msg);
        }
        scan.close();
    }
}
