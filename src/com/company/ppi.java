package com.company;

import java.util.Scanner;

public class ppi {
    int verticalPixels;
    int horizontalPixels;
    double diagonalLine;
    double PPI;

    public ppi() {
        Scanner pixelIn = new Scanner(System.in);
        System.out.println("请输入水平方向的像素数量：");
        this.verticalPixels = pixelIn.nextInt();
        System.out.println("请输入竖直方向的像素数量：");
        this.horizontalPixels = pixelIn.nextInt();
        System.out.println("请输入屏幕的对角线尺寸（英寸）：");
        this.diagonalLine = pixelIn.nextInt();
        this.PPI = Math.sqrt(this.verticalPixels * this.verticalPixels + this.horizontalPixels * this.horizontalPixels)
                / this.diagonalLine;
        pixelIn.close();
    }

    ppi(int verticalPixels, int horizontalPixels, double diagonalLine) {
        this.verticalPixels = verticalPixels;
        this.horizontalPixels = horizontalPixels;
        this.diagonalLine = diagonalLine;
        this.PPI = Math.sqrt(this.verticalPixels * this.verticalPixels + this.horizontalPixels * this.horizontalPixels)
                / this.diagonalLine;
    }
}
