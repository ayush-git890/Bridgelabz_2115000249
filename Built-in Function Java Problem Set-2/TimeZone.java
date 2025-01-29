import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class TimeZone{
	public static void main(String args[]){
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));  		//current date and time in GMT
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));  //current date and time in IST
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));  //current date and time in PST

        DateTimeFormatter flag = DateTimeFormatter.ISO_DATE_TIME; //for setting the pattern we used this.....

        System.out.println("time in GMT: " + gmt.format(flag));
        System.out.println("time in IST: " + ist.format(flag));
        System.out.println("time in PST: " + pst.format(flag));
	}
}