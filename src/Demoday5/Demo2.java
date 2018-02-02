package Demoday5;

/**
 * @Author: cpzh
 * @Date: 2018/2/2 7:45
 * TODO:
 */
public class Demo2 {
    public static void main(String[] args) {
        String input= "测试123456";
        String output= "";
        char[] chars = input.toCharArray();
        for(int i =chars.length-1;i>=0; i--){
            output+= chars[i];
        }
        System.out.println(output);
    }
}
