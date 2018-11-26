
public class Goldfish extends Fish {
	String kolor;
	int wiek;
	
	Goldfish(String odglos, String sposobPoruszania, String gatunek, int iloscPletw, String kolor, int wiek)
	{
		super(odglos, sposobPoruszania, gatunek, iloscPletw);
		this.kolor = kolor;
		this.wiek = wiek;
	}
	
	public String toString()
	{
		return "Odglos: " +odglos + "\nIlosc pletw: " +iloscPletw+"\nKolor: " +kolor+"\nGatunek: " +gatunek+ "\nWiek: " +wiek+"\nSposob poruszania: " + sposobPoruszania;
	}
}
