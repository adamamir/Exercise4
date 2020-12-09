package Week8;
import java.util.Scanner;
public class Exercise4{
	
	   public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   
		   printQuestion1();
		   printQuestion2();
		   printQuestion3();
	   }
	   
		   //for
		   public static void printQuestion1(){
			   Scanner sc = new Scanner(System.in);
			   int upperbound = 100, lowerbound = 1, sum=0;
			   double average;
	    
			   for(int num=lowerbound; num<=upperbound; num++){
				   sum = sum+num;
			   }
			   System.out.println("Sum of 1 to 100: " +sum);
			   average = sum/upperbound;
			   System.out.println("Average: " +average);
		   }
		   
		   //while
		   public static void printQuestion2() {
			   Scanner sc = new Scanner(System.in);
			   int upperbound=100, lowerbound = 0, sum = 0, num = 1;
			   double average;
			   
			   while(num <= upperbound) {
				   sum = sum + num;
				   num++;
			   }
			   System.out.println("Sum of 1 to 100: " +sum);
			   average = sum/upperbound;
			   System.out.println("Average: " +average);   
		   }
		   
		   //do
		   public static void printQuestion3() {
			   Scanner sc = new Scanner(System.in);
			   int upperbound=100, lowerbound = 0, sum=0, num=1;
			   double average;
			   
			   do {
				   sum = sum+num;
				   num = num+1;
			   }while(num<=100);
			   System.out.println("Sum of 1 to 100: " +sum);
			   average = sum/upperbound;
			   System.out.println("Average: " +average);
		   }
	   
	 }