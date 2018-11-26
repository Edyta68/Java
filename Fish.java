
public abstract class Fish extends Animal {
	int iloscPletw;
	
	Fish(String odglos, String sposobPoruszania, String gatunek, int iloscPletw)
	{
		super(odglos, sposobPoruszania, gatunek);
		this.iloscPletw = iloscPletw;
	}
}
