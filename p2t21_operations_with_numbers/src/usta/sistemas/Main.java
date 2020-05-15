package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Author:Andres Felipe Diaz Silvera
        //Date: 2020 - April - 23
        //Description: This software show de
        f_menu();
        f_numbers();
    }

    public static void f_menu(){
        //Description: this method show the menu of this software
        System.out.println("╔══════════════════════╗");
        System.out.println("║    SoftRadioAt       ║");
        System.out.println("║Version 1.0 20200423  ║");
        System.out.println("║Created by:Andres Diaz║");
        System.out.println("╚══════════════════════╝");

    }
    public static void f_numbers() {
        Scanner keyboard = new Scanner(System.in);
        int number, summatoryP = 0, summatoryN = 0, Totalzero = 0, totalP = 0, totalN = 0;
        double averageN=0, averageP=0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("input the number entire" + i);
            number = keyboard.nextInt();
            if (number < 0) {
                summatoryN -= number;
                totalN++;
            } else if (number > 0) {
                summatoryP += number;
                totalP++;
            } else {
                Totalzero++;
            }
        }
        if (totalP > 0) {
            averageP= summatoryP / totalP;
        }
        if (totalN > 0) {
            averageN = summatoryN / -totalN;
        }
        System.out.println("the average negative is: "+averageN);
        System.out.println("the average positive is: "+averageP);
        System.out.println("the total zero is: "+Totalzero);
    }
}