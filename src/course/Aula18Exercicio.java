package course;

import java.util.Locale;
import java.util.Scanner;

public class Aula18Exercicio {

	public static void main(String[] args) {
		int     nRooms;
		int     age;
		double  price;
		double  height;
		String  lastName;
		String  name;
		Scanner sc;
		
		Locale.setDefault(Locale.US);
		sc     = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		name     = sc.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		nRooms   = sc.nextInt();
		System.out.println("Enter product price:");
		price    = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line):");
		lastName = sc.next();
		age      = sc.nextInt();
		height   = sc.nextDouble();
		
		System.out.println("-------------");
		System.out.println(name);
		System.out.println(nRooms);
		System.out.printf("%.2f%n", price);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(height);
		
		sc.close();
	}

}