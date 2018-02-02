package Demoday5;

/**
 * @Author: cpzh
 * @Date: 2018/2/2 7:21
 * TODO:利用数组随机抽取幸运观众
 */
public class Demo1 {
    public static void main(String[] args) {
        String names = "张三,李四,王五,赵六,马七";
        String[] nameArr = names.split(",");
        int index = (int)(Math.random()*nameArr.length);
        System.out.println(nameArr[index]);
    }
}
