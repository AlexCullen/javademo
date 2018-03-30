package Demoday8;

/**
 * @Author: cpzh
 * @Date: 2018/3/23 14:51
 * TODO:
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {2, 25, 24, 15, 3, 1};

        int temp;
        int j;
        for(int i = 1; i< arr.length; i++){
            temp = arr[i];
            for(j=i-1; j>= 0 && arr[j] > temp; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }

        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
