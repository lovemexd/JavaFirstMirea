package ru.mirea.task11.third;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private JTextArea text;

    public Window() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JMenuBar menu = new JMenuBar();
        JPanel pnl = new JPanel();
        add(pnl);
        text = new JTextArea("You're text here...");
        text.setFont(new Font("TimesRoman",Font.PLAIN,20));
        text.setOpaque(true);
        pnl.add(text);

        menu.add(Colour());
        menu.add(Font());
        setJMenuBar(menu);
        setSize(500,500);
        setVisible(true);
    }

    private JMenu Colour() {
        JMenu colour = new JMenu("Colour");
        JMenuItem colour_1 = new JMenuItem("Yellow");
        JMenuItem colour_2 = new JMenuItem("Red");
        JMenuItem colour_3 = new JMenuItem("Black");
        colour.add(colour_1);
        colour.addSeparator();
        colour.add(colour_2);
        colour.addSeparator();
        colour.add(colour_3);

        colour_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(new Color(250,250,0));
            }
        });

        colour_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(new Color(255,0,0));
            }
        });

        colour_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(new Color(10,10,10));
            }
        });

        return colour;
    }

    private JMenu Font() {
        JMenu font = new JMenu("Font");
        JMenuItem font_1 = new JMenuItem("TimesRoman");
        JMenuItem font_2 = new JMenuItem("Algerian");
        JMenuItem font_3 = new JMenuItem("Arial");
        font.add(font_1);
        font.addSeparator();
        font.add(font_2);
        font.addSeparator();
        font.add(font_3);

        font_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("TimesRoman", Font.PLAIN,20));
            }
        });

        font_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("Algerian", Font.PLAIN,20));
            }
        });

        font_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("Arial",Font.PLAIN, 20));
            }
        });

        return font;
    }

    public static void main(String[] args) {
        new Window();
    }
}