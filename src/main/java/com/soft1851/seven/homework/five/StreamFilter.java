package com.soft1851.seven.homework.five;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StreamFilter
 * @Description Filter过滤
 * @Author wanghuanle
 * @Date 2020/2/23
 **/
public class StreamFilter {
    public static void main(String[] args) {
        //定义一个list集合
        List<String> stringLists = new ArrayList<>();
        //在集合中添加一些元素
        stringLists.add("aaa1");
        stringLists.add("bbb1");
        stringLists.add("ccc1");
        stringLists.add("aaa2");
        stringLists.add("bbb2");
        //过滤出我们想要的，含有“a”的字符串
        stringLists.stream().filter((s) -> s.startsWith("a")).forEach(System.out::println);
    }
}