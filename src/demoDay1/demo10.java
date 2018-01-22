package demoDay1;

import java.util.Scanner;

/**
 * @Author: cpzh
 * @Date: 2018/1/23 7:37
 * TODO: 判断某一年是否为闰年
 */
public class demo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        String check = (year % 4 == 0
                && year % 100 !=0
                || year % 400 ==0) ? "闰年" : "平年";
        System.out.println(check);
    }
}
