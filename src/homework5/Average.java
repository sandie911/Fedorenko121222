package homework5;

import java.util.Arrays;
import java.util.Random;

public class Average{

    public static void main(String[] args){
        int[] newArray2 = generateIntArray(10);
        System.out.println(Arrays.toString(newArray2));
        System.out.println("Ceреднє арифметичне = " + Average(newArray2));
    }
    public static double Average(int [] newArray2)
    {
        double sum =0;
        double avg =0;

        for (int i = 0; newArray2.length > i; i++){
            sum = sum + newArray2[i];
        }
        avg = sum/newArray2.length;
        return avg;
    }
    public static int getSomeNum() {
        Random random = new Random();
        return random.nextInt(100);

    }
    public static int[] generateIntArray(int length) {
        int[] intArray = new int[length];
        for (int i = 0; intArray.length > i; i++){
            intArray[i] = getSomeNum();
        }
        return intArray;
    }
}
