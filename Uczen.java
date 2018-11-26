import java.util.Scanner;

public class Uczen {
	String imie;
	String nazwisko;
	int pesel;
	
	void ustawImie()
	{
		System.out.println("Podaj imie: ");
		Scanner podajImie = new Scanner(System.in);
	    String imie;
	    imie = podajImie.nextLine();
	}
	
	void ustawNazwisko()
	{
		System.out.println("Podaj nazwisko: ");
		Scanner podajNazwisko = new Scanner(System.in);
	    String nazwisko;
	    nazwisko = podajNazwisko.nextLine();
	}
	
	void ustawPesel()
	{
		System.out.println("Podaj pesel: ");
		Scanner podajPesel = new Scanner(System.in);
	    String pesel;
	    pesel = podajPesel.nextLine();
	}
}
