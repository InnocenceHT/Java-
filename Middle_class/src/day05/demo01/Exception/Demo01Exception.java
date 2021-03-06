package day05.demo01.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.lang.Throwable:类时Java语言中所有的错误或异常的超类
        Exception：编译器异常，进行编译（写代码）Java程序出现的问题
            RuntimeException:运行期异常，Java成簇运行过程中出现的问题
            异常就相当于程序得了一个小毛病（感冒，发烧），把异常处理掉，程序可以继续执行
        Error:错误
            错误就相当于程序得了绝症（无法治愈），必须修改代码，程序才能继续执行
 */
public class Demo01Exception {

    public static void main(String[] args)  {
//        //Exception：编译器异常，进行编译（写代码）Java程序出现的问题
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//用来格式化日期
//        Date date = null;//把字符串格式的日期，解析为Data格式的日期
//
//        {
//            try {
//                date = sdf.parse("199-09-09");
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println(date);

//        int[] arr = {1,2,3};
////        System.out.println(arr[0]);
//
//        try{
//            //可能会出现异常的代码
//            System.out.println(arr[3]);
//        }catch (Exception e) {
//            //异常的处理逻辑
//            System.out.println(e);
//
//        }
        /*
            Error:错误
            OutOfMemoryError:Java heap space
            内存溢出的错误，创建的数组太大了，超出了给JVM分配的内存
         */

//        int[] arr = new int[1024*1024*1024];//OutOfMemoryError:
        //必须修改代码，创建的数组小一点
        int[] arr = new int[1024*1024];
        System.out.println("后续代码");
    }
}
