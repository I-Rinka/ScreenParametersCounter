package com.company;

import java.util.Scanner;

public class ppi {
    int verticalPixels;
    int horizontalPixels;
    double diagonalLine;
    double PPIResult;
    Scanner pixelIn = new Scanner(System.in);

    public void GetPixels(int verticalPixels, int horizontalPixels) {
        //
    }

    public void PPICounter() {
        this.PPIResult = Math.sqrt(verticalPixels * verticalPixels + horizontalPixels * horizontalPixels) / this.diagonalLine;
    }

    public void GetPixels() {
        System.out.println("请输入水平方向的像素数量：");
        this.verticalPixels = this.pixelIn.nextInt();
        System.out.println("请输入竖直方向的像素数量：");
        this.horizontalPixels = this.pixelIn.nextInt();
        System.out.println("请输入屏幕的对角线尺寸（英寸）：");
        this.diagonalLine = this.pixelIn.nextInt();
    }
    public void GetPPI()
    {
        this.GetPixels();
        this.PPICounter();
    }
}
