package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Andres Felipe Diaz Silvera
	  DATE: 2020 - april - 21
	  DESCRIPTION: This software calculates the average salary total salary and highest salary.
	 */
	f_menu();
	int N=f_number_employers();
	double highestSalary=0,totalsalary=0,averagesalary=0,salaryEmploye;
	for (int i=1;i<=N;i=i+1){
	    salaryEmploye=f_salary(i);
	    totalsalary=totalsalary+salaryEmploye;
	    if (highestSalary<salaryEmploye){
	        highestSalary=salaryEmploye;
        }


    }
	averagesalary=totalsalary/N;
	System.out.println("The total salary is:" +totalsalary+ "The average salary is: "+averagesalary+"The highest salary is:"+highestSalary);
    }
    public static void f_menu() {
        //Description: This method show the menu of this software
        System.out.println("--------------------------");
        System.out.println("|     SoftSalary         |");
        System.out.println("|Version 1.0 20200421    |");
        System.out.println("|Created by: Andres Diaz |");
        System.out.println("--------------------------");
    }
    public static int f_number_employers(){
        //Description: This method return the numbers of employers
        Scanner keyboard = new Scanner(System.in);
        int employers;
        do {
            System.out.println("Input  the total employers (input more than 1 employe)");
            employers=keyboard.nextInt();
        }while (employers<1);
        return employers;
    }
    public static double f_salary(int i){
        //Description: This method return the salary of one employed
        Scanner keyboard = new Scanner(System.in);
        double sueldo,diasT,salary;
        do {
            System.out.println("Input the wages(the value must be more tha 0): ");
            sueldo=keyboard.nextDouble();

        }while (sueldo<1);
        do {
            System.out.println("Input the days worked(the value must be between 1 and 30) ");
            diasT=keyboard.nextDouble();
        }while (diasT<1||diasT>30);
        salary = (sueldo/30)*diasT;
        return  salary;

    }
}
