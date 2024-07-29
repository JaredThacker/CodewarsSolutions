import static java.time.Year.of;

public class LeapYear {
    public static boolean isLeapYear(int year) {
//        return (year%100 == 0 && year%400 != 0) ? false
//                : (year%100 == 0 && year%400 == 0) ? true
//                : (year%4 == 0) ? true
//                : false;
        return of(year).isLeap();
    }
}
