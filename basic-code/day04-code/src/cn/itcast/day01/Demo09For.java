/*
循环结构的基本组成部分，一般可以分为四个部分：

1.初始化语句：在循环开始最初执行，而且只执行唯一一次。
2.条件判断：如果成立，则循环继续；如果不成立，则循环退出
3.循环体：重复要做的事情内容，若干行语句
4.步进语句：每次循环之后都要进行的扫尾工作，每次循环结束后都要执行一次

 */

package cn.itcast.day01;

public class Demo09For {
    public static void main(String[] args) {
//        for (初始化语句;条件判断;步进语句){
//            循环体
//        }
        for (int i = 1; i <= 100; i++ ){
            System.out.println("我错啦！原谅我吧！" + i);
        }
        System.out.println("程序停止！");
    }
}
