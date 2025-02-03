package com.joe;

import java.util.Scanner;

 public class GroceryBills {
 public static void main(String[] args) {
 Scanner items = new Scanner(System.in);

 int i;
 double newtotal= 0;
 double discount;
 double total = 0;
 double target = 200;

 //Specify no. of items purchased
 System.out.println("pls enter no of items: " );
 int no_of_items = items.nextInt();
 double price;


 for (i = 0; i < no_of_items; i++) {
 //Calculate Total Purchase
 System.out.println(" enter prices: $" );
 price = items.nextDouble();
 total= (total+price);


 //Apply 5% Discount if total purchase exceeds $200
 if (total > target){
 discount = ((5.0/100.0) * total);
 newtotal = (total- discount);
 }}


 //Display Price
 System.out.println( "Original Price is: $" + total );
 System.out.println( "Discount Price is: $" + newtotal );
 }
 }