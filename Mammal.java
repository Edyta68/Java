
public abstract class Mammal extends Animal {
	int iloscNog;
	
	Mammal(String odglos, String sposobPoruszania, String gatunek, int iloscNog)
	{
		super(odglos, sposobPoruszania, gatunek);
		this.iloscNog = iloscNog;
	}
}
