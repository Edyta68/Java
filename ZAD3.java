import java.util.Map;
import java.util.TreeMap;
public class ZAD3 {
	public static void main(String[] args){
		Map<Integer, Double> liczby = new TreeMap<>();
		liczby.put(234, 45.6);
		liczby.put(46, 452.692);
		liczby.put(1, 36.6);
		liczby.put(123, 145.0);
		liczby.put(22, 28.7);
		liczby.put(1340, 43.45);
		liczby.put(298, 2445.80234);
	
		for (Map.Entry<Integer, Double> entry : liczby.entrySet()) {
		    System.out.println("Klucz = " + entry.getKey() + ", Wartoœæ = " + entry.getValue());
		}
		
		//ZAD4
		
		Map<Integer, Object> mapa_liczby = new TreeMap<>();
		mapa_liczby.put(100, liczby);
		mapa_liczby.put(101, liczby);
		mapa_liczby.put(102, liczby);
		mapa_liczby.put(103, liczby);
		mapa_liczby.put(104, liczby);
		mapa_liczby.put(105, liczby);
		mapa_liczby.put(106, liczby);
	}
}
