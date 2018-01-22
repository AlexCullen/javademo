package demoDay1;

import java.util.Scanner;

/**
 * @Author: cpzh
 * @Date: 2018/1/23 7:15
 * TODO: 加密运算  （位运算^）
 */
public class demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个英文字符串或解密字符串");
        String line = scanner.nextLine();
        char[] chars = line.toCharArray();
        for(int i =0; i< chars.length; i++){
            chars[i] = (char) (chars[i]^2000);
        }
        System.out.println("加密或解密结果如下: ");
        System.err.println(new String(chars));
    }
}
