package com.volohov.yourage;

import java.time.LocalDate;
import java.time.Period;

public class Task1 {
    public static void main(String[] args) {
        try {
            if (args.length < 1)
                throw new Exception("Wrong number of your bday");
            if (args.length > 3)
                throw new Exception("Something went wrong. It should be day/month/year");
            int day = Integer.parseInt(args[0]); //parseInt - строка -> число
            String month = args[1];
            int year = Integer.parseInt(args[2]);
            if (year < 1900 || year >= 2020) {
                throw new Exception("You are too old/young. Please, try it again");
            } else {
                int newMonth = getMonth(month);
                getAge(day, newMonth, year);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    static void getAge(int bDay, int bMonth, int bYear) {
        LocalDate birthDay = LocalDate.of(bYear, bMonth, bDay);
        LocalDate now = LocalDate.now();
        //LocalDate now = LocalDate.of(2019, 03, 01);
        Period p = Period.between(birthDay, now); //period - период между двумя датами

        System.out.print("You are " + p.getDays() + " days, ");
        System.out.print(p.getMonths() + " months and ");
        System.out.println(p.getYears() + " years old");
    }

    public static int getMonth(String month) {
        int someMonth = 0;
        switch (month) {
            case "Январь":
                someMonth = 1;
                break;
            case "февраль":
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
                System.out.println("Wrong month. Please choose from January to December");
                break;
        }
        return someMonth;
    }
}

