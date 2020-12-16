package cn.itcast.day01;
/*
复合赋值运算符：
    +=     a += 3   相当于 a = a + 3
    -=
    *=
    /=
    %=     e %= 7   相当于

注意事项：
    1.只有变量才能使用赋值运算符
    2.复合赋值运算符中隐含了一个强制类型转换
 */
public class Demo07Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = a > b ? a : b;
        System.out.println("最大值:" + max);
    }
}
