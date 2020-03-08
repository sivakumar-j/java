public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double in_var_1,double in_var_2){
        double mthd_var_1 = (double)Math.rint(in_var_1 * 1000d) / 1000d;
        double mthd_var_2 = (double)Math.rint(in_var_2 * 1000d) / 1000d;
        System.out.println("mthd vars are " + mthd_var_1+ " and "+ mthd_var_2);
        return mthd_var_1 == mthd_var_2;

    }
}
