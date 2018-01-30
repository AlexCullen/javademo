package demoDay2;

/**
 * @Author: cpzh
 * @Date: 2018/1/24 7:13
 * TODO: 用switch 语句根据消费金额计算折扣
 */
public class demo1 {
    public static void main(String[] args) {
        float money = 1206f;
        float rebate = 0f;
        if (money > 200) {
            switch ((int) money / 200) {
                case 1:
                    rebate = 0.95f;
                    break;
                case 2:
                    rebate = 0.9f;
                    break;
                case 3:
                    rebate = 0.85f;
                    break;
                case 4:
                    rebate = 0.83f;
                    break;
                case 5:
                    rebate = 0.8f;
                    break;
                case 6:
                    rebate = 0.78f;
                    break;
                case 7:
                    rebate = 0.75f;
                    break;
                case 8:
                    rebate = 0.73f;
                    break;
                case 9:
                    rebate = 0.7f;
                    break;
                case 10:
                    rebate = 0.65f;
                    break;
                default:
                    rebate = 0.65f;
            }
        }
        System.out.println("消费金额为: "+ money);
        System.out.println("您将享受 "+ rebate + "折优惠");
    }
}
