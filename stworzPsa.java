public class stworzPsa {
	public static void main(String args[]){

        Pies pies = new Pies();
        Pies pies2 = new Pies(11, "Burek", "bia³y", "york");
        pies.wiek = 5;
        pies.imie = "Reksio";
        pies.rasa = "jamnik";
        pies.kolor = "czarny";
        pies2.aktualizujWiek(6);
        pies.wyswietlInfo();
        pies2.wyswietlInfo();
        
        System.out.println(pies.zwrocWiek());
        
        Pies[] piesek = new Pies[3];
       /* for (int i=0; i<piesek.length; i++)
        	piesek[i]=new Pies();
        piesek[0].imie = "Kropka";
        piesek[0].wiek = 13;
        piesek[0].rasa = "pudelek";
        piesek[0].kolor = "mieszany";
        
        piesek[1].imie = "Baksiu";
        piesek[1].wiek = 8;
        piesek[1].rasa = "wilczur";
        piesek[1].kolor = "br¹zowy";
        
        piesek[2].imie = "Jack";
        piesek[2].wiek = 9;
        piesek[2].rasa = "maltañczyk";
        piesek[2].kolor = "czarny"; */
        
        piesek[0] = new Pies(13, "Kropka", "mieszany", "pudelek");
        piesek[1] = new Pies(8, "Baksiu", "br¹zowy", "wilczur");
        piesek[2] = new Pies(9, "Jack", "bia³y", "maltañczyk");
        
        for (Pies j: piesek)
        	j.wyswietlInfo();
        
  }
}
	

