package com.volohov.task2;

public class mainTask_2 {
    public static void main(String[] args) {
        try {
            int numberOfClasses = Integer.parseInt(args[0]);
            if (numberOfClasses < 6) {
                throw new Exception("There must be at least 6 arguments");
            }

            System.out.println("---------------");
            System.out.println("All subjects");

            Thing[] subject = new Thing[numberOfClasses];
            System.out.println("---------------");

            for (int i = 0; i < numberOfClasses; i++) {
                switch (i % 6) {
                    case 0:
                        Sandwich sandwich = new Sandwich(i + 1, "euro");
                        subject[i] = sandwich;
                        break;
                    case 1:
                        Ball ball = new Ball(i + 1, "euro");
                        subject[i] = ball;
                        break;
                    case 2:
                        Cottage cottage = new Cottage(i + 1, "euro");
                        subject[i] = cottage;
                        break;
                    case 3:
                        Doll doll = new Doll(i + 1, "euro");
                        subject[i] = doll;
                        break;
                    case 4:
                        Yurta yurta = new Yurta(i + 1, "euro");
                        subject[i] = yurta;
                        break;
                    case 5:
                        BreadButter breadButter = new BreadButter(i + 1, "euro");
                        subject[i] = breadButter;
                        break;
                }
            }

            System.out.println("----------------");
            System.out.println("----All eat:---- ");

            for (int i = 0; i < numberOfClasses; i++) {
                if (subject[i] instanceof Eat) {
                    ((Eat) subject[i]).eating();
                    subject[i].setPrice(i + 1);
                    System.out.println("Price = " + subject[i].getPrice() + " euro");
                }
            }
        }
        catch (Exception e) {
            System.out.println("---------------");
            System.out.println("Error: " + e);
            System.out.println("---------------");
        }
    }
}
