package course;

import java.util.Scanner;

public class Aula28SwitchCase {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int     x;		
		String  day;
		
		System.out.println("-------------------");
		
		x = sc.nextInt();
		
		System.out.println("Without Switch Case");
		if (x == 1)
			day = "Sunday";
		else if (x == 2)
			day = "Monday";
		else if (x == 3)
			day = "Tuesday";
		else if (x == 4)
			day = "Wednesday";
		else if (x == 5)
			day = "Thursday";
		else if (x == 6)
			day = "Friday";
		else if (x == 7)
			day = "Saturday";
		else
			day = "Invalid Value";
		
		System.out.println("Day: " + day);
		System.out.println("-------------------");
						
		x = sc.nextInt();
		
		System.out.println("With Switch Case");
		
		switch (x) {
		case 1:
			day = "Sunday";
			break;
		case 2:
		    day = "Monday";
		    break;
		case 3:
		    day = "Tuesday";
		    break;
		case 4:
	        day = "Wednesday";
	        break;
		case 5:
        	day = "Thursday";
        	break;
		case 6:
        	day = "Friday";
        	break;
		case 7:
			day = "Saturday";
        	break;        
		default:
			day = "Invalid Value";;
		}
		
		System.out.println("Day: " + day);
		System.out.println("-------------------");
		
		sc.close();
	}

}