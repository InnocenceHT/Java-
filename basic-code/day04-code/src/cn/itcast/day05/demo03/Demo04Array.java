package cn.itcast.day05.demo03;
/*
遍历数组，说的就是对数组当中的每一个元素注逐一处理，默认的处理方式就是打印输出
 */
public class Demo04Array {
    public static void main(String[] args) {
        int[] array = {15, 25, 30, 40, 50};

        //首先使用原始方式
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println("=======");

        //使用循环，次数就是数组的长度
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==========");
    }
}
