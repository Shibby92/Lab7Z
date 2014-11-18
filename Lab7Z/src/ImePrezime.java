import java.util.Scanner;

public class ImePrezime {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		String ime = unos.next();
		String prezime = unos.next();
		System.out.printf("Your first name is %s, which has %d characters",
				ime, ime.length());
		System.out.printf("Your last name is %s, which has %d characters",
				prezime, prezime.length());
	}
}