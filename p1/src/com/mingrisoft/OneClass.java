package com.mingrisoft;

import java.util.Random;
import java.util.Scanner;

public class OneClass {
    public static void main(String[] args) {
        System.out.println("—————模拟微信抢红包—————");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要装入红包的总金额:");
        double total = sc.nextDouble();
        System.out.print("请输入红包的个数:");
        int bagsnum = sc.nextInt();
        double min = 0.05;
        Random random = new Random();
        if (total/bagsnum == 0.01) {
            for (int i = 1; i<bagsnum; i++) {
                double money = min;
                total -= money;
                System.out.println("第"+ i +"个红包: "+ String.format("%.2f",money)+"元");
            }
        } else if (total/bagsnum < 0.01) {
            System.out.println("金额过低，请重新输入!");
            return;
        } else {
            for (int i=0; i<bagsnum;i++) {
                /*
                本次红包金额 = 当前剩余金额 - (红包总数-已发送红包数) * 红包最小金额
                当前剩余金额随机后记录
                 */
                double max = total - (bagsnum-i)*min;
                double bound = max - min;
//                double money = (double) random.nextInt((int) (max*1000))/1000;

                double safe = (double) random.nextInt((int) (bound*100)) /100;
                double money = safe + min;
                total = total - money;
                System.out.println("第"+ i +"个红包: "+ String.format("%.2f",money)+"元");
            }
        }System.out.println("第"+ bagsnum +"个红包: "+ String.format("%.2f",total)+"元");
        sc.close();
    }
}
