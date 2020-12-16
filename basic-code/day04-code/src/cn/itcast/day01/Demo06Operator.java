package cn.itcast.day01;
/*
自增运算符：++
自减运算符：--
含义：让一个变量涨一个数字或者降一个数字
使用模式：写在变量名称之前或者之后，例如：++num,num++
使用方式：
    1.单独使用：不和其他任何操作混合，自己独立成为一个步骤
    2.混合使用：和其他操作混合，例如与赋值，打印操作混合等等
使用区别：
    1.在单独使用的时候，前++和后++没有任何区别
    2.在混合使用的时候，有【重大区别】
        A.如果是【前++】，那么变量立刻马上+1，然后拿着结果使用  【先加后用】
        B.如果是【后++】，那么先使用变量本来的数值，然后再让变量+1   【先用后加】
注意事项：
    只有【变量】才能使用自增，自减运算符。常量不可发生改变，所以不能用。
 */
public class Demo06Operator {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        ++num1;//单独使用
        System.out.println(num1);
        num1++;//单独使用
        System.out.println(num1);
        System.out.println("-----------------");

        //与打印操作混合的时候
        int num2 = 20;
        System.out.println(++num2);//前++
        System.out.println(num2++);//后++
        System.out.println(num2);
        System.out.println("------------");

        int x = 10;
        int y = 20;
        int result3 = ++x + y--;
        System.out.println(result3);//31
        System.out.println(x);//11
        System.out.println(y);//19

    }
}
