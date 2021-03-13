package com.company;

import sun.util.resources.cldr.CalendarData;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	//Scrie o metoda care returneaza ora si minutul la care programul a fost compilat
        dateCurente();
        timpCurent();

    }
    public static void timpCurent(){
        Calendar zi = Calendar.getInstance();
        //SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        int ziua=zi.get(Calendar.DAY_OF_MONTH);
        int luna=zi.get(Calendar.MONTH);
        int anul=zi.get(Calendar.YEAR);
        int ora = zi.get(Calendar.HOUR);
        int minut=zi.get(Calendar.MINUTE);
        System.out.println(String.format("%d/%d/%d",ziua,luna+1,anul)+ "  "+ora+":"+minut);
        System.out.println("Programul a fost compilat la Ora : "+ ora+" Minut: "+ minut);
        //System.out.println(zi);
        //System.out.println(zi.toString());
    }
    public static void dateCurente(){
        long totalMilisecunde=System.currentTimeMillis();
        long totalSecunde=totalMilisecunde/1000;
        long secundaCurenta=totalSecunde%60;
        long totalMinute=totalSecunde/60;
        long minutCurent=totalMinute%60;
        long totalOre=totalMinute/60;
        long oraCurenta=totalOre%24;
        System.out.println("Ora curenta: "+ (oraCurenta+2)+" Minutul curent: "+ minutCurent);

    }

}
