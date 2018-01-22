package demoDay1;

/**
 * @Author: cpzh
 * @Date: 2018/1/23 7:33
 * TODO: 实现2个变量互换（没有第三个参数参与）
 * Result: 用于数字 String的不行
 */
public class demo9 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("执行互换");
        a = a^b;
        b = b^a;
        a = a^b;
        System.out.println(a + "," + b);
    }
}
