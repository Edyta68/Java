
import java.util.ArrayList;
import java.util.List;

public class ZAD1 {
	 public static void main(String[] args){
		 List<String> lista_osob = new ArrayList<String>();
		 
		 lista_osob.add("Lukasz");
		 lista_osob.add("Ola");
		 lista_osob.add("Krzysiek");
		 lista_osob.add("Bartek");
		 lista_osob.add("Damian");
		 lista_osob.add("Edyta");
		 lista_osob.add("Mirek");
		 lista_osob.add("Mariusz");
		 lista_osob.add("Marek");
		 lista_osob.add("Agnieszka");
		 lista_osob.add("Pawe³");
		 lista_osob.add("Wojtek");



	
		 System.out.println("Rozmiar listy to: "+lista_osob.size());
		 
		 int i[] = {10,9,8,7,6,2,1,0};
		 
		 for (int j = 0; j < i.length; j++) {
			    lista_osob.remove(i[j]);
			}
		 
		 System.out.println("Rozmiar listy to: "+lista_osob.size());
		 
		 for (int k=0; k<lista_osob.size(); k++) {
			 Object element = lista_osob.get(k); 
			 System.out.println(element); 
		 } 
		/* for(String element : lista_osob) {
			    System.out.println(element); 
		 } */
		 
		 
	 }
}
