package com.soft1851.seven.homework.five;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName StreamTest
 * @Description Stream的练习
 * @Author wanghuanle
 * @Date 2020/2/23
 **/
public class StreamSort {
    public static void main(String[] args) {
        //该方法按照长度对字符串集合用stream进行递减排序，然后截短流前5个，再把流转换成集合，得到结果
        List<String> stringList = new ArrayList<>(Arrays.asList("JavaScript","Java","JavaWeb","SpringFramework","JavaAPI"));
        List<String> collect = stringList.stream().sorted((str1,str2) -> str2.length() - str1.length()).limit(5).collect(Collectors.toList());
        System.out.println(collect);
    }
}