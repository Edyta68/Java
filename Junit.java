package test;

public class Junit {

	public int dodawanie(int liczba1, int liczba2) {
		return liczba1 + liczba2;
	}
	
	public int odejmowanie(int liczba1, int liczba2) {
		return liczba1 - liczba2;
	}
	
	public int mnozenie(int liczba1, int liczba2) {
		return liczba1 * liczba2;
	}
	
	public double dzielenie(double liczba1, double liczba2) {
		if (liczba1==0 || liczba2==0)
		{
			throw new IllegalArgumentException("Nie dziel przez 0");
		}
		return liczba1 / liczba2;
	}
}
