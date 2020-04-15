package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Andres Felipe Diaz Silvera
	  DATE: 2020 - april - 14
	  DESCRIPTION: This software that calculates the area of a circle, square or triangle
	 */
        f_menu();
        Scanner teclado= new Scanner(System.in);
        int opt= teclado.nextInt();
        if (opt<1 || opt >3){
            System.err.println("ERR: This option does not exist");
        }else {
            if (opt==1){
                //Llamar la funcion de area de circulo
                f_area_circle();
            }else if (opt==2){
                //Llamar la funcion de area de cuadrado
                f_area_square();
            }else{
                //Llamar la funcion de area de triangulo
                f_area_triangle();
            }
        }
    }
    //Esta funcion no le ingresan parametros y no me retorna nada
    public static void f_menu(){
        //Description: This method show the menu of this software
        System.out.println("--------------------------");
        System.out.println("|    SoftAreaFigures     |");
        System.out.println("|Version 1.0 20200414    |");
        System.out.println("|Created by: Andres Diaz |");
        System.out.println("--------------------------");
        System.out.println("Input the option of the figure :\n 1-circle,\n 2-square\n3-triangle");
    }
    public static void f_area_circle(){
        //Description: This method calculates the area of circle
        Scanner teclado1= new Scanner(System.in);
        System.out.println("To calculate the area of circle is necessary the radius, Input this value (cm):");
        double radius= teclado1.nextDouble();
        double area= (radius*radius)*3.141517;
        System.out.println("The area of cirlce is: "+area+ "(cm)");
    }
    public static void f_area_square(){
        //Description: This method calculates the area of square
        Scanner teclado1= new Scanner(System.in);
        System.out.println("To calculate the area of square is necessary the side, Input this value (cm):");
        double side= teclado1.nextDouble();
        double area= (side*side);
        System.out.println("The area of square is: "+area+ "(cm)");
    }
    public static void f_area_triangle(){
        //Description: This method calculates the area of triangle
        Scanner teclado1= new Scanner(System.in);
        double base, height, area;
        System.out.println("To calculate the area of triangle is necessary the base and height, Input the value base (cm):");
        base= teclado1.nextDouble();
        System.out.println("Input the height (cm):");
        height=teclado1.nextDouble();
        area=(base*height)/2;
        System.out.println("The area of triangle is: "+area+" (cm)");
    }

}