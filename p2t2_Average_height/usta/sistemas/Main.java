package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Andres Felipe Diaz Silvera
	  DATE: 2020 - April - 13
	  DESCRIPTION: This program that calculates the average height of a group of 5 children*/
        f_menu();
        double summatory=f_sum_height();
        System.out.println("The summatory is: "+summatory+ " mts");
        f_average(summatory);
    }
    //Esta funcion no le ingresan parametros y no me retorna nada
    public static void f_menu(){
        //Description: This method show the menu of this software
        System.out.println("--------------------------");
        System.out.println("|    SoftAverageHeight   |");
        System.out.println("|Version 1.0 20200413    |");
        System.out.println("|Created by: Andres Diaz |");
        System.out.println("--------------------------");

    }
    //Esta funcion NO le ingresan parametros y SI me retorna un double
    public static double f_sum_height(){
        //Description: This method calculate the summatory of 5 height
        Scanner keyboard = new Scanner(System.in);
        double summatory, height1, height2, height3, height4, height5;
        System.out.println("Input the firts height (mts):");
        height1= keyboard.nextDouble();
        System.out.println("Input the second height (mts):");
        height2= keyboard.nextDouble();
        System.out.println("Input the third height (mts):");
        height3= keyboard.nextDouble();
        System.out.println("Input the fourth height (mts):");
        height4= keyboard.nextDouble();
        System.out.println("Input the five height (mts):");
        height5= keyboard.nextDouble();
        summatory=height1+height2+height3+height4+height5;
        return summatory;
    }
    //Esta funcion SI le ingresan parametros y NO me retorna nada
    public static void f_average(double summatory){
        //Description: This method calculate the average
        double average= summatory/5;
        System.out.println("The average is: "+average+ " (mts)");
    }
}
