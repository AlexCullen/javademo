package demoDay1;

import java.util.Scanner;

/**
 * @Author: cpzh
 * @Date: 2018/1/23 6:26
 * TODO: 从控制台接收输入字符
 */
public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的身份证号\n");
        String line = scanner.nextLine();
        System.out.println("你身份证号是"+ line.length() + "位数字");
    }
}
