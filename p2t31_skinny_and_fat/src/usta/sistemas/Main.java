package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Andres Felipe Diaz Silvera
      DATE: 2020 - may - 07
      DESCRIPTION: Determine who is skinny or fat in N  men
	*/
        int total_people = f_menu_total_people();
        double[] vector_wights = f_fill_vector_weights(total_people);
        f_show_malnourished_people(vector_wights);
        f_show_skinny_people(vector_wights);
        f_show_fat_people(vector_wights);
        f_show_all_weights(vector_wights);
    }
    public static int f_menu_total_people(){
        //DESCRIPTION: This method return the total numbers
        System.out.println("╔════════════════════════════╗");
        System.out.println("║  SoftSkinnyOrFat           ║");
        System.out.println("║ Maker:Andres Diaz          ║");
        System.out.println("║ Date: 2020-may-07          ║");
        System.out.println("╚════════════════════════════╝");
        System.out.println("Input the total number:");
        Scanner keyboard = new Scanner(System.in);
        int total_number= keyboard.nextInt();
        while (total_number<=0){
            System.err.println("ERR: the value can't be minor or same zero");
            System.out.println("Input again the total number:");
            total_number= keyboard.nextInt();
        }
        return total_number;

    }
    public static double[] f_fill_vector_weights(int total_people){
        //Description: This method return the N vec weights
        double[] vector_weights = new double[total_people];
        for (int i=0; i<total_people; i++){
            vector_weights[i] = (Math.random()*(120-21)+20);
        }
        return vector_weights;
    }
    public static void f_show_malnourished_people(double[] vector_weights){
        //Description: This method show the total people are malnourished
        int total_malnourished = 0;
        for (double weight: vector_weights){
            if (weight<40){
                total_malnourished++;
            }
        }
        System.out.println("The total of malnourished people is: "+total_malnourished);
    }
    public static void f_show_skinny_people(double[] vector_weights){
        //Description: This method show the total people are skinny
        int total_skinny = 0;
        for (double weight: vector_weights){
            if (weight>=40 && weight < 70){
                total_skinny++;
            }
        }
        System.out.println("The total of skinny people is: "+total_skinny);
    }
    public static void f_show_fat_people(double[] vector_weights){
        //Description: This method show the total people are fat
        int total_fat = 0;
        for (double weight: vector_weights){
            if (weight>=70){
                total_fat++;
            }
        }
        System.out.println("The total of fat people is: "+total_fat);
    }
    public static void f_show_all_weights(double[] vector_weights){
        //Description: This method show all weight
        for (int i=0; i<vector_weights.length; i++){
            System.out.println("The weight of the person ("+(i+1)+" ) is: "+vector_weights[i]) ;
        }


    }


}
