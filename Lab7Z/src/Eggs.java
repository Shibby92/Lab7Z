import java.util.Scanner;

public class Eggs {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int gross, dozen, eggs;
		System.out.println("Number of eggs: ");
		eggs = unos.nextInt();
		gross = eggs / 144;
		eggs = eggs - gross * 144;
		dozen = eggs / 12;
		eggs = eggs - dozen * 12;
		System.out.printf("Your number of eggs is %d gross, %d dozen, and %d ",
				gross, dozen, eggs);
	}
}