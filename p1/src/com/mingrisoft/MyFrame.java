package com.mingrisoft;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

class MyJDialog extends JDialog {   // 创建自定义对话框类，并继承JDialog
    public MyJDialog(MyFrame frame) {
        super(frame, "第一个JDialog窗体", true); // 实例化一个JDialog类对象，指定对话框的父窗体，标题和类型
        Container container = getContentPane();
        container.add(new JLabel("这是一个对话框"));
        setBounds(270, 250, 380, 180);

    }
}
public class MyFrame extends JFrame {   // 创建父窗体类
    public MyFrame() {
        setTitle("Decode");
        Container container = getContentPane(); // 获得窗体容器
        container.setLayout(null);
        container.setBackground(Color.WHITE);
        setBounds(150,120,1200,680);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        // 添加按钮
        JButton b1 = new JButton("弹出对话框");
        b1.setBounds(80, 80,100,21);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                MyJDialog dialog = new MyJDialog(MyFrame.this);
                dialog.setVisible(true);
            }
        });
        container.add(b1);

        // 创建 panelTitle 面板
        JPanel panelTitle = new JPanel();
//        panelTitle.setLayout(null);
        panelTitle.setBackground(Color.CYAN);
        panelTitle.setBounds(200,80,500,500);
        container.add(panelTitle);

        // 添加 JLabel 标签
        JLabel jLabel1 = new JLabel("联系人",JLabel.LEFT);
//        jLabel1.setText("联系人");
//        jLabel1.setIcon();
        jLabel1.setForeground(new Color(0, 0, 0));
        jLabel1.setFont(new Font("宋体",Font.BOLD,13));
        panelTitle.add(jLabel1);

        // 标签图标
        URL url = MyFrame.class.getResource("pic.jpg");
        Icon icon = new ImageIcon(url);
        jLabel1.setIcon(icon);
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setOpaque(true);

    }
    public static void main(String[] args) {
        new MyFrame();
    }
}

