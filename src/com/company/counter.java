package com.company;

import java.util.Scanner;

public class counter {

    private static double tan05 = 8.726868e-3;
    private static double PPD = 57;
    double Distance;
    Scanner in = new Scanner(System.in);// 这里以后可以加接口拓展

    // 用户自行输入ppi数据
    public counter(double ppi) {
        this.Distance = PPD / (2 * ppi * tan05);
    }
    // 从命令行获得ppi
    public counter()
    {

    }
    // 可以增加一个构造函数用来判别是什么类型的counter
    // 如，根据给定ppi算对应retina距离的counter，给定距离和ppi判断是否retina的counter，给定使用距离算对应ppi的counter


    // 增加一个out，或者是单位换算的函数
    public void OutPutAnswer() {
        System.out.println("为了达到视网膜标准，眼睛和屏幕的距离下限为：");
        System.out.printf("对应公制是：%02f cm\n", (this.Distance * 2.54));
        System.out.printf("对应英制是：%02f 英寸", this.Distance);
    }
}
