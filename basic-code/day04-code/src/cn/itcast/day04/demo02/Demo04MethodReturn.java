package cn.itcast.day04.demo02;
/*
题目要求，定义一个方法，用来【求出】两个数字之和。(你帮我算，算完之后把结果告诉我)
题目变形：定义一个方法，用来【打印】两个数字之和。(你来算算，算完之后你自己负责显示结果，不用告诉我结果)
 */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        int num = getSum(3,2);
        System.out.println("返回值是：" + num);
        System.out.println("========");

        printSum(100,200);
    }
    //我是一个方法，我负责两个数字相加
    //我有返回值int，谁调用我我就把返回结果告诉谁
    public static int getSum(int a, int b){
        int result = a + b;
        return result;
    }

    //我平时一个方法，我负责两个数字相加
    //我没有返回值，不会结果告诉任何人，二十我自己打印输出
    public static void printSum(int a, int b){
        int result = a + b;
        System.out.println("结果是:"+ result);
    }
}
