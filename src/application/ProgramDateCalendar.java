package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ProgramDateCalendar {

	public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date             d   = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        
        System.out.println(sdf.format(d));
        
        Calendar cal = Calendar.getInstance();        
        cal.setTime(d);
        
        // Adiciona 4 horas no dia que est� no calend�rio
        cal.add(Calendar.HOUR_OF_DAY, 4);
        
        d = cal.getTime();
        
        System.out.println(sdf.format(d));
        
        int minutes = cal.get(Calendar.MINUTE);
        int month   = cal.get(Calendar.MONTH) + 1;
        
        System.out.println("-------------------");
        System.out.println("Minutes: " + minutes);
        System.out.println("Month..: " + month);
	}

}