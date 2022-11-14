package com.mingrisoft;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutPosition extends JFrame {
    public FlowLayoutPosition(){
        // 设置窗体标题
        setTitle("窗体使用流布局管理器");
        // 创建窗体
        Container c = getContentPane();
        // 设置窗体使用流布局管理器，使组件右对齐、组件之间水平间隔10像素、垂直间隔10像素
        setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
        for (int i = 0; i < 10;i++) {
            // 添加10个按钮
            c.add(new JButton("button"+i));
        }
        // 设置窗体大小
        setSize(300,200);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        // 设置窗体可见
        setVisible(true);
    }
    public static void main(String[] args){
        new FlowLayoutPosition();
    }
}
