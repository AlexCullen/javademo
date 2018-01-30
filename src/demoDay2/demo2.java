package demoDay2;

/**
 * @Author: cpzh
 * @Date: 2018/1/24 7:20
 * TODO:
 */
public class demo2 {
    public static void main(String[] args) {
        String[] birds = {"白鹭", "丹顶鹤", "黄鹂", "鹦鹉", "乌鸦", "喜鹊",
        "布谷鸟", "灰纹鸟", "百灵鸟"};
        int index = 0;
        while(index < birds.length){
            System.out.println(birds[index++]);
        }
    }
}
