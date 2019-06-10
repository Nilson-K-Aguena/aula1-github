package course;

public class Aula13Cast {

	public static void main(String[] args) {
		double a;
		float  b;
		
        a = 5.0;
        b = (float)a;
        
        System.out.println(b);
        
        int c;
        
        a = 5.7;
        c = (int)a;
        
        System.out.println(c);
        
        int    d, e;
        double result;
        
        d = 5;
        e = 2;
        
        result = (double)d/e;
        //result = d/e; // Perde as casas decimais
        System.out.println(result);
        
        int    f;        
        String s = "33";
        double result2;
        
        f       = Integer.parseInt(s);
        result2 = Double.parseDouble(s); 
        System.out.println(f);
        System.out.println(result2);
	}
}