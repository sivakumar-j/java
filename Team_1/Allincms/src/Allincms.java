public class Allincms {
    public static double calFeetAndInchesTocentimeters(double in_var_feet,double in_var_inch){

        if( in_var_feet> 0 && (in_var_inch > 0 && in_var_inch<= 12)){

            return ((in_var_feet*12) + in_var_inch) * 2.54;

        }else{
            return -1;
        }

    }

    public static double calFeetAndInchesTocentimeters(double in_var_inch_1){

        if(in_var_inch_1 < 0){
            return -1 ; }

            double mthd2_var_inch_to_feet = (int) in_var_inch_1 / 12;

            double mthd2_var_inches_remaining = (int) in_var_inch_1 % 12;

        return calFeetAndInchesTocentimeters(mthd2_var_inch_to_feet ,mthd2_var_inches_remaining);
    }
}
