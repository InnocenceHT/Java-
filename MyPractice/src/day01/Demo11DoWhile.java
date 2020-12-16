/*
do-while循环的标准格式：

do{
    循环体
}while(条件判断);
扩展格式：

初始化语句
do{
    循环体
    步进语句
}while(条件判断);

 */


package cn.itcast.day01;

public class Demo11DoWhile {
    public static void main(String[] args) {
        for (int i = 1;i <= 100;i++){
            System.out.println("我错啦！" + i);
        }
        System.out.println("==============");
        int i = 1;//1.初始化语句
        do{
            System.out.println("我错啦！" + i);
            i++;
        } while(i <= 10);
    }
}
