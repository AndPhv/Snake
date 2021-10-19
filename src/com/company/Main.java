package com.company;

import javax.swing.JFrame;

public class Main extends JFrame {
    public Main() {
        this.setTitle("Змейка");
        this.setDefaultCloseOperation(3);
        this.setSize(320, 345);
        this.setLocation(400, 400);
        this.add(new Game());
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}