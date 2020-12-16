package cn.itcast.day09.demo14;

import java.util.ArrayList;

//群主的类
public class Manager extends User{

    public Manager() {
        //super();
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        //首先需要一个集合，用来存储红包的集合
        ArrayList<Integer> redList = new ArrayList<>();

        //首先看一下群主有多少钱
        int leftMoney = super.getMoney();//群主当前余额
        if(totalMoney > leftMoney) {
            System.out.println("余额不足！");
            return redList;//返回空集合
        }

        //扣钱，其实就是重新设置余额
        super.setMoney(leftMoney - totalMoney);

        //发红包需要平均拆分成count份
        int avg = totalMoney/count;
        int mod = totalMoney % count;//余数，也就是甩下的零头

        //剩下的零头除不开，包在最后一个红包当中
        //下面吧红包一个一个塞到集合当中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        //最后一个红包
        int last = avg + mod;
        redList.add(last);

        return redList;
    }
}
