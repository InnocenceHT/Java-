package day07.demo03.Lambda;

public class Demo02Lambda {

    public static void main(String[] args) {
        //使用匿名内部类的方式，实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程创建了");
            }
        }).start();

        //使用Lambda表达式，实现多线程
        new Thread(()->{
                System.out.println(Thread.currentThread().getName() + "新线程创建了");
            }
        ).start();
    }
}
