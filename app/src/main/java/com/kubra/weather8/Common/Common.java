package com.kubra.weather8.Common;

import android.location.Location;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    public static final String APP_ID="b6907d289e10d714a6e88b30761fae22";
    public static Location current_location=null;

    public static String convertUnixToDate(long dt) {
        Date date=new java.sql.Date(dt*1000L);
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm EEE MM yyyy");
        String  formatted=sdf.format(date);
        return formatted;

    }

    public static String convertUnixToHour(long dt) {
        Date date=new java.sql.Date(dt*1000L);
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
        String  formatted=sdf.format(date);
        return formatted;
    }
}
