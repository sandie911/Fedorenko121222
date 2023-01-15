package homework4;

public class Compare {
        public static void main(String[] args) {
            System.out.println(maxNumber(3,-9));

        }
        public static String maxNumber(int a, int b){
            int r = Math.abs(a);
            int n = Math.abs(b);
            String calculate = r>n? String.valueOf(r) : String.valueOf(n);
            if (r>n)
            {
                calculate = String.valueOf(r);
            }
            else
            {
                calculate = String.valueOf(n);
            }
            System.out.println("Max значення по модулю");
            return calculate;
        }

}
