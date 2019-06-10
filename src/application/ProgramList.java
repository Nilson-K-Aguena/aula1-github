package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {

	public static void main(String[] args) {
		List <String> list = new ArrayList();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		// Adiciona na posi��o indicada no primeiro par�metro
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for (String x : list)
			System.out.println(x);
		
		System.out.println("------------------");
		
		//list.remove("Anna");
		//list.remove(1);
		// Remove todos que come�am com M
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list)
			System.out.println(x);
		
		System.out.println("------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("------------------");
		
		// Converte para stream, filtra e devolve como uma lista
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result)
			System.out.println(x);
		
		System.out.println("------------------");
		// Encontra o primeiro nome come�ado com A, caso n�o tenha retorna null
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}