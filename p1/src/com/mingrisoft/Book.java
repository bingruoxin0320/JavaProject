package com.mingrisoft;

import javax.swing.*;
import java.awt.*;

public class Book extends JFrame {
    public void CreateJFrame(String title) {
        JFrame jf = new JFrame(title);
        Container container = jf.getContentPane();
        JLabel jl = new JLabel("这是一个JFrame窗体");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        container.setBackground(Color.blue);
        jf.setVisible(true);
        jf.setLocation(400,300);
        jf.setSize(200,150);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        System.out.println("不可见窗体");


    }

    public static void main(String[] args) {
        new Book().CreateJFrame("尝试创建窗体");
    }
}