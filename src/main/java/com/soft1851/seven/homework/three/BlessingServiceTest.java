package com.soft1851.seven.homework.three;

/**
 * @ClassName BlessingServiceTest
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/23
 **/
public class BlessingServiceTest {
    public static void main(String[] args) {
        BlessingServe blessingServe= bless -> {
            System.out.println(bless);
        };
        blessingServe.sayBlesstoWuHan("祝福武汉，祝福中国，祝福全世界，2020特殊的一年，" +
                "2020众志成城，愿往后的日子，一切都向着好的方向前行！");
    }
}