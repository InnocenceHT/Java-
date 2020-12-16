package cn.itcast.day05.demo04;
/*
一个方法可以有0，1等多个参数，但是只能由1个返回值，不能有多个返回值
如果希望一个方法中产生了多个结果数据进行返回，怎么办？
解决方案：使用一个数组作为返回值类型即可

 */
public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10, 20, 30);
        System.out.println("总和" + result[0]);
        System.out.println("平均数" + result[1]);
    }

    public static int[] calculate(int a, int b, int c){
        int sum = a + b + c;//总和
        int avg = sum / 3;//平均数
        int[] array = {sum, avg};
        return array;
    }
}
