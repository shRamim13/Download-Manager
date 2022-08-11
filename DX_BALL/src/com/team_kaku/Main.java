package com.team_kaku;

import javax.swing.*;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Brick Breaker");
        f.setSize(700, 600);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(true);

        GamePlay gamePlay = new GamePlay();
        f.add(gamePlay);

        f.setVisible(true);
    }
}
