package ru.mirea.task8.second;

import java.awt.*;
import javax.swing.JFrame;
import javax.imageio.*;
import java.io.*;


public class Window extends JFrame {

    public Window() {
        Container c = getContentPane(); // клиентская область окна
        setTitle("task8.2"); // заголовок окна
        setPreferredSize(new Dimension(1000, 1000));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack(); // устанавливаем желательные размер
        setVisible(true); // отображаем окно
    }
    // запуск оконного приложения
    public static void main(String args[]) {
        new Window();
    }

    public void paint(Graphics a){
        String file = "C:\\Users\\ffa20\\IdeaProjects\\task1\\src\\ru\\mirea\\task8\\second\\mobpsyho.gif";
        try {
            Image image = ImageIO.read(new File(file));
            a.drawImage(image, 40, 40, null);
        }
        catch (IOException ex){
            System.out.println("Невозможно открыть изображение");
        }
    }
}