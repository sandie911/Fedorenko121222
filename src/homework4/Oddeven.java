package homework4;

public class Oddeven {
    public static void main(String[] args) {
        System.out.println(checkOddEven(2) );

    }
    public static Integer checkOddEven(int number){

        if (number %2 == 0)
        {
            System.out.println("Even Number");
        }

        else  {
            System.out.println("Odd Number");
        }
        System.out.println("Bye");
        return number;
    }
}
