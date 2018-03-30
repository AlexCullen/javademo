package demoday10;

/**
 * @Author: cpzh
 * @Date: 2018/3/29 16:10
 * TODO: 删除字符串中的空格
 */
public class TrimAllSpace {
    public static void main(String[] args) {
        String s = "Ja va 面 象 对 象 的编程语言";
        Long startTime1 = System.currentTimeMillis();
        String result = s.replaceAll(" ", "");
        Long endTime1 = System.currentTimeMillis();
        System.out.println(result);
        System.out.println(endTime1 - startTime1);


        Long startTime2 = System.currentTimeMillis();

        StringBuffer resultBuffer = new StringBuffer();
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == ' '){
                continue;
            }
            resultBuffer.append(s.charAt(i));
        }
        Long endTime2 = System.currentTimeMillis();

        System.out.println(resultBuffer.toString());
        System.out.println(endTime2 - startTime2);
    }
}
