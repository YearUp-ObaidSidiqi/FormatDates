package com.pluralsight;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class GMT {
    public static void main(String[] args) {

        // CHAT GPT --
        // Create a ZonedDateTime object for September 5, 2021 at 10:02 in GMT
        ZonedDateTime gmtDateTime = ZonedDateTime.of(2021, 9, 5, 10, 2, 0, 0, ZoneId.of("GMT"));

        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy  HH:mm");

        // Format the date/time
        String formattedDateTime = gmtDateTime.format(formatter);

        // Print the formatted date/time in GMT
        System.out.println(formattedDateTime + " GMT");









    }
}
