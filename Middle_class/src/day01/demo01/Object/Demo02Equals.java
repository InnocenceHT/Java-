package day01.demo01.Object;

/*
Person类默认继承了Object类，所以可以使用Object类的equals方法，
用于指示其他对象是否与此对象相等
格式：
    public boolean equals(Object obj) {
        return(this == obj)
    }
    参数：
        Object obj;
    方法体：
        比较运算符，返回值就是一个布尔值，true，false
        基本数据类型：比较的是值
        引用数据类型：比较的是两个对象的地址值
    this是谁？哪个对象调用的方法，方法中的this就是那个对象，p1调用的equals方法
    obj是谁？传递过来的参数p2
    this==obj --> p1==p2
 */
public class Demo02Equals {

    public static void main(String[] args) {
        Person p1 = new Person("迪丽热巴", 20);
        Person p2 = new Person("古力娜扎", 18);

        boolean b = p1.equals(p2);
        System.out.println(b);
    }
}
