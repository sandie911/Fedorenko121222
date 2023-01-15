package homework5;
import java.util.Arrays;
import java.util.Random;

public class Number {
    public static void main(String[] args){
        int[] newArray2 = generateIntArray(100);
        System.out.println(Arrays.toString(EvenNum(newArray2)));
    }
    public static int [] EvenNum(int [] newArray2)
    {
        for (int i = 0; newArray2.length > i; i++) {
            if (newArray2[i] % 2 == 0)
            {
                newArray2[i] = 0;
            }
        }
        return newArray2;
    }
    public static int getSomeNum() {
        Random random = new Random();
        return random.nextInt(100);

    }
    public static int[] generateIntArray(int length) {
        int[] intArray = new int[length];
        for (int i = 0; intArray.length > i; i++){
            intArray[i] =getSomeNum();
        }
        return intArray;
    }
}

