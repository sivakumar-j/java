public class Main_of_LeapYear {
    public static void main(String[] args) {
        int v_year = 2500;
        boolean leap_or_not = LeapYear.isLeapYear(v_year);
        if(leap_or_not) {
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a leap year");
        }
    }
}
