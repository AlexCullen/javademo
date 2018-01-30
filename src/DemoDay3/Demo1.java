package DemoDay3;

/**
 * @Author: cpzh
 * @Date: 2018/1/30 16:14
 * TODO: for 循环 杨辉三角
 */
public class Demo1 {
    public static void main(String[] args) {
        int[][] triangle = new int[8][];
        for(int i = 0; i<triangle.length; i++){
            triangle[i] = new int[i+1];
            for(int j = 0; j<triangle[i].length; j++){
                if(i == 0 || j == 0 || j == triangle[i].length-1){
                    triangle[i][j] = 1;
                }else{
                    triangle[i][j] = triangle[i-1][j] + triangle[i-1][j-1];
                }
                System.out.println(triangle[i][j] +"\t");
            }
            System.out.println();
        }
    }
}
