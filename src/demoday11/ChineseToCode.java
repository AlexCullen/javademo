package demoday11;

import java.nio.charset.Charset;

/**
 * @Author: cpzh
 * @Date: 2018/3/30 10:56
 * TODO: 汉字转区位码
 * 区位码: 4位十进制数， 每个区位对应一个汉字， 前两位是区码
 *         后两位是位码
 * 过程: 获取字符串的二进制字节数组， 数组中的二进制值减160， 转成字符串， 拼接字符串 组成
 *       汉字区位码
 * 编码格式：GBK
 */
public class ChineseToCode {
    public static void main(String[] args) {
        //中文字符
        String chinesWord = "吕";

        Charset charset = Charset.forName("GBK");
        byte[] chineseByte = chinesWord.getBytes(charset);
        String code = "";
        for(int i = 0; i<chineseByte.length; i++){
            // 0代表补零 2代表长度是2位 d代表是正数
            code += String.format("%02d", chineseByte[i] -= 160);
        }
        System.out.println(code);
    }
}
