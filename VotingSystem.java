/*A Voting Software System:
A program that allows users to vote 
and counts the number of votes for each candidate.*/

package com.joe;
import java.util.Scanner;
public class VotingSystem {

  public static void main(String[] args) {

System.out.println("Enter no of eligible voters: ");

Scanner election = new Scanner(System.in);

int no_of_voters = election.nextInt();

int victory_count = 0;
int stanley_count = 0;


for(int i = 1; i <= no_of_voters && no_of_voters > 0; i++){
  System.out.println("Vote for one of the two: Victory or Stanley ");
  
  String vote = election.next();
  
  if(vote.equalsIgnoreCase("victory")){
    victory_count++;
  } 
  
  else if(vote.equalsIgnoreCase("stanley")){
    stanley_count++;
  }
  
  else {
    System.out.println("candidate does not exist ");
  }
  
}


System.out.println(victory_count);
System.out.println(stanley_count);
election.close();


  }

}
