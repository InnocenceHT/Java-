package day02.demo03.Generic;

public class Demo02GenericClass {

    public static void main(String[] args) {

        //不写泛型默认为Object类型
        Generic gc = new Generic();
        gc.setName("只能是字符串");

        //创建GenericClass对象，泛型使用Integer类型
        Generic<Integer> gc2 = new Generic<>();
        gc2.setName(1);

        System.out.println(gc2.getName());

        //创建GenericClass对象，泛型使用String类型
        Generic<String> gc3 = new Generic<>();
        gc3.setName("小明");

        System.out.println(gc3.getName());


    }
}
