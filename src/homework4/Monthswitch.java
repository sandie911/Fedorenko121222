package homework4;

public class Monthswitch {
    public static void main(String[] args) {

        System.out.println(printMonthInWorld(2));
    }
    public static String printMonthInWorld(int month){
        String str;
        switch (month) {
            case 1:
                str ="JANUARY";
                break;
            case 2:
                str = "FEBRUARY";
                break;
            case 3:
                str ="MARCH";
                break;
            case 4:
                str ="APRIL";
                break;
            case 5:
                str ="MAY";
                break;
            case 6:
                str ="JUNE";
                break;
            case 7:
                str ="JULY";
                break;
            case 8:
                str ="AUGUST";
                break;
            case 9:
                str ="SEPTEMBER";
                break;
            case 10:
                str ="OCTOBER";
                break;
            case 11:
                str ="NOVEMBER";
                break;
            case 12:
                str ="DECEMBER";
                break;
            default:
                str = "Not a valid month";
        }
        return  str;
    }
}
