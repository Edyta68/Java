import java.util.Scanner;

public class uczenKlasy extends uczenSzkoly{

	String klasa;
	
	void UstawKlase()
	{
		System.out.println("Podaj nazwe klasy: ");
		Scanner podajKlase = new Scanner(System.in);
	    String nazwaKlasy;
	    nazwaKlasy = podajKlase.nextLine();
	}
}
