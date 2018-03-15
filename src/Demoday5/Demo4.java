package Demoday5;

/**
 * @Author: cpzh
 * @Date: 2018/2/2 17:08
 * TODO:冒泡排序
 */
public class Demo4 {
    public static void main(String[] args) {
           sort1();
    }

    public static void sort1(){
        int[] arr = {63, 4, 24, 1, 3, 15};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
