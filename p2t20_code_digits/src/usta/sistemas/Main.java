package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Author: Andres Felipe Diaz Silvera
        //Date: 2020 - april - 28
        //description: This software count the digits of a number that you input
        f_menu();
        int cifras=0,n=f_number_user(),n2;
        do {
            if (n==0){
                cifras=1;
            }else {
                n = n / 10;
                cifras++;
            }
        }while (n!=0);
        n2=10*n*cifras;
        System.out.println("the number is: "+n2+" the number have: "+cifras+"digits");
    }
    public static void f_menu(){
        //Description: this method show the menu of this software
        System.out.println("╔══════════════════════╗");
        System.out.println("║  SoftAverageHeight   ║");
        System.out.println("║Version 1.0 20200428  ║");
        System.out.println("║Created by:Andres Diaz║");
        System.out.println("╚══════════════════════╝");

    }
    public static int f_number_user(){
        //this method count how many digits have the number
        Scanner keyboard=new Scanner(System.in);
        int digits;
        System.out.println("input the entire number ");
        digits=keyboard.nextInt();
        return digits;
    }


}