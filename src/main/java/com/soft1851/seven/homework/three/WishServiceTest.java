package com.soft1851.seven.homework.three;

/**
 * @ClassName WishServiceTest
 * @Description 实现接口的类
 * @Author wanghuanle
 * @Date 2020/2/23
 **/
public class WishServiceTest {
    public static void main(String[] args) {
        WishService wishService = wishWord -> {
            System.out.println("王欢乐写给武汉的祝福语：");
            System.out.println(wishWord);
        };
        wishService.sayWish("武汉加油，白衣天使加油，中国加油！");
    }
}