package course;

import java.util.Scanner;

public class Aula37For {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int     sum = 0;
		
		System.out.println("How many numbers are you going to enter: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Value # " + i + ": ");
			int x = sc.nextInt();
			sum += x;
		}
		
		System.out.println("Sum = " + sum);
		
		sc.close();
	}

}