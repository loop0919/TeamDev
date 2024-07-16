package jp.te4a.teama.rsv.component;

import java.util.Date;

public class DateUtil {
    public static String getToday() {
        Date today = new Date();
        return today.toString();
    }
}
