package day01.demo07Integer;

/*
基本数据类型与字符串之间的转换：
    基本数据类型 --> 字符串
    1.基本数据类型的值+"",最简单的方式（工作中常用）
    2.使用包装类中的静态方法
        static String toString(int i)返回一个表示指定整数的String对象
    3.使用String类中的静态方法
        static String valueOf(int i) 返回int参数的字符串表示形式
    字符串 --> 基本类型
        使用包装类的静态方法parseXX("字符串")
            Integer类： static int parseInt(String s)
            Double类：  static double parseDouble(String s)
            ...

 */

public class Demo03Integer {

    public static void main(String[] args) {
        //基本数据类型 --> 字符串
        String s1 = 100 + "";
        System.out.println(s1+200);

        String s2 = Integer.toString(100);
        System.out.println(s2);

        String s3 = String.valueOf(200);
        System.out.println(s3 + 100);

        // 字符串 --> 基本类型
        int i = Integer.parseInt("100");
        System.out.println(i + 200);

        int i2 = Integer.parseInt("a");//数字格式化异常
        System.out.println(i2);
    }
}
