package day01.demo02.date;

/*
    java.util.Date：表示日期和时间的类
    类 Date表示特定的瞬间，精确到毫秒
    毫秒：千分之一秒
    特定的瞬间：一个时间点，一刹那时间

    毫秒值的作用：对时间和日期进行计算
    可以把日期转化为毫秒进行计算，计算完毕把毫秒转化为日期

    把日期转化为毫秒：
        当前的日期：2088-01-01
        时间原点（0毫秒）：1070年1月1日00：00：00
        就是计算当前日期到时间原点之间一共经历了多少毫秒
    注意事项：
        中国属于东八区，会把时间再增加八个小时

    把毫秒转化为日期：
        1天 = 24 * 60 * 60 = 86400秒*1000 = 86400000毫秒

 */
public class Demo01Date {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
    }
}
