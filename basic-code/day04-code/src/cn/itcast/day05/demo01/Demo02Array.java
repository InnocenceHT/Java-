package cn.itcast.day05.demo01;
/*
动态初始化（指定长度）：在创建数组的时候，直接指定数组当中的数据元素个数
静态初始化（指定内容）：在创建数组的时候，直接指定数组当中的数据内容

静态初始化的基本格式：
数据类型[] 数组名称 = new 数据类型[] {元素1，元素2，...};
数组一定有长度
 */
public class Demo02Array {
    public static void main(String[] args) {
        //直接创建一个数组，里面全部都是int数字，具体为：5，15，25
        int[] arrayA = new int[] {5, 15, 25};

        //创建一个数组，里面都是字符串，具体为；"hello","world","java"
        String[] arrayB = new String[] {"hello", "world", "java"};
    }
}
