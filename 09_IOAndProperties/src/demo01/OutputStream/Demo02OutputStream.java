package demo01.OutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    一次写多个字节的方法：
        -public void write(byte[] b):将b.length字节从指定的字节数组写入此输出流
        -public void write(byte[] b, int off, int len):从指定的字节数组写入len字节，从偏移量off开始输出到此输出流
 */
public class Demo02OutputStream {

    public static void main(String[] args) throws IOException {
        //1.创建FileOutputStream对象，构造方法中绑定要写入数据的目的地
        FileOutputStream fos = new FileOutputStream(new File("09_IOAndProperties\\b.txt"));

        //2.调用FileOutputStream对象中的方法write，把数据写入到文件中
        //在文件中显示100，写三个字节
        fos.write(49);
        fos.write(48);
        fos.write(48);

        /*
            -public void write(byte[] b):将b.length字节从指定的字节数组写入此输出流
            一次写多个字节：
                如果写的第一个字节是整数，那么显示的时候会查询ASCII码表
                如果写的第一个字节是负数，那么第一个字节回合第二个字节，两个字节组成一个中文显示，查询系统默认码表（GBK）

         */
        byte[] bytes = {65,66,67,68,69};
//        byte[] bytes = {-65,-66,-67,68,69};
        fos.write(bytes);//ABCDE

        /*
            -public void write(byte[] b, int off, int len):把字节数组的一部分写入到文件中
                int off:数组开始的索引
                int len:写几个字节
         */

        fos.write(bytes,1,2);

        /*
            写入字符串的方法：可以使用String类中的方法吧字符串，转化为为字节数组
                byte[] getBytes()  把字符串转化为字节数组
         */
        byte[] bytes2 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes2));
        fos.write(bytes2);

        //3.释放资源（使用流会占用一定的内存，使用完毕要把内存清空，提升程序的效率）
        fos.close();

    }
}
