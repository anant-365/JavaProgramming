
/*Date Class In Java :
Date class in java is available in java.util package.
This class provides the instant in time with precision of millisecond.
Constructors of the date class :
Date(): This constructor is used when we need an object of current date and time.
Date(long milliseconds): This constructor creates a date object from the
number of milliseconds passed since January 1, 1970
*/

package com.company;
import java.util.Date;
public class CWH_44_DateClass {
        public static void main(String[] args) {
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());
            Date d = new Date();
            System.out.println(d);
            System.out.println(d.getTime());
            System.out.println(d.getDate());
            System.out.println(d.getSeconds());
            System.out.println(d.getYear());
        }
    }
