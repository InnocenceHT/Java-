package cn.itcast.day01;

public class Demo05IfElsePractice {
    public static void main(String[] args) {
        int x = 88;
        if(x>=90 && x<=100){
            System.out.println("成绩优秀！");
        }else if(x >= 80 && x < 90){
            System.out.println("成绩好！");
        }else if(x >= 70 && x < 80){
            System.out.println("成绩良好！");
        }else if(x >= 60 && x < 70){
            System.out.println("及格！");
        }else if(x >= 0 && x < 60){
            System.out.println("不及格！！");
        }else{
            System.out.println("数据错误！");
        }
    }
}
