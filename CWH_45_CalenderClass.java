
//The calendar class in java provides the methods that helps in
// converting date between a specific instant in time.
//It is an abstract class.
//Since it is an abstract class, we can not create an instance of this
// class with the help of a constructor.
//We use the static method Calender.getInstance() in order to implement
// a subclass.

package com.company;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
public class CWH_45_CalenderClass {
        public static void main(String[] args) {
            Calendar c = Calendar.getInstance();
            System.out.println(c.getCalendarType());
            System.out.println(c.getTime());
            //getCalendarType() returns the type of the calendar
            //getTime() returns date min,hr,sec timeZone year.(returns date object)
            System.out.println(c.getTime());
            System.out.println(c.get(Calendar.DATE));
            System.out.println(c.get(Calendar.SECOND));
            System.out.println(c.get(Calendar.HOUR));
            System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
            GregorianCalendar cal = new GregorianCalendar();
            System.out.println(cal.isLeapYear(2018));
            System.out.println(TimeZone.getAvailableIDs()[0]);
            System.out.println(TimeZone.getAvailableIDs()[1]);
            System.out.println(TimeZone.getAvailableIDs()[2]);
        }
    }
