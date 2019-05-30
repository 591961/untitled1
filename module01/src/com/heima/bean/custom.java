package com.heima.bean;

import java.util.ArrayList;

public class custom {

    public static void main(String[] args) {


        int num=10;
        System.out.println("hello");
        System.out.println("args = [" + args + "]");
        System.out.println("num = " + num);
        System.out.println("custom.main");
        System.out.println(num);
        String[] arr=new String[]{"张三","李四","王五"};
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("---------");
        for (String s : arr) {
            System.out.println(s);
        }
        ArrayList list = new ArrayList();
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("39");
        list.add("30");
        list.add("1");
        for (Object o : list) {
            System.out.println(o);
        }


    }
}
