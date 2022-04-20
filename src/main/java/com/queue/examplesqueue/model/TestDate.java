package com.queue.examplesqueue.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDate {

    public static void main(String[] args) throws ParseException {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Appointment Date in dd-mm-yyyy hh:mm format");
        Date todaysDate = new Date();
        String sdate = s.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm");
        Date newDate;
        newDate = formatter.parse(sdate);
        SimpleDateFormat newFormat = new SimpleDateFormat("MMM/dd/yyyy hh:mm");
        try {
            if (newDate.compareTo(todaysDate) > 0) {
                //  System.out.println("date  : " +sdate);
                // String newDate =formatter.format(formatter);
                //System.out.println("Date :" +newDate);
                //System.out.println("New Date : " + newFormat.format(newDate));
                System.out.println(newFormat.format(newDate));
               // long difference = todaysDate.getTime() - newDate.getTime();
                long difference = newDate.getTime()-todaysDate.getTime();
                float daysBetween = (difference / (1000 * 60 * 60 * 24));
                System.out.println("difference between two days : " + daysBetween);
            } else {
                System.out.println("Please insert correct date which is greater than today's date");
            }

        } catch (Exception e) {
            e.getMessage();
        }
    }
}
