/*Temperature Converter Software :
from Celsius to Fahrenheit and vice versa*/

package com.joe;

import java.util.Scanner;

public class TemperatureConverter {
 public static void main(String[] args) {
 Scanner input = new Scanner (System.in);

 System.out.println("welcome!");
 System.out.println("please select operation you wish to perform: ");
 System.out.println(" 1. °C to °F ");
 System.out.println(" 2. °F to °C ");

 int option = input.nextInt();
 double C;
 double F;
 
 
 if (option == 1) {
 System.out.println("Enter Number to convert: ");
 C = input.nextDouble();
 F = (C * (9.0/5.0)) + 32.0;
 System.out.println(F);
 }


 else if (option== 2){
 System.out.println("Enter Number to convert: ");
 F = input.nextDouble();
 C = (F - 32.0)* 5.0/9.0;
 System.out.println(C);
 }


 else {
 System.out.println("Error,wrong option ");
 }
 }
 }
