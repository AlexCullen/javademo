package demoDay1;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @Author: cpzh
 * @Date: 2018/1/23 6:32
 * TODO:重定向输出流实现程序日志
 * RESULT： 路径问题不知到怎么办
 */
public class demo3 {
    public static void main(String[] args) {
        try {
            PrintStream out = System.out;
            System.out.println();
            PrintStream ps = new PrintStream("/log.txt");
            System.setOut(ps);

            int age = 18;
            System.out.println("年龄变量定义成功， 初始值为18");

            String sex = "女";
            System.out.println("性别变量定义成功， 初始值为女");

            String info = "这个" +
                    sex +
                    "女孩子，应该有" +
                    age + "岁了";

            System.out.println("整合两个变量为info字符串， 其结果为" + info);

            System.setOut(out);
            System.out.println("程序运行完毕， 请查看日志文件");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
