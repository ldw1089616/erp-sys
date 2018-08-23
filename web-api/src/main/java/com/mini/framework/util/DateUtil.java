package com.mini.framework.util;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by pactera on 2017/6/13.
 */
public class DateUtil {
    /**
     *
     * @param current
     * @param days
     * @return
     */
    public static Date addDays(Date current,int days){
        Calendar cal = Calendar.getInstance();
        cal.setTime(current);
        cal.add(Calendar.DATE, days);
        return cal.getTime();
    }
}
