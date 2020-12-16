/*
题目：求出1到100之间的偶数和
思路：
1.从1到100这么多数字一个个检查
2.总共100个数字，并非所有数字都能用，必须是偶数才能用，判断（if语句）偶数：num % 2== 0
3.需要一个变量进行累加操作
 */

package cn.itcast.day01;

public class Demo12HundredSum {
    public static void main(String[] args) {
//        int sum = 0;//用来累加
//        for (int i = 1;i<=100;i++){
//            if(i % 2 == 0){
//                sum += i;
//            }
//        }
//        System.out.println("结果是"+ sum);
//        System.out.println("===========");

//        int i = 1;
//        int sum = 0;
//        while(i<=100){
//            if (i % 2 == 0){
//                sum +=i;
//            }
//            i++;
//        }
//        System.out.println("结果是"+sum);
        int sum = 0;
        int i = 1;
        do{
            if (i % 2 ==0){
                sum += i;
            }
            i++;
        }while(i<=100);
        System.out.println("结果是"+sum);
    }
}
