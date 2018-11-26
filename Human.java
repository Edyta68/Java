
public class Human extends Mammal{
    
	String imie;
	int wiek;
	
	Human(String odglos, String sposobPoruszania, String gatunek, int iloscNog, String imie, int wiek)
	{
		super(odglos, sposobPoruszania, gatunek, iloscNog);
		this.imie = imie;
		this.wiek = wiek;
	}
	
	public String toString()
	{
		return imie+" "+wiek+" "+gatunek+" "+sposobPoruszania+" "+odglos+" "+iloscNog;
	}
}
