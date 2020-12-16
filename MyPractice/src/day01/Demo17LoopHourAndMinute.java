package cn.itcast.day01;

public class Demo17LoopHourAndMinute {
    public static void main(String[] args) {
        for (int hour = 0; hour<24; hour++){
            for (int min = 0; min<60; min++){
                System.out.println(hour + "点" + min + "分");
            }
        }
    }
}
