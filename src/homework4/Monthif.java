package homework4;

public class Monthif {
    public static void main(String[] args) {

        System.out.println(printMonthInWorld(1));

    }
    public static String printMonthInWorld(int month){
        if (month >12 ) {
            return  "Not a valid month";
        }
        else if (month == 1) {
            return "JANUARY";
        }
        else if (month == 2) {
            return "FEBRUARY";
        }
        else if (month == 3) {
            return "MARCH";
        }
        else if (month == 4) {
            return "APRIL";
        }
        else if (month == 5) {
            return "MAY";
        }
        else if (month == 6) {
            return "JUNE";
        }
        else if (month == 7) {
            return "JULY";
        }
        else if (month == 8) {
            return "AUGUST";
        }
        else if (month == 9) {
            return "SEPTEMBER";
        }
        else if (month == 10) {
            return "OCTOBER";
        }
        else if (month == 11) {
            return "NOVEMBER";
        }
        else if (month == 12) {
            return "DECEMBER";
        }
        else {
            return "Not a valid month";
        }
    }
}
