package demoDay1;

import java.util.Scanner;

/**
 * @Author: cpzh
 * @Date: 2018/1/23 7:21
 * TODO: 三目判断奇偶数
 */
public class demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer line = scanner.nextInt();
        String check = (line % 2 == 0 ) ? "偶数" : "奇数";
        System.out.println(check);
    }
}
