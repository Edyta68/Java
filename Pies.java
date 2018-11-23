public class Pies {
	 int wiek;
     String imie;
     String kolor;
     String rasa;

    Pies()
     {
    	 
     } 
     
     Pies(int wiek, String imie, String kolor, String rasa)

     {
           this.wiek = wiek;
           this.imie = imie;
           this.kolor = kolor;
           this.rasa = rasa;
     }

     public void wyswietlInfo()

     {
         System.out.println(this.imie+" "+this.kolor+" "+this.rasa+","+" "+this.wiek+" lat");
     }


     int zwrocWiek()

     {
           return wiek;
     }
     
     void aktualizujWiek(int nowy_wiek)
     {
    	 if (nowy_wiek < 0)
    		 System.out.println("Wiek nie mo¿e byæ ujemny");
    	 else
    		 wiek = nowy_wiek;
     }
}


