package ru.mirea.task8.third;


import java.awt.*;
import javax.swing.JFrame;
import javax.imageio.*;
import java.io.*;

public class Window extends JFrame {

    public Window() {
        JFrame frame = new JFrame("ZXC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1000, 400));
        pack();
        setVisible(true);
    }

    public static void main(String args[]) {
        new Window();
    }

    public void paint(Graphics a){
        String file = "C:\\Users\\ffa20\\IdeaProjects\\task1\\src\\ru\\mirea\\task8\\third\\gif";
        while(true) {
            for (int i = 1; i < 14; i++) {
                String file1 = file + "\\" + String.valueOf(i) + ".gif";
                try {
                    Image image = ImageIO.read(new File(file1));
                    a.drawImage(image, 40, 40, null);
                    try {
                        Thread.sleep(70);
                    } catch (Exception e) {
                    }
                } catch (IOException ex) {
                    System.out.println("Невозможно открыть изображение");
                }
            }

        }
    }
}