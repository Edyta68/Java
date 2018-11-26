import java.util.Scanner;

public class uczenSzkoly extends Uczen {

	String nazwaSzkoly;
	
	void UstawSzkole()
	{
		System.out.println("Podaj nazwe szkoly: ");
		Scanner podajSzkole = new Scanner(System.in);
	    String nazwaSzkoly;
	    nazwaSzkoly = podajSzkole.nextLine();
	}
}
