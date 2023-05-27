package com.wetin.MyFrame;

import javax.swing.*;
import java.awt.*;

/**
 * @version 1.0.1
 * @Author: wei tin
 */

public class  MyFrame{
    public static void main(String[] args) {
        //以下是基于JAVA Swing实现的900*600的窗体：
        JFrame jf = new JFrame("语音转文字工具");
        jf.setSize(900,600);
        jf.setVisible(true);
        jf.setLayout(new BorderLayout());
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 第一排三个文本框
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT,5,0));
        JLabel label1 = new JLabel("APP_ID: ");
        JTextField textField1 = new JTextField(20);
        JLabel label2 = new JLabel("API_KEY: ");
        JTextField textField2 = new JTextField(20);
        JLabel label3 = new JLabel("SECRET_KEY: ");
        JTextField textField3 = new JTextField(20);
        panel1.add(label1);
        panel1.add(textField1);
        panel1.add(label2);
        panel1.add(textField2);
        panel1.add(label3);
        panel1.add(textField3);

        // 第二排三个单选框
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT,120,0));
        JRadioButton radioButton1 = new JRadioButton("普通话");
        JRadioButton radioButton2 = new JRadioButton("极速普通话");
        JRadioButton radioButton3 = new JRadioButton("英文");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        panel2.add(radioButton1);
        panel2.add(radioButton2);
        panel2.add(radioButton3);
        //jf.add(panel2);

        // 第三排一个文本框，两个按钮
        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT,10,0));
        JLabel label4 = new JLabel("路径: ");
        JTextField textField4 = new JTextField(40);
        JButton button1 = new JButton("打开文件");
        JButton button2 = new JButton("转换");
        JButton button3 = new JButton("复制文字");
        panel3.add(label4);
        panel3.add(textField4);
        panel3.add(button1);
        panel3.add(button2);
        panel3.add(button3);

        // 下面是一个不可写的文本域
        JTextArea textArea = new JTextArea(15,1);
        //textArea.setEditable(false);
        //textArea.setSize(800, 300);

        // 把所有的面板组合到一起
        JPanel contentPane = new JPanel();
        contentPane.setPreferredSize(new Dimension(900,120));
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,0,10));
        contentPane.add(panel3,FlowLayout.LEFT);
        contentPane.add(panel2,FlowLayout.LEFT);
        contentPane.add(panel1,FlowLayout.LEFT);
        jf.add(contentPane,BorderLayout.NORTH);
        jf.add(textArea,BorderLayout.CENTER);


        jf.pack();
    }
}
