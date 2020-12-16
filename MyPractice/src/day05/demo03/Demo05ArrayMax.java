package cn.itcast.day05.demo03;

public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {5, 15, 30, 20, 10000};

        int max = array[0];//比武擂台
        for (int i = 1; i < array.length; i++) {
            //如果当前元素，比max更大，则换人
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
