/*
永远停不下来的循环，叫死循环
死循环的标准格式：
while(true){
    循环体
}
 */

package cn.itcast.day01;

public class Demo16DeadLoop {
    public static void main(String[] args) {
       while(true){
           System.out.println("i love java!");
       }

    }
}
