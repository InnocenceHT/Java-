package cn.itcast.day01;
/*
四则运算中的加号“+”有常见的三种用法：

1.对于数值来说，就是加法
2.对于字符char类型来说，在计算之前，插入会被提升成int,然后计算
char类型字符，和int类型数字之间的对照关系表：ASCII,Unicode
3.对于字符串string来说，加号代表字符串连接操作,
任何数据类型和字符串进行连接的时候，结果都会变成字符串

 */
public class Demo05Plus {
    public static void main(String[] args) {
        //字符串型变量的基本使用
        //数据类型 变量名称 = 数据值
        String str1 = "hello";
        System.out.println(str1);

        System.out.println("hello" + "world");

        String str2 = "java";
        //String+int -->
        System.out.println(str2+20);

        //优先级问题
        System.out.println(str2 + 20 + 30);

        System.out.println(str2 + (20 + 30));

    }
}
