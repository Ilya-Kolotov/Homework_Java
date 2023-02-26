package Seminar_3;

import java.util.stream.IntStream;

public class Task {

    public static void main(String[] args) {
        
    }
    public static int[] fillArray(int size, int range) {
        int[] array = new int[size];
        IntStream.range(0, size)
                .forEach(index -> array[index] = (int) (Math.random() * 2 * range) - range);
        return array;
    }
}