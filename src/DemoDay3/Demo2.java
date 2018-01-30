package DemoDay3;

/**
 * @Author: cpzh
 * @Date: 2018/1/30 16:24
 * TODO: 九九乘法表
 */
public class Demo2 {
    public static void main(String[] args) {
        int[][] demo = new int[9][];
        for(int i = 0; i<demo.length; i++){
            demo[i] = new int[i+1];
            for(int j = 0; j<demo[i].length; j++){
                System.out.println((i+1)*(j+1));
            }
        }
    }
}
