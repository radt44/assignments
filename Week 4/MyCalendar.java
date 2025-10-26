//Name: Garrett Radtke
//Date: 10/21/2025

import java.util.Calendar;
import java.util.Locale;

public class MyCalendar {
    //Abstract MyCalendar from Calendar class
    private Calendar calendar = Calendar.getInstance();

    public static final int YEAR = Calendar.YEAR;
    public static final int MONTH = Calendar.MONTH;
    public static final int DATE = Calendar.DATE;
    public static final int DAY_OF_WEEK = Calendar.DAY_OF_WEEK;

    //Calendar get method
    public int get(int field) {
        return calendar.get(field);
    }

    //Calendar set method
    public void set(int field, int value) {
        calendar.set(field, value);
    }

    //Calendar getMonthName method
    public String getMonthName() {
        return calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
    }
    //Calendar daysInMonth method
    public int daysInMonth() {
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}
