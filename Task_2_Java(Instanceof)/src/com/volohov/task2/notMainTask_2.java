package com.volohov.task2;

public class notMainTask_2 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------");

            int numberOfClasses = Integer.parseInt(args[0]);
            if (numberOfClasses < 6) {
                throw new Exception("There must be at least 6 arguments");
            }

            System.out.println("All subjects");

            Thing[] subject = new Thing[numberOfClasses];
            for (int i = 0; i < numberOfClasses; i++) {
                switch (i % 6) {
                    case 0:
                        subject[i] = new Ball(i + 1, "euro");
                        break;
                    case 1:
                        subject[i] = new Doll(i + 1, "euro");
                        break;
                    case 2:
                        Sandwich sandwich = new Sandwich(i + 1, "euro");
                        subject[i] = sandwich;
                        //subject[i] = new Sandwich(i + 1, "euro");
                        break;
                    case 3:
                        subject[i] = new BreadButter(i + 1, "euro");
                        break;
                    case 4:
                        subject[i] = new Cottage(i + 1, "euro");
                        break;
                    case 5:
                        subject[i] = new Yurta(i + 1, "euro");
                        break;
                }
            }

            System.out.println("----------------");
            System.out.println("----All eat:---- ");
            for (int i = 0; i < numberOfClasses; i++) {
                if (subject[i] instanceof Eat) {
                    switch (subject[i].getClass().getSimpleName()) {
                        case "Sandwich":
                            Sandwich sandwich = new Sandwich();
                            sandwich.setPrice(i + 1);
                            sandwich.setValue("euro");
                            System.out.println("Price = of sandwich is " + sandwich.getPrice() + " " + sandwich.getValue());
                            break;
                        case "BreadButter":
                            BreadButter breadbutter = new BreadButter();
                            breadbutter.eating();
                            breadbutter.setPrice(i + 1);
                            breadbutter.setValue("euro");
                            System.out.println("Price of bread and butter is " + breadbutter.getPrice() + " " + breadbutter.getValue());
                            break;
                    }
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
