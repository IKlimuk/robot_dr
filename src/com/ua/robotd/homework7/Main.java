
package com.ua.robotd.homework7;

public class Main {
    public static void main(String[] args) {
        // 1.
        int numberForPower = 3;
        int a = cubeOfNumber(numberForPower);
        System.out.println("1. The cube of the number " + numberForPower + ": " + a);
        /// 2.
        System.out.print("2. ");
        printSymbolNumberOfTimes(9);
        // 3.
        System.out.println();
        System.out.print("3. ");
        int number=10;
        char symbol = '@';
        printSymbolNumberOfTimes(number, symbol);
    }

    // 1.
    static int cubeOfNumber(int number) {
        return number * number * number;
    }

    //2.
    static void printSymbolNumberOfTimes(int number2) {
        printSymbolNumberOfTimes(number2, '*');
    }

    //3.
    static void printSymbolNumberOfTimes(int number, char Symbol) {

        for (int i = 0; i < number; i++) {
            System.out.print(Symbol + " ");
        }
    }
}




