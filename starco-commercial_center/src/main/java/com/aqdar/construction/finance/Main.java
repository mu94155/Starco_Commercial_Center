package com.aqdar.construction.finance;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            WelcomePage2 welcomePage2 = new WelcomePage2();
            welcomePage2.setVisible(true);
        });
    }
}