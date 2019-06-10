package course;

import java.util.Scanner;

public class Aula24EstruturaCondicional {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);		 
		int     n;
		
		System.out.println("Enter an integer number :");
		n = sc.nextInt();
		
		if (n % 2 == 0)
			System.out.println("Even!");
		else
			System.out.println("Odd!");
		
		Scanner sc2  = new Scanner(System.in);
		int     time = sc2.nextInt();
		
		if (time < 12)
			System.out.println("Good morning!");
		else if (time < 18)
			System.out.println("Good afternoon!");
		else 
			System.out.println("Good evening!");
				
		sc.close();
		sc2.close();
	}

}