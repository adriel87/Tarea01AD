package helpers;

import java.util.Date;

public class datesHelper {

    public static String printDate(Date date){
        String day = (date.getDate() < 10) ? "0"+date.getDate() : Integer.toString(date.getDate());
        String month = (date.getMonth() < 9 ) ? "0"+(date.getMonth()+1) : Integer.toString(date.getMonth()+1);
        String year = Integer.toString(date.getYear()+1900);

        return year + "-" + month + "-" + day;
    }
}
