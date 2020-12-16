package cn.itcast.day07.demo03;

import java.util.Random;

/*
题目要求：
根据int变量的值，来获取随机数字，范围是[2,n]，可以取到2，也可以取到n

思路：
1.定义一个int变量n,随意赋值
2.要使用Random：三个步骤，导包，创建，使用
3.整体加一
4.打印随机数字
 */
public class Demo03Random {

    public static void main(String[] args) {
        int n = 10;
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int result = r.nextInt(n) + 1;
            System.out.println(result);
        }


    }
}
