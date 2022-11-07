package com.mingrisoft;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyJDialog extends JDialog {   // 创建自定义对话框类，并继承JDialog
    public MyJDialog(MyFrame frame) {
        super(frame, "第一个JDialog窗体", true); // 实例化一个JDialog类对象，指定对话框的父窗体，标题和类型
        Container container = getContentPane();
        container.add(new JLabel("这是一个对话框"));
        setBounds(120, 120, 100, 100);

    }
}
public class MyFrame extends JFrame {   // 创建父窗体类
    public MyFrame() {
        Container container = getContentPane(); // 获得窗体容器
        container.setLayout(null);
        JButton b1 = new JButton("弹出对话框");
        b1.setBounds(10, 10,100,21);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                MyJDialog dialog = new MyJDialog(MyFrame.this);
                dialog.setVisible(true);
            }
        });
        container.add(b1);
        container.setBackground(Color.WHITE);
        setSize(200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}

