package cn.itcast.day04.demo03;
/*
题目要求：
定义一个方法，用来判断两个数字是否相同

 */
public class Demo01MethodSame {
    public static void main(String[] args) {
        isSame(3,2);
        System.out.println(isSame(3,2));
    }

    /*
    三要素：
    返回值类型：boolean
    方法名称：isSame
    参数列表：int a,int b
     */
    public static boolean isSame(int a, int b){
//        boolean same;
//        if (a == b){
//            same = true;
//        }else{
//            same = false;
//        }
        boolean same = a == b? true : false;

        return same;
    }
}