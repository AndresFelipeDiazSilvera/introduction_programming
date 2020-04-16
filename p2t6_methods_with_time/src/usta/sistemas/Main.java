package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Andres Felipe Diaz Silvera
	  DATE: 2020 - april- 15
	  DESCRIPTION:Write two functions that allow you to calculate:
	               The number of seconds in a given time in hours.
	               The number of seconds in a given time in minutes.
	               The number of hours, minutes of a given time in seconds
	 */
	f_menu();
	int option= f_option();
	if (option==1){ //Convert hours to seconds
	    f_convert_hours_to_seconds();
    }else if (option==2){ //Convert minutes to seconds
	    f_convert_hours_to_seconds();
    }else{
	    f_convert_seconds_to_hours_and_minutes();
    }
    }
    //Esta funcion no le ingresan parametros y no me retorna nada
    public  static  void  f_menu () {
        //Description: This method show the menu of this software
        System.out.println("--------------------------");
        System.out.println("|    SoftConverTime      |");
        System.out.println("|Version 1.0 20200415    |");
        System.out.println("|Created by: Andres Diaz |");
        System.out.println("--------------------------");
    }
    public static int f_option(){
        //Description: This method return the option
        System.out.println("Input the option of the convert:\n1-Hours to seconds\n2-minutes to seconds\n3-Seconds to hours and minutes:");
        Scanner keyboard= new Scanner(System.in);
        int option= keyboard.nextInt();
        while (option<1 || option >3){ //if option is less to 1 or greater than 3
            System.err.println("EER: This option not exist.");
            System.out.println("Input the option of the convert:\n1-Hours to seconds\n2-minutes to seconds\n3-Seconds to hours and minutes:");
            option= keyboard.nextInt();
        }
        return option;
    }
    public static void f_convert_hours_to_seconds(){
        //Description: Convert the number of second in a given time in hours.
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Input the numbers hours to convert:");
        int hours= keyboard.nextInt();
        int second=hours*60*60;
        System.out.println("The numbers hours :"+hours+" have "+second+" Seconds");
    }
    public static void f_convert_minutes_to_seconds(){
        //Description: Convert the number of second in a given time in minutes.
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Input the numbers minutes to convert:");
        int minutes= keyboard.nextInt();
        int second=minutes*60;
        System.out.println("The numbers hours :"+minutes+" have "+second+" Seconds");
    }
    public static void f_convert_seconds_to_hours_and_minutes(){
        //Description: Convert seconds to hours and minutes.
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Input the numbers seconds to convert:");
        int seconds= keyboard.nextInt();
        //int second=minutes*60;
        //System.out.println("The numbers hours :"+minutes+" have "+second+" Seconds");
}
