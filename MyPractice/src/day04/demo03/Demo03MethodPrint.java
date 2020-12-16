package cn.itcast.day04.demo03;
/*
题目要求
定义一个方法，打印指定次数的HelloWorld
 */
public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(10);
    }

    /*
    三要素
    返回值类型：只是打印而已，无返回值
    方法名称：printCount
    参数列表：组要知道打印多少次，int a
     */
    public static void printCount(int a){
        for (int i = 1; i <= a; i++) {
            System.out.println("HelloWorld" + i);
        }
    }
}
