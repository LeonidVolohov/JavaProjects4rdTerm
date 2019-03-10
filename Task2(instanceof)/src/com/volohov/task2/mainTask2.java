package com.volohov.task2;

public class mainTask2 {

    public static String checkArgs(String[] arr) {
        try {
            int numberOfClasses = Integer.parseInt(arr[0]);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return arr[0];
    }

    public static void main(String[] args) {
        //int numberOfClasses = Integer.parseInt(args[0]);
        checkArgs( args);
        Thing[] subject = new Thing[numberOfClasses];
        
        System.out.println("---------------");
        System.out.println("All subjects");

        for(int i = 0; i < numberOfClasses; i++){
            switch (i % 6) {
                case 0:
                    subject[i] = new Ball(i, "euro");
                    break;
                case 1:
                    subject[i] = new Doll(i, "euro");
                    break;
                case 2:
                    subject[i] = new Sandwich(i, "euro");
                    break;
                case 3:
                    subject[i] = new BreadButter(i, "euro");
                    break;
                case 4:
                    subject[i] = new Cottage(i, "euro");
                    break;
                case 5:
                    subject[i] = new Yurta(i, "euro");
                    break;
            }
        }

        System.out.println("---------------");
        System.out.println("All eat: ");
        for (int i = 0; i < numberOfClasses; i++) {
            if (subject[i] instanceof Eat) {
                switch (subject[i].getClass().getSimpleName()) {
                    case "Sandwich" :
                        Sandwich sandwich = new Sandwich();
                        sandwich.eating();
                        sandwich.setPrice(12.2);
                        System.out.println("Price = of sandwich is " + sandwich.getPrice());
                        break;
                    case "BreadButter" :
                        BreadButter breadbutter = new BreadButter();
                        breadbutter.eating();
                        breadbutter.setPrice(2.2);
                        System.out.println("Price of bread and butter is " + breadbutter.getPrice());
                        break;
                }
            }
        }
        System.out.println("---------------");
   }
}
