package homework4;

public class Triangle {
    public static void main(String[] args) {
             System.out.println(itTriangleIsosceles(25,25,2));

    }
    public static String itTriangleIsosceles(int a, int b, int c){

        if (a == b|| b == c||b == c) {
            return  "Isosceles triangle";

        }

        else {
            return "Not an isosceles triangle";
        }
    }
}
