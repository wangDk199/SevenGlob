package com.soft1851.seven.homework.homework.three;

/**
 * @author ：zhengliang
 * @date ：2020/2/23 13:59
 * @description：TODO
 */
public class BendictionServiceTest {
    public static void main(String[] args) {
        BenedictionService benedictionService = new BenedictionService() {
            @Override
            public void sayBendiction(String name, String bendiction) {
                System.out.println(name+":"+bendiction);
            }
        };
        benedictionService.sayBendiction("郑亮","武汉加油，中国加油，待到春暖花开，我们一起吃热干面");
    }
}
