package demoDay1;

import java.math.BigDecimal;

/**
 * @Author: cpzh
 * @Date: 2018/1/23 7:24
 * TODO: 更精确的使用浮点数(BigDecimal)
 * Result: BigDecimal实例化时 使用字符串作为参数
 */
public class demo7 {
    public static void main(String[] args) {
        double money = 2;
        double price = 1.12;

        double result = money - price;

        System.out.println("非精确计算: " + result);

        //精确浮点数的解决方法
        BigDecimal bMoney = new BigDecimal("2");
        BigDecimal bPrice = new BigDecimal("1.12");
        BigDecimal bResult = bMoney.add(bPrice);
        bResult = bMoney.subtract(bPrice);
        System.out.println("精确计算: " + bResult);
    }
}
