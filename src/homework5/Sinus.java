package homework5;

public class Sinus {
    public static void main(String[] args){
        for (int x = 0; x<=360; x=x+10){
            double r = Math.toRadians(x);
            System.out.println("sin(" + x + ")=" + Math.sin(r));
        }
    }
}
