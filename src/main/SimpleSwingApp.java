package main;
import javax.swing.*;

public class SimpleSwingApp {
    public static void main(String[] args) {
        // 创建 JFrame 实例
        JFrame frame = new JFrame("Simple Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);  // 设置窗口大小

        // 创建 JButton 实例
        JButton button = new JButton("Click me!");
        frame.getContentPane().add(button);  // 将按钮添加到窗口内容面板
        // 显示窗口
        frame.setVisible(true);
    }
}
