package com.soft1851.seven.homework.homework.four;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author ：zhengliang
 * @date ：2020/2/23 1:15
 * @description：TODO
 */
public class ChangeColor extends JFrame implements ActionListener {
    JButton jb1, jb2;
    JPanel jPanel;

    public static void main(String[] args)
    {
        Others.changebgcolor changebgcolor= new Others.changebgcolor();
    }

    public ChangeColor() {
        jb1 = new JButton("红色背景");
        jb2 = new JButton("蓝色背景");
        jPanel = new JPanel();
        jPanel.setBackground(Color.GREEN);
        //添加按钮1
        this.add(jb1, BorderLayout.NORTH);
        //添加按钮2
        this.add(jb2, BorderLayout.SOUTH);
        //添加面板
        this.add(jPanel);

        //设置监听命令
        jb1.setActionCommand("背景变红色");
        //设置监听对象
        jb1.addActionListener(this);

        jb2.setActionCommand("背景变蓝色");
        jb2.addActionListener(this);
        this.setTitle("事件监听改变窗体背景颜色");
        this.setSize(200, 150);
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("背景变红色")) {
            jPanel.setBackground(Color.red);
        }
        if (e.getActionCommand().equals("背景变蓝色")) {
            jPanel.setBackground(Color.blue);
        }
    }
}
