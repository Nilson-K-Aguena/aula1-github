package course;

import java.util.Locale;

public class Aula14SaidaDeDados {

	public static void main(String[] args) {
		char gender    = 'F';
		int  age       = 32;
		double balance = 10.35784;
		String name    = "Maria";
		
		System.out.print("Good morning!"); // Sem quebra de linha
		System.out.println("Good afternoon!"); // Com quebra de linha
		System.out.println("Good night!");
		System.out.println("----------------------------");
		System.out.printf("%.2f%n", balance); // %n quebra linha
		System.out.printf("%.4f%n", balance);
		Locale.setDefault(Locale.US); // Troca para o padrão americano
		System.out.printf("%.4f%n", balance);
		System.out.println("----------------------------");
		System.out.printf("%s is %d years old, gender %c and got balance = %.2f bitcoins.%n", name, age, gender, balance);
	}

}