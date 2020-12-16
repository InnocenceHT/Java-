package day01.demo01.Object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
    java.lang.Object类
    类 Object 是类层次结构的根(最顶层类).每个类都使用Object作为父类
    所有对象(包括数组)都实现这个类的方法

 */
public class Demo01ToString {

    public static void main(String[] args) {
        /*
            Person类默认继承了Object类，所以可以使用Object类当中的toString方法
            String toString()返回该对象的字符串表示
         */

        Person p = new Person("张三", 20);
        String s = p.toString();
        System.out.println(s);

        //直接打印对象的名字，其实就是调用对象的toString方法
        System.out.println(p);

        //看一个类是否重写了toString方法，直接打印这个类对象对应的名字即可
        //如果没重写，打印的为地址值，重写了打印的是重写的方式

        Random r = new Random();
        System.out.println(r);

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
    }

}