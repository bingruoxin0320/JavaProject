package com.mingrisoft;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutPosition extends JFrame{
    public  FlowLayoutPosition() {
//        super("Decode");
        setTitle("Decode");
        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.RIGHT));
        setBounds(200,130,850,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(2,2,20,20));
        jPanel1.setSize(100,80);
        JButton encode1 = new JButton("Encode1");
        JButton encode2 = new JButton("Encode2");
        JButton encode3 = new JButton("Encode3");
        JButton encode4 = new JButton("Encode4");
        encode4.setBackground(Color.green);
        encode4.setSize(20,20);
        jPanel1.add(encode1);
        jPanel1.add(encode2);
        jPanel1.add(encode3);
        jPanel1.add(encode4);
        container.add(jPanel1);

        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new BorderLayout());
        JButton encode5 = new JButton("Encode5");
        JButton encode6 = new JButton("Encode6");
        JButton encode7 = new JButton("Encode7");
        JButton encode8 = new JButton("Encode8");
        jPanel2.add(encode5,BorderLayout.NORTH);
        jPanel2.add(encode6,BorderLayout.SOUTH);
        jPanel2.add(encode7,BorderLayout.EAST);
        jPanel2.add(encode8,BorderLayout.WEST);
        jPanel2.setLocation(250,180);
        jPanel2.setSize(100,100);
        container.add(jPanel2);

        // 添加按钮
//        container.add(new JButton("Decode").addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                BorderDialog borderDialog = new BorderDialog(FlowLayoutPosition.this);
//            }
//        }));



    }
    public static void main(String[] args) {
        new FlowLayoutPosition();
    }
}
class BorderDialog extends JDialog {
    public BorderDialog(FlowLayoutPosition frame) {
        super(frame,"提示",true);
        Container minWindow = getContentPane();
        setBounds(400,305,380,130);
        JLabel jLabel = new JLabel("massage error");
        minWindow.add(jLabel);
        setVisible(true);

    }
}
class MyFlowLayout extends FlowLayout {
    public MyFlowLayout(){
        super(FlowLayout.LEFT,10,10);
    }
}
