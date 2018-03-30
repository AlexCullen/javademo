package demoday11;


import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @Author: cpzh
 * @Date: 2018/3/30 13:12
 * TODO:温度单位转换工具
 * 过程： 知道其中的转换公式， 注意数值的类型
 *        华氏温度 = 摄氏温度*1.8 + 32
 *        摄氏温度 = (华氏温度 - 32)/1.8
 */
public class TemperatureConverter {
    public static void main(String[] args) {
        double centigrade = 18;
        double fahrenheit = 56;

        System.out.println(toFahrenheit(centigrade) + "华氏度");
        System.out.println(toCentigrade(fahrenheit) + "摄氏度");
    }

    /**
     * 摄氏温度转换为华氏温度
     * @param centigrade
     * @return
     */
    public static double toFahrenheit(double centigrade){
        //设置成两位小数
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return  Double.parseDouble(decimalFormat.format(centigrade * 1.8 + 32));
    }

    /**
     * 华氏温度转换为摄氏温度
     * @param fahrenheit
     * @return
     */
    public static double toCentigrade(double fahrenheit){
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return Double.parseDouble(decimalFormat.format((fahrenheit - 32) / 1.8));
    }

    public static double formatNumber(double number){
        double formatResult = 0;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String resultStr = decimalFormat.format(number);
        formatResult = Double.parseDouble(resultStr);

        String.format("%.2f", number);

        BigDecimal bigDecimal = new BigDecimal(number);
        bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);


        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.format(number);
        return formatResult;
    }
}
