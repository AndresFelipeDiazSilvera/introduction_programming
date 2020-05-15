package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Andres Felipe Diaz Silvera
	  DATE: 2020 - april - 29
	  DESCRIPTION: This software tells is how many number there are between 1 and that are prime.
	 */
        f_menu();
        int n = f_user_number(), totalPrimes = 0;
        for (int i = 1; i <= n; i++) {
            if (f_primes(i) == true) {
                totalPrimes++;
                System.out.println("number " + i + " is prime");
        }
            System.out.println("The total prime is: "+totalPrimes);
        }
    }
    public static void f_menu() {
        //This method show thw menu of the software
        System.out.println(" __________________________________");
        System.out.println("|  SoftBillMarket                  |");
        System.out.println("| Version 1.0 29-04-2020           |");
        System.out.println("| Created by Andres Diaz           |");
        System.out.println("|__________________________________|");
        
    }

    public static int f_user_number() {
        //This method return the user number
        Scanner keyboard = new Scanner(System.in);
        int n;
        do {
            System.out.println("Input the number (must be greater than 0)");
            n = keyboard.nextInt();
        } while (n <= 1);
        return n;
    }

    public static boolean f_primes(int number) {
        //This method return the function of n prime
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count += 1;

            }
        }
        if (count <= 2) {
            return true;

        } else {
            return false;
        }
    }
}
