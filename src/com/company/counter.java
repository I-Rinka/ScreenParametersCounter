package com.company;

import java.util.Scanner;

public class counter {

    static double tan05 = 8.726868e-3;
    static double PPD = 57;
    double result;
    Scanner in = new Scanner(System.in);//这里以后可以加接口拓展

    //可以增加一个构造函数用来判别是什么类型的counter
    //如，根据给定ppi算对应retina距离的counter，给定距离和ppi判断是否retina的counter，给定使用距离算对应ppi的counter

    //用户自行输入ppi数据
    public double CountDistance(double ppi) {
        this.result = PPD / (2 * ppi * tan05);
        return this.result;
    }

    //直接从命令行调用
    public double CountDistance() {
        System.out.println("请输入单位英寸像素(ppi)：");
        double ppi = in.nextDouble();
        this.result = PPD / (2 * ppi * tan05);
        return this.result;
    }

    //增加一个out，或者是单位换算的函数
    public void Out() {
        System.out.printf("对应的公制是：%02f cm\n", (this.result * 2.54));
        System.out.printf("对应的英制是：%02f 英寸", this.result);
    }

    public static void main(String[] args) {
        counter distance = new counter();
        distance.CountDistance();
        distance.Out();

    }
}
