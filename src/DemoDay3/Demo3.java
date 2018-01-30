package DemoDay3;

import java.math.BigDecimal;

/**
 * @Author: cpzh
 * @Date: 2018/1/30 16:29
 * TODO: 1+ 1/2! + 1/3! + ...+ 1/20!
 */
public class Demo3 {
    public static void main(String[] args) {
        BigDecimal result = new BigDecimal(0.0);
        BigDecimal downNum = new BigDecimal(1.0);
        int i =1;
        while(i <= 20){
            result = result.add(downNum);
            i++;
            downNum = downNum.multiply(new BigDecimal(1.0/i));
        }
        System.out.println(result);
//        for(int i = 0; i< 20; i++){
//
//        }
    }
}
