package com.volohov.Task_1;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class MainTask_One {
    public void startLab1(int bDay, String bMonth, int bYear, JTextArea jTextArea) {
        try {
            TaskOneCode taskOneCode = new TaskOneCode();
            if (bDay < 0 || bDay > 32)
                jTextArea.setText("Wrong number of your bday");
            if (bYear < 1900 || bYear >= 2020) {
                jTextArea.setText("You are too old/young. Please, try it again");
            } else {
                TaskOneCode taskOneCode1 = new TaskOneCode();
                int intMonth = taskOneCode1.getMonth(bMonth, jTextArea);
                taskOneCode.getAge(bDay, intMonth, bYear, jTextArea);
            }
        }
        catch (NumberFormatException numberFormatException) {
            jTextArea.setText("NumberFormatException in Task1");
        }
    }
}

class TaskOneCode {
    public void getAge(int bDay, int bMonth, int bYear, JTextArea jTextArea) {
        LocalDate birthDay = LocalDate.of(bYear, bMonth, bDay);
        LocalDate now = LocalDate.now();
        Period p = Period.between(birthDay, now);

        jTextArea.setText("You are " + p.getDays() + " days, " + p.getMonths() + " months and " +
                p.getYears() + " years old");
    }

    public int getMonth(String month, JTextArea jTextArea) {
        int someMonth = 0;
        switch (month) {
            case "Январь":
                someMonth = 1;
                break;
            case "Февраль":
                someMonth = 2;
                break;
            case "Март":
                someMonth = 3;
                break;
            case "Апрель":
                someMonth = 4;
                break;
            case "Май":
                someMonth = 5;
                break;
            case "Июнь":
                someMonth = 6;
                break;
            case "Июль":
                someMonth = 7;
                break;
            case "Август":
                someMonth = 8;
                break;
            case "Сентябрь":
                someMonth = 9;
                break;
            case "Октябрь":
                someMonth = 10;
                break;
            case "Ноябрь":
                someMonth = 11;
                break;
            case "Декабрь":
                someMonth = 12;
                break;
            default:
                jTextArea.setText("Wrong month. Please choose from January to December");
                break;
        }
        return someMonth;
    }
}


