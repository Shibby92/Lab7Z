import java.util.Scanner;


public class Change {
	public static void main(String [] args){
		Scanner unos = new Scanner(System.in);
		int quarter,dime,nickel,penny;
		double dollar;
		System.out.println("Quarters: ");
		quarter= unos.nextInt();
		System.out.println("Dimes: ");
		dime= unos.nextInt();
		System.out.println("Nickels: ");
		nickel=unos.nextInt();
		System.out.println("Pennys: ");
		penny=unos.nextInt();
		dollar= quarter*0.25+dime*0.1+nickel*0.05+penny*0.01;
		System.out.println("Money: "+dollar+" $");
}
}
