package Demoday8;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @Author: cpzh
 * @Date: 2018/3/23 15:27
 * TODO:
 */
public class Demo3 {
    public static void main(String[] args) {
        double num = 33.3;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(numberFormat.format(num));

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        System.out.println(dateFormat.format(date));
    }
}
