package com.allcheer.bpos.util;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.util.Assert;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
/**
 * Created by fireWorks on 2016/2/27.
 */
public class DateUtil {

    public static final String PATTERN_STANDARD = "yyyy-MM-dd HH:mm:ss";

    public static final String PATTERN_DATE = "yyyy-MM-dd";

    public static final String PATTERN_DATE_8 = "yyyyMMdd";

    public static final String PATTERN_TIME = "HHmmss";

    public static final String PATTERN_TIME_14 = "yyyyMMddHHmmss";


    public static String timestamp2String(Timestamp timestamp, String pattern) {
        if (timestamp == null) {
            throw new java.lang.IllegalArgumentException("timestamp null illegal");
        }
        if (pattern == null || pattern.equals("")) {
            pattern = PATTERN_STANDARD;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(new Date(timestamp.getTime()));
    }

    public static String date2String(java.util.Date date, String pattern) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("timestamp null illegal");
        }
        if (pattern == null || pattern.equals("")) {
            pattern = PATTERN_STANDARD;
            ;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    public static Timestamp currentTimestamp() {
        return new Timestamp(new Date().getTime());
    }

    public static String currentTimestamp2String(String pattern) {
        return timestamp2String(currentTimestamp(), pattern);
    }

    public static String getCurrentDateTime() {
        Calendar date = Calendar.getInstance();
        TimeZone timezone = TimeZone.getTimeZone("Asia/Shanghai");
        date.setTimeZone(timezone);
        return DateFormatUtils.format(date, PATTERN_TIME_14);
    }

    public static Timestamp string2Timestamp(String strDateTime, String pattern) {
        if (strDateTime == null || strDateTime.equals("")) {
            throw new java.lang.IllegalArgumentException("Date Time Null Illegal");
        }
        if (pattern == null || pattern.equals("")) {
            pattern = PATTERN_STANDARD;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = sdf.parse(strDateTime);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return new Timestamp(date.getTime());
    }

    /**
     * 移除日期中的 - 或者 /
     * @param dateStr
     * @return
     */
    public static String removeLineDateString(String dateStr) {
        if (StringUtils.isBlank(dateStr))
            return dateStr;

        dateStr = dateStr.replaceAll("-", "");
        dateStr = dateStr.replaceAll("/", "");
        return dateStr;
    }



    /**
     * 返回pattern格式的字符串
     *
     * @param pattern
     * @return
     */
    public static String getStringForPattern(String pattern) {

        if (pattern == null) {
            return null;
        }
        Date date = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        return simpleDateFormat.format(date);
    }


    /**
     * 返回yyyyMMddHHmmss字符串
     * @return
     */
    public static String getDateAndTime() {
        return getStringForPattern(PATTERN_TIME_14);
    }


    public static Date string2Date(String strDate, String pattern) {
        if (strDate == null || strDate.equals("")) {
            throw new RuntimeException("str date null");
        }
        if (pattern == null || pattern.equals("")) {
            pattern = DateUtil.PATTERN_DATE;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date date = null;

        try {
            date = sdf.parse(strDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return date;
    }

    public static String stringToYear(String strDest) {
        if (strDest == null || strDest.equals("")) {
            throw new java.lang.IllegalArgumentException("str dest null");
        }

        Date date = string2Date(strDest, DateUtil.PATTERN_DATE);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return String.valueOf(c.get(Calendar.YEAR));
    }

    public static String stringToMonth(String strDest) {
        if (strDest == null || strDest.equals("")) {
            throw new java.lang.IllegalArgumentException("str dest null");
        }

        Date date = string2Date(strDest, DateUtil.PATTERN_DATE);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        // return String.valueOf(c.get(Calendar.MONTH));
        int month = c.get(Calendar.MONTH);
        month = month + 1;
        if (month < 10) {
            return "0" + month;
        }
        return String.valueOf(month);
    }

    public static String stringToDay(String strDest) {
        if (strDest == null || strDest.equals("")) {
            throw new java.lang.IllegalArgumentException("str dest null");
        }

        Date date = string2Date(strDest, DateUtil.PATTERN_DATE);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        // return String.valueOf(c.get(Calendar.DAY_OF_MONTH));
        int day = c.get(Calendar.DAY_OF_MONTH);
        if (day < 10) {
            return "0" + day;
        }
        return "" + day;
    }

    public static Date getFirstDayOfMonth(Calendar c) {
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = 1;
        c.set(year, month, day, 0, 0, 0);
        return c.getTime();
    }

    public static Date getLastDayOfMonth(Calendar c) {
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = 1;
        if (month > 11) {
            month = 0;
            year = year + 1;
        }
        c.set(year, month, day - 1, 0, 0, 0);
        return c.getTime();
    }

    public static String date2GregorianCalendarString(Date date) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("Date is null");
        }
        long tmp = date.getTime();
        GregorianCalendar ca = new GregorianCalendar();
        ca.setTimeInMillis(tmp);
        try {
            XMLGregorianCalendar t_XMLGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(ca);
            return t_XMLGregorianCalendar.normalize().toString();
        } catch (DatatypeConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new java.lang.IllegalArgumentException("Date is null");
        }

    }

    public static boolean compareDate(Date firstDate, Date secondDate) {
        if (firstDate == null || secondDate == null) {
            throw new java.lang.RuntimeException();
        }

        String strFirstDate = date2String(firstDate, "yyyy-MM-dd");
        String strSecondDate = date2String(secondDate, "yyyy-MM-dd");
        if (strFirstDate.equals(strSecondDate)) {
            return true;
        }
        return false;
    }

    public static Date getStartTimeOfDate(Date currentDate) {
        Assert.notNull(currentDate);
        String strDateTime = date2String(currentDate,"yyyy-MM-dd") + " 00:00:00";
        return string2Date(strDateTime,"yyyy-MM-dd hh:mm:ss");
    }

    public static Date getEndTimeOfDate(Date currentDate) {
        Assert.notNull(currentDate);
        String strDateTime = date2String(currentDate,"yyyy-MM-dd") + " 59:59:59";
        return string2Date(strDateTime,"yyyy-MM-dd hh:mm:ss");
    }

    public static String stringTostring(String date,String sourceP,String derP) {
        return DateUtil.date2String(DateUtil.string2Date(date, sourceP), derP);
    }

    public static String string10Tostring8(String date) {
        return DateUtil.stringTostring(date,DateUtil.PATTERN_DATE,DateUtil.PATTERN_DATE_8);
    }

    public static String getCurrentYesterDay(){
        Calendar date = Calendar.getInstance();
        TimeZone timezone = TimeZone.getTimeZone("Asia/Shanghai");
        date.setTimeZone(timezone);
        Date addDays = DateUtils.addDays(date.getTime(), -1);
        return DateFormatUtils.format(addDays, "yyyyMMdd");
    }

    public static String getCurrentDate(){
        Calendar date = Calendar.getInstance();
        TimeZone timezone = TimeZone.getTimeZone("Asia/Shanghai");
        date.setTimeZone(timezone);
        return DateFormatUtils.format(date, "yyyyMMdd");
    }



    /**
     * 获得当前日期的前一天日期
     *
     * @return
     */

    public static String getIntradayAgin() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();   //当前时间
        Calendar calendar = Calendar.getInstance(); //得到日历
        calendar.setTime(date);//把当前时间赋给日历
        calendar.add(Calendar.DAY_OF_MONTH, -1);  //设置为前一天
        return format.format(calendar.getTime());   //得到前一天的时间
    }


    public static String getCurrentTime(){
        Calendar date = Calendar.getInstance();
        TimeZone timezone = TimeZone.getTimeZone("Asia/Shanghai");
        date.setTimeZone(timezone);
        return DateFormatUtils.format(date, "HHmmss");
    }


}
