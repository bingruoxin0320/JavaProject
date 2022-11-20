package com.mingrisoft;
import javax.swing.*;
import java.awt.*;
import javax.swing.ButtonGroup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutPosition extends JFrame{
    public  FlowLayoutPosition() {
//        super("Decode");
        setTitle("Decode");
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        setBounds(200,130,1200,680);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        // 面板1
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(1,2,10,10));
        jPanel1.setPreferredSize(new Dimension(500,580));
        jPanel1.setBorder(BorderFactory.createTitledBorder("面板1"));
        // 标签
        JLabel decodeLabel = new JLabel();
        decodeLabel.setText("Decode");
        decodeLabel.setLocation(10,10);
        jPanel1.add(decodeLabel);
        // 文本
        JTextField textFieldLeft = new JTextField();
        textFieldLeft.setText("输入文本...");
//        textFieldLeft.setLocation(10,20);
//        textFieldLeft.setSize(200,200);
        jPanel1.add(textFieldLeft);

        container.add(jPanel1,BorderLayout.WEST);

        // 面板2 按钮
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new GridLayout(4,1,10,10));
        jPanel2.setBorder(BorderFactory.createTitledBorder("面板2"));
        jPanel2.setPreferredSize(new Dimension(200,100));
        JButton decodeButton = new JButton();
        decodeButton.setText("Decode");
        decodeButton.setToolTipText("面板1输入内容");
        decodeButton.setBorderPainted(true);
        decodeButton.setEnabled(true);
        decodeButton.setBackground(Color.WHITE);
        jPanel2.add(decodeButton);
        JButton encodeButton = new JButton("Encode");
        encodeButton.setBackground(Color.WHITE);
        jPanel2.add(encodeButton);

        JRadioButton radioButton1 = new JRadioButton("单选1",true);
        jPanel2.add(radioButton1);
        JRadioButton radioButton2 = new JRadioButton();
        radioButton2.setText("单选2");
        jPanel2.add(radioButton2);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        container.add(jPanel2);

        // 面板3
        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(new FlowLayout(FlowLayout.LEFT));
        jPanel3.setBorder(BorderFactory.createTitledBorder("面板3"));
        jPanel3.setPreferredSize(new Dimension(500,580));
        container.add(jPanel3, BorderLayout.EAST);
        // 标签
        JLabel encodeLabel = new JLabel("Encode");
        jPanel3.add(encodeLabel);
        // 文本
        JTextField textFieldRight = new JTextField();
        textFieldRight.setPreferredSize(new Dimension(200,80));
        jPanel3.add(textFieldRight);

        setVisible(true);
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
