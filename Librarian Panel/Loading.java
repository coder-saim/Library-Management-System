package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Loading extends JFrame implements Runnable {

    private JPanel contentPane;
    private JProgressBar progressBar;
    int s;
    Thread thread;

    public void setUploading() {
        setVisible(false);
        thread.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 200; i++) {
                s = s + 1;
                int m = progressBar.getMaximum();
                int v = progressBar.getValue();
                if (v < m) {
                    progressBar.setValue(progressBar.getValue() + 1);
                }
                else {
                    i = 201;
                    setVisible(false);
                    new Librarian().setVisible(true);
                }
                Thread.sleep(50);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Loading() {

        super("Loading");

        thread = new Thread((Runnable) this);

        setBounds(500, 120, 1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lbllibraryManagement = new JLabel("Loading Library v1.1");
        lbllibraryManagement.setForeground(new Color(72, 209, 204));
        lbllibraryManagement.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 25));
        lbllibraryManagement.setBounds(370, 100, 500, 50);
        contentPane.add(lbllibraryManagement);

        progressBar = new JProgressBar();
        progressBar.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
        progressBar.setStringPainted(true);
        progressBar.setBounds(350, 250, 300, 30);
        contentPane.add(progressBar);

        JLabel lblNewLabel_2 = new JLabel("Please Wait...");
        lblNewLabel_2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
        lblNewLabel_2.setForeground(new Color(160, 82, 45));
        lblNewLabel_2.setBounds(450, 300, 500, 20);
        contentPane.add(lblNewLabel_2);


        setUploading();
    }

    public static void main(String[] args) {
        new Loading().setVisible(true);
    }
}