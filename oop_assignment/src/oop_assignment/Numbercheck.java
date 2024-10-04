package oop_assignment;
import java.util.Scanner;
public class Numbercheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

		   System.out.print("Enter the start of the range: ");
			int start = scanner.nextInt();

			System.out.print("Enter the end of the range: ");
			int end = scanner.nextInt();

			  for (int i = start; i <= end; i++) {

			  if (i % 2 == 0) {
		      System.out.println(i + " is even.");
				   } else {
			  System.out.println(i + " is odd.");
				          
			  }
				       }

				        scanner.close();
				        
		  }

		 }
		

