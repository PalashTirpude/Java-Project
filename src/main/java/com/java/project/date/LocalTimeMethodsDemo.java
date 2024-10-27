package com.java.project.date;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;

public class LocalTimeMethodsDemo {
    public static void main(String[] args) {
        LocalTime currentTime=LocalTime.now();

        System.out.printf("Current Time : %s%n",currentTime);
        System.out.printf("Specific Time : %s%n",LocalTime.of(10,15,25));

        //LocalTime.parse("HH:mm:ss")
        System.out.printf("Parse Time form given Time String : %s%n",LocalTime.parse("05:25:50"));

        // Add or Subtract Hours, Minutes, or Seconds

        LocalTime time=LocalTime.now();
        System.out.printf("Add 1 hour to current Time (%s) --> %s%n"
                ,time,time.plusHours(1));
        System.out.printf("Subtract 1 hour to current Time (%s) --> %s%n"
                ,time,time.minusHours(1));
        System.out.printf("Add 1 hour 10 minutes to current Time (%s) --> %s%n"
                ,time,time.plusHours(1).plusMinutes(10));
        System.out.printf("Subtract 1 hour 10 minutes to current Time (%s) --> %s%n"
                ,time,time.minusHours(1).minusMinutes(10));

        //Get Hour, Minute, Second, and Nano

        System.out.printf("Get hour of current Time : %s%n",time.getHour());
        System.out.printf("Get minute of current Time : %s%n",time.getMinute());
        System.out.printf("Get seconds of current Time : %s%n",time.getSecond());
        System.out.printf("Get nano seconds of current Time : %s%n",time.getNano());

        //Truncate to Specific Units
        System.out.printf("Given Time (%s) Truncated to Minutes : %s%n",time,time.truncatedTo(ChronoUnit.MINUTES));
        System.out.printf("Given Time (%s) Truncated to Seconds : %s%n",time,time.truncatedTo(ChronoUnit.SECONDS));



        // Formated Time

        System.out.printf("Formated time in time format HH:mm:ss --> %s%n"
                ,timeFormater(LocalTime.now(),"HH:mm:ss"));
        System.out.printf("Formated time in time format hh:mm a --> %s%n"
                ,timeFormater(LocalTime.now(),"hh:mm a"));
        System.out.printf("Formated time in time format HH:mm:ss.SSS --> %s%n"
                ,timeFormater(LocalTime.now(),"HH:mm:ss.SSS"));

    }




    /**
     * Formats a given LocalTime according to the specified pattern.
     *
     * <p>Supported patterns:
     * <ul>
     *   <li><code>"HH:mm:ss"</code>: 24-hour format (e.g., 13:45:30)</li>
     *   <li><code>"hh:mm a"</code>: 12-hour format with AM/PM (e.g., 01:45 PM)</li>
     *   <li><code>"HH:mm:ss.SSS"</code>: 24-hour format with milliseconds (e.g., 13:45:30.123)</li>
     *   <li><code>"hh 'o''clock' a"</code>: 12-hour format with "o'clock" and AM/PM (e.g., 01 o'clock PM)</li>
     * </ul>
     *
     * @param localTime the LocalTime to format
     * @param pattern the pattern to use for formatting
     * @return a string representing the formatted time
     * @throws IllegalArgumentException if the pattern is invalid
     */
    public static String timeFormater(LocalTime localTime,String pattern){
        DateTimeFormatter timeFormat=DateTimeFormatter.ofPattern(pattern);
        return localTime.format(timeFormat);
    }



}
