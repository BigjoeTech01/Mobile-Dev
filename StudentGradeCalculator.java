import java.util.Scanner;
public class StudentGradeCalculator {
 public static void main (String[] args){
 Scanner result = new Scanner(System.in);
 System.out.println("please enter total number of courses you offer: ");
 int no_of_courses_offered = result.nextInt();
 int i;
 double score ;
 double officialTotalScore = 100*no_of_courses_offered;
 double cutOff = (officialTotalScore/no_of_courses_offered)/2;
 double studentTotalScore = 0;
 double average;
 System.out.println("please enter all scores for the courses: ");
 for (i=0;i<no_of_courses_offered;i++){
 score = result.nextDouble();
 studentTotalScore = studentTotalScore + score;
 }

average = (studentTotalScore/no_of_courses_offered);
 if (average < cutOff){
 System.out.println(studentTotalScore);
 System.out.println(average);
 System.out.println("student failed!");
 }else {
 System.out.println(studentTotalScore);
 System.out.println(average);
 System.out.println("student passed!");
}}}