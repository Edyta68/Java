import java.util.Set;
import java.util.TreeSet;

public class ZAD2 {
	public static void main(String[] args){
		Set<String> imiona = new TreeSet<>();
		imiona.add("£ukasz");
		imiona.add("Marek");
		imiona.add("Mirek");
		imiona.add("Ola");
		imiona.add("Edyta");
		imiona.add("Agnieszka");
		imiona.add("Damian");
		imiona.add("Krzysiek");
		imiona.add("Agnieszka");imiona.add("Agnieszka");
		
		
		for (String imie: imiona) {
			System.out.println(imie);
		}
	}
}