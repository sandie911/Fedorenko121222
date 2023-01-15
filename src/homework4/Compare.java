package homework4;

public class Compare {
    public static void main(String[] args) {
        int a = -9;
        int b = 3;
        int r = Math.abs(a);
        int p = Math.abs(b);
        String calculate = r > p ? String.valueOf(r) : String.valueOf(p);
        System.out.println(calculate);

    }
}
