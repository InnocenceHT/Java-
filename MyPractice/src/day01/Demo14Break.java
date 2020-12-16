package cn.itcast.day01;

public class Demo14Break {
    public static void main(String[] args) {
        for (int i = 1;i<=100;i++){
            System.out.println("很好"+i);
            if (i>10){
                break;
            }
        }
    }
}
