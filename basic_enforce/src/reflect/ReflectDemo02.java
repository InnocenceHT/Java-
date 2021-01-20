package reflect;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Field;

/*
    Class对象功能：
        * 获取功能：
        1.获取成员变量们
            * Field[] getFields()
            * Field getField(String name)

            * Field[] getDeclaredFields()
            * Field getDeclaredField(String name)

        2.获取构造方法们
            * Constructor<?>[] getConstructors()
            * Constructor<T>[] getConstructors(类<?>...parameterTypes)

            * Constructor<T>[] getDeclaredConstructors(类<?>...parameterTypes)
            * Constructor<?>[] getDeclaredConstructors()

        3.获取成员方法们:
            * Method[] getMethods()
            * Method[] getMethods(String name,类<?>... parameterTypes)

            * Method[] getDeclaredMethods()
            * Method getDeclaredMethod(String name, 类<?>... parameterTypes)

        4.获取类名
            * String getName()

 */
public class ReflectDemo02 {
    //0.获取Person的Class对象
    Class personClass = Person.class;

    /*
        1.获取成员变量们
            * Field[] getFields()
            * Field getField(String name)

            * Field[] getDeclaredFields()
            * Field getDeclaredField(String name)
     */

    //1.Field[] getFields()
    Field[] fields = personClass.getFields();


}
