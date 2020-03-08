
public class Allinhrsminsec {
    public static String getDurationString(int in_mins,int in_secs){

        if (in_mins <0  || in_secs < 0 || in_secs >59) {
            return "Invalid value";
        }

        int calc_hrs  = (int)Math.floor(in_mins / 60);
        int calc_mins = in_mins % 60;

        return (calc_hrs+" h "+calc_mins+" m "+in_secs+" s ");
    }

    public static String getDurationString(int in_secs_1){

        if(in_secs_1 < 0 ) {
            return "Invalid value";
        }

        int calc_mins_1 = (int)Math.floor(in_secs_1 / 60);
        int calc_secs_1 = in_secs_1 % 60;

        return(getDurationString(calc_mins_1,calc_secs_1));
    }

}
