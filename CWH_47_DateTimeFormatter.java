
//VIEW ORACLE OFFICIAL DOCUMENTATION FOR BETTER UNDERSTANDING AND OTHER METHODS.

package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class CWH_47_DateTimeFormatter {
        public static void main(String[] args) {
            LocalDateTime dt = LocalDateTime.now(); // This is the date
            System.out.println(dt);

            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); // This is the format
            DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

            String myDate = dt.format(df); // Creating date string using date and format
            System.out.println(myDate);

        }
    }