package Demoday5;

/**
 * @Author: cpzh
 * @Date: 2018/2/2 7:58
 * TODO:选择排序 每次循环找出最大最小值 放到末尾
 */
public class Demo3 {
    public static void main(String[] args) {
        sort1();

        //方法二
//        sort2();
    }

    public static void sort1(){
        int[] arr = {63, 4, 24, 1, 3, 15};
        //选择最大的
        for(int i = 0; i<arr.length; i++){
            int max = arr[0];
            for(int j = 0; j<arr.length; j++){
                if(max < arr[j]){
                    max = arr[j];
                    arr[j] = arr[i];
                    arr[i] = max;
                }
            }
            arr[i] = arr[arr.length-1];
            arr[arr.length-1] = max;
        }

        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void sort2(){
        int[] arr = {63, 4, 24, 1, 3, 15};
        //选择最大的
        int index;
        for(int i = 0; i<arr.length; i++){
            index = 0;
            for(int j = 0; j<arr.length-i; j++){
                if(arr[index] < arr[j]){
                    index = j;
                }
            }
            int temp = arr[arr.length - i-1];
            arr[arr.length - i-1] = arr[index];
            arr[index] = temp;
        }

        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
