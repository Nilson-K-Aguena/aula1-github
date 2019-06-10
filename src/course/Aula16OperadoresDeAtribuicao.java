package course;

public class Aula16OperadoresDeAtribuicao {

	public static void main(String[] args) {
		double n1 = 10;
		double n2 = 30;
		String s  = "ABC";
		int    a  = 10;
		int    b  = a++;
		int    c  = ++a;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);		
		System.out.println("------------");
		
		n1 *= 2;
		n2 += n1;
		s  += "DEF";
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		System.out.println("------------");
				
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}