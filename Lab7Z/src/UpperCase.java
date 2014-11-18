import java.util.Scanner;


public class UpperCase {
	public static void main(String [] args){
		Scanner unos = new Scanner(System.in);
		String ime= unos.next();
		System.out.println("Hello " + ime.toUpperCase()+", nice to meet you!");
	}
}
