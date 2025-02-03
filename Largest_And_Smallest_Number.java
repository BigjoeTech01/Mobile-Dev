package com.joe;

public class Largest_And_Smallest_Number {

  public static void main(String[] args) {
  
   int[] compare = {5,2,9,1,5,6,11};
   int largest = compare[0];
   int smallest = compare[0];
   int count = 1;
   for (int i : compare){
     if (i > largest ) {
       largest = i;   
     }
   }
   
   
   for (int j : compare){
     if(j < smallest) {
       smallest = j;
     }
   }
   System.out.println("largest is " + largest + " & smallest is " + smallest);
   
   System.out.print(count);
   
   
   
   
   
   
   
  }
}
