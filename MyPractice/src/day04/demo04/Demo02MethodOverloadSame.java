package cn.itcast.day04.demo04;
/*
题目要求：
比较两个数据是否相等
参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型
 */
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {

    }

    public static boolean isSame(byte a, byte b){
        boolean same;
        if (a == b){
            same = true;
        }else{
            same = false;
        }
        return same;
    }
    public static boolean isSame(short a, short b){
        boolean same = a == b ? true:false;
        return same;
    }
    public static boolean isSame(int a, int b){
        return a == b;
    }
    public static boolean isSame(long a, long b){
        if (a == b){
            return true;
        }else {
            return false;
        }
    }
}
