package demoday10;

/**
 * @Author: cpzh
 * @Date: 2018/3/29 16:05
 * TODO:
 */
public class StringAndStringBuffer {
    public static void main(String[] args) {
        Long startTime1 = System.currentTimeMillis();
        String startStr = "s";

        for(int i = 0; i< 10000; i++){
            startStr += "s";
        }
        Long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1 - startTime1);


        Long startTime2 = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0; i< 10000; i++){
            stringBuffer.append("s");
        }
        Long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2 - startTime2);
    }
}
