package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Andres Felipe Diaz Silvera
	  DATE: 2020 - may - 06
	  DESCRIPTION: This software calculates the total of products with IVA included.
	 */
        int total_numbers = f_menu_total_numbers();
        int[] vector_numbers = f_fill_vector(total_numbers);
        f_show_even_numbers(vector_numbers);
        f_show_odd_numbers(vector_numbers);
    }
    public static int f_menu_total_numbers() {
        //Description: This method show the menu of this software
        System.out.println("--------------------------");
        System.out.println("|    SoftOddEven         |");
        System.out.println("|Version 1.0 20200506    |");
        System.out.println("|Created by: Andres Diaz |");
        System.out.println("--------------------------");
        Scanner keyboard = new Scanner(System.in);
        int total_numbers;
        do { System.out.println("Input the total numbers by greater than zero");
             total_numbers = keyboard.nextInt();
        }while (total_numbers<=0);
        return total_numbers;
    }
    public static int[] f_fill_vector(int total_numbers){
        //Description: This method return a vector with numbers
        int[] vector_numbers = new int[total_numbers];
        for (int i=0; i<total_numbers; i++){
            vector_numbers[i] = (int) Math.floor(Math.random()*(1000-100+1)+100);
        }
        return vector_numbers;
    }
    public static void f_show_even_numbers(int[] vector_numbers){
        //Description: This method show the even numbers
        int total_evens = 0;
        for (int number:vector_numbers){
            if ((number % 2)==0){
                total_evens++;
                System.out.println(" Even Number = "+number);
            }
        }
        System.out.println("The total even numbers is: "+total_evens);
    }
    public static void f_show_odd_numbers(int[] vector_numbers){
        //Description: This method show the odd numbers
        int total_odd = 0;
        for (int number:vector_numbers){
            if ((number % 2)!=0){
                total_odd++;
                System.out.println(" Odd Number = "+number);
            }
        }
        System.out.println("The total odd numbers is: "+total_odd);
    }
}
