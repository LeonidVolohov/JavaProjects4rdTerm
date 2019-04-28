package com.volohov;

import com.volohov.Task_1.MainTask_One;
import com.volohov.Task_2.MainTask_Two;
import com.volohov.Task_3.MainTask_Three;
import com.volohov.Task_4.MainTask_Four;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task_5 {
    private JTabbedPane tabbedPane1;
    private JTextField textField1;
    private JTextArea textArea1;
    private JButton startFirstLab;
    private JTextField textField4;
    private JButton startThirdLab;
    private JPanel panelMain;
    private JTextField textField6;
    private JTextField textField5;
    private JButton startSecondLab;
    private JTextField textField7;
    private JButton startFourthLab;
    private JTextField textField2;
    private JTextField textField3;

    public Task_5() {
        startFirstLab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(!textField1.getText().equals("")) {
                    try {
                        int bDay = Integer.parseInt(textField1.getText());
                        String bMonth = (textField2.getText());
                        int bYear = Integer.parseInt(textField3.getText());
                        textArea1.setText("");
                        new MainTask_One().startLab1(bDay, bMonth, bYear, textArea1);
                    } catch (Exception e) {
                        textArea1.setText("Wrong input parameters: " + e);
                    }
                }
            }
        });

        startSecondLab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (!textField4.getText().equals("")) {
                    try {
                        String[] inputParam = {textField4.getText()};
                        textArea1.setText("");
                        new MainTask_Two().startSecondLab(inputParam, textArea1);
                    } catch (Exception e) {
                        textArea1.setText("Wrong input parameters: " + e);
                    }
                }
            }
        });

        startThirdLab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (!textField5.getText().equals("")) {
                    try {
                        String[] inputParam = {textField5.getText()};
                        textArea1.setText("");
                        new MainTask_Three().startThirdLab(inputParam, textArea1);
                    } catch (Exception e) {
                        textArea1.setText("Wrong input parameters: " + e);
                    }
                }
            }
        });

        startFourthLab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (!textField6.getText().equals("") && !textField7.getText().equals("")) {
                    try {
                        int inputWorkers = Integer.parseInt(textField6.getText());
                        int inputBoxes = Integer.parseInt(textField7.getText());
                        textArea1.setText("");
                        new MainTask_Four().startFourthLab(inputWorkers, inputBoxes, textArea1);
                    } catch (Exception e) {
                        textArea1.setText("Wrong input parameters: " + e);
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        int height = 600;
        int width = 800;

        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

        JFrame frame = new JFrame("Laboratory Work 5");
        frame.setContentPane(new Task_5().panelMain);
        frame.setBounds(screen.width / 2 - width / 2, screen.height / 2 - height / 2, width, height);
        frame.setPreferredSize(new Dimension(width, height));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
