package demo06.TryCatch;

import java.io.FileWriter;
import java.io.IOException;

/*
    在JDK1.7之前使用try catch finally处理流中的异常
    格式：
        try{
            可能出现异常的代码
        }catch(异常类变量 变量名){
            异常的处理逻辑
        }finally(){
            一定会执行的代码
            资源释放
        }
 */
public class Demo01TryCatch {

    public static void main(String[] args) {
        //提高变量fw的作用域，让finally可以使用
        //变量在定义的时候可以没有值，但是使用的时候必须有值
        //ffw = new FileWriter("09_IOAndProperties\\g.txt", true);执行失败，fw没有值，fw.close会报错
        FileWriter fw = null;

        try {
            fw = new FileWriter("09_IOAndProperties\\g.txt", true);
            for (int i = 0; i < 10; i++) {
                fw.write("HelloWorld" + i +"\r\n");

            }

        }catch (IOException e) {
            //异常的处理逻辑
            System.out.println(e);
        }finally {
            //一定会执行的代码
            //创建对象失败了，fw的默认是就是null，null是不能调用方法的，会抛出空指针异常
            if (fw != null) {
                try {
                    //fw.close方法生命抛出了IOException异常对象，所以我们就得处理这个对象，要么trycatch，要么throws
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
