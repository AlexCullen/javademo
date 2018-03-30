package demoday9;

import java.util.regex.Pattern;

/**
 * @Author: cpzh
 * @Date: 2018/3/27 13:14
 * TODO: 检测字符串中的字符串个数
 */
public class Demo1 {
    public static void main(String[] args) {
        String s = "test测试sa十大assssa";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean matches = Pattern.matches("^[\u4E00-\u9FA5]{0,}$"
                    , s.charAt(i) + "");
            if (matches) {
                count++;
            }
        }

        System.out.println(count);
    }
}
