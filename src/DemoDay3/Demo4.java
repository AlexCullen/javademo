package DemoDay3;

/**
 * @Author: cpzh
 * @Date: 2018/1/30 16:44
 * TODO: 输出菱形
 */
public class Demo4 {
    public static void main(String[] args) {
        createDemo(10);
    }

    public static void createDemo(int size){
        if(size % 2 == 0){
            size++;
        }
        for(int i = 0; i< size/2+1; i++){
            for(int j = size/2 + 1; j > i+1; j--){
                System.out.print("\t");
            }
            for(int j = 0; j< 2*i + 1; j++){
                if(j == 0 || j == 2*i){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println("");
            System.out.println("");
        }

        for(int i = size/2+1; i< size; i++) {
            for (int j = 0; j < i - size/2; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < 2 * size - 1 - 2*i; j++) {
                if (j == 0 || j == 2 * (size - i -1)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println("");
            System.out.println("");

        }
    }
}
