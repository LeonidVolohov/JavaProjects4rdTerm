package com.volohov.Task_2;

import javax.swing.*;

public class MainTask_Two {
    public void startSecondLab(String[] args, JTextArea jTextArea) {
        try {
            int numberOfClasses = Integer.parseInt(args[0]);
            if (numberOfClasses < 6) {
                jTextArea.setText("There must be at least 6 arguments");
                return;
            }

            jTextArea.append("All subjects\n");

            Thing[] subject = new Thing[numberOfClasses];
            jTextArea.append("---------------\n");

            for (int i = 0; i < numberOfClasses; i++) {
                switch (i % 6) {
                    case 0:
                        Sandwich sandwich = new Sandwich(i + 1, "euro", jTextArea);
                        subject[i] = sandwich;
                        break;
                    case 1:
                        Ball ball = new Ball(i + 1, "euro", jTextArea);
                        subject[i] = ball;
                        break;
                    case 2:
                        Cottage cottage = new Cottage(i + 1, "euro", jTextArea);
                        subject[i] = cottage;
                        break;
                    case 3:
                        Doll doll = new Doll(i + 1, "euro", jTextArea);
                        subject[i] = doll;
                        break;
                    case 4:
                        Yurta yurta = new Yurta(i + 1, "euro", jTextArea);
                        subject[i] = yurta;
                        break;
                    case 5:
                        BreadButter breadButter = new BreadButter(i + 1, "euro", jTextArea);
                        subject[i] = breadButter;
                        break;
                }
            }

            jTextArea.append("----------------\n");
            jTextArea.append("----All eat:----\n");

            for (int i = 0; i < numberOfClasses; i++) {
                if (subject[i] instanceof Eat) {
                    ((Eat) subject[i]).eating(jTextArea);
                    subject[i].setPrice(i + 1);
                    jTextArea.append("Price = " + subject[i].getPrice() + " euro\n");
                }
            }
        }
        catch (Exception e) {
            jTextArea.setText("---------------\n");
            jTextArea.append("Error: " + e + "\n");
            jTextArea.append("---------------\n");
        }
    }
}
