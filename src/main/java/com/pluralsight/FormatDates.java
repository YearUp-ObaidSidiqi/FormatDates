package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {


        LocalDateTime date = LocalDateTime.now();

        /*System.out.println("Day of the Month: "+date.getDayOfMonth());
        System.out.println("Hour: "+date.getHour());
        System.out.println("09/05/2021"+date.);*/


        // 09/05/2021
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = date.format(fmt1);
        System.out.println(formattedDate1);

        //2021-09-05
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate2 = date.format(fmt2);
        System.out.println(formattedDate2);

        // September 5, 2021
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String formattedDate3 = date.format(fmt3);
        System.out.println(formattedDate3);

        //Sunday, Sep 5, 2021  10:02
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("EEEE, MM d, yyyy  hh:mm a ");
        String formattedDate4 = date.format(fmt4);
        System.out.println(formattedDate4);

    }
}