package course;

import java.util.Locale;
import java.util.Scanner;

public class Aula18EntradaDeDadosParte2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc   = new Scanner(System.in);		
		int     n1   = sc.nextInt();         // 35		
		// Consome a primeira quebra de linha (limpa)
		sc.nextLine(); 
		String  name = sc.nextLine();        // Bob Brown		
		char   gender = sc.next().charAt(0); // F
		String s      = sc.next();           // b5
		char   letter = s.charAt(0);
		int    digit  = Integer.parseInt(s.substring(1));		
		double n2     = sc.nextDouble();     // 4.32
		// Maria F 23 1.68
		String name2  = sc.next();
		char   ch     = sc.next().charAt(0);
		int    age    = sc.nextInt();
		double high   = sc.nextDouble();
				
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(s);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		System.out.println(name2);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(high);
		
		sc.close();
	}

}