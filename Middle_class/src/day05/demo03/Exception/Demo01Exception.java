package day05.demo03.Exception;

import java.util.List;

/*
    异常的注意事项
 */
public class Demo01Exception {

    public static void main(String[] args) {
        /*
            多个异常使用捕获应该如何处理：

            1.多个异常分别处理
            2.多个异常一次捕获，多次处理
            3.多个异常一次捕获，一次处理
         */

        //1.多个异常分别处理
//        try{
//            int[] arr = {1,2,3};
//            System.out.println(arr[3]);////ArrayIndexOutOfBoundsException
//        }catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
//        }
//
//        try{
//            List<Integer> list = List.of(1, 2, 3);
//            System.out.println(list.get(3));//ArrayIndexOutOfBoundsException:
//        }catch (IndexOutOfBoundsException e) {
//            System.out.println(e);
//        }


        //2.多个异常一次捕获，多次处理

        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);////ArrayIndexOutOfBoundsException

            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));//ArrayIndexOutOfBoundsException:
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        /*
            一个try多个catch注意事项：
                catch里边定义的异常变量如果有子父类关系，那么子类的异常变量必须写在上面，否则会报错
         */

        //3.多个异常一次捕获，一次处理
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);////ArrayIndexOutOfBoundsException

            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));//ArrayIndexOutOfBoundsException:
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }




        System.out.println("后续代码");

    }
}
