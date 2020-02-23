package com.soft1851.seven.homework.four;

/**
 * @ClassName ConsumerTest
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/23
 **/
public class ConsumerTest {
    public static void main(String[] args) {
        ConsumerTest consumerTest = new ConsumerTest();
        consumerTest.text("第七小组", item -> System.out.println(item+"最棒！" ),
                item -> System.out.println(item+"的长度是："+item.length()));
    }

    /**
     *
     * @param str 传入的参数
     * @param consumer 行为定义
     * @param andThen 滞后的行为
     */
    private void text(String str, Consumer<String> consumer, Consumer<String> andThen) {
        consumer.andThen(andThen).accept(str);
    }


}