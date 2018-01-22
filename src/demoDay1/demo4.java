package demoDay1;

/**
 * @Author: cpzh
 * @Date: 2018/1/23 7:02
 * TODO: 自动类型转换 与 强制类型转换
 * RESULT: 类型从低到高 byte char short int long float double
 */
public class demo4 {
    public static void main(String[] args) {
        byte b = 127;
        char c = 'W';
        short s = 23561;
        int i = 3333;
        long l = 40000L;
        float f = 3.14159F;
        double d = 54.523;

        //低类型向高类型自动转换
        System.out.println("累加byte等于：" + b);
        System.out.println("累加char等于：" + (b + c));
        System.out.println("累加short等于：" + (b + c + s));
        System.out.println("累加int等于：" + (b + c + s + i));
        System.out.println("累加long等于：" + (b + c + s + i + l));
        System.out.println("累加float等于：" + (b + c + s + i + l + f));
        System.out.println("累加double等于：" + (b + c + s + i + l + f + d));

        //高类型到低类型的强制转换
        System.out.println("把long转换成int: " + (int)l);

        //高类型到低类型转换会丢失数据
        System.out.println("把int转换成short: " + (short)i);
        //实数到整数会舍弃小数部分
        System.out.println("把double转换成int: " + (int)d);
        //证书到字符类型的转换将获取对应编码的字符
        System.out.println("把short转换成char: " + (char)s);
    }
}
