package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Andres Felipe Diaz Silvera
	  DATE: 2020- april - 14
	  DESCRIPTION: This software create a program that ask
	 */
	f_menu();
	f_input_numbers();
    }
    public static void f_menu(){
        //Description: This method show the menu of this software
        System.out.println("-------------------------");
        System.out.println("|    SoftMultiplos      |");
        System.out.println("|Version 1.0 20200414   |");
        System.out.println("|Created by: Andres Diaz|");
        System.out.println("-------------------------");
    }
    public static boolean f_multiplos (int n1, int n2){
        //Description: This method determine if it is multiple
        boolean multiplo= false;
        if (n1%n2==0){
            multiplo= true;
        }


        return multiplo;
    }
    public static void f_input_numbers(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Input the firts integer number:");
        int n1= teclado.nextInt();
        System.out.println("Input the second integer number:");
        int n2= teclado.nextInt();
        boolean rpta= f_multiplos(n1, n2);
        if (rpta==true){
            System.out.println(n1+ " Its multiple of "+n2);
        }
        else{
            System.out.println(n1+ " Is not multiple of  "+n2);
        }
    }
}
