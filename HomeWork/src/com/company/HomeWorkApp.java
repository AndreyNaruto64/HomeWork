package com.company;

public class HomeWorkApp {

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 3;
        a = a+b;
        if (a>=0){
            System.out.println("Сумма положительна");
        }else {
            System.out.println("Сумма отрицательна");
        }
    }

    public static void printColor() {
        int value = 200;
        if (value <= 0){
            System.out.println("Красный");
        }else if(value > 0 && value <= 100){
            System.out.println("Желтый");
        }else{
            System.out.println("Зелёный");
        }

    }

    public static void compareNumbers() {
        int a = 136;
        int b = -5;
        if (a >=b ){
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }

    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
}
