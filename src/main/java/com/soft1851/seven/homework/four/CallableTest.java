package com.soft1851.seven.homework.four;
/**
 * @ClassName CallableTest
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/23
 **/
public class CallableTest  {
    public static void main(String[] args) {
        Callable<String> consumer = System.out ::println;
        consumer.accept("1111");
//        ArrayList<String> arrayList = new ArrayList<>();
//        Callable<ArrayList> consumer1 = (e)-> e.add("111");
    }
}