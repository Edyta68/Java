import java.util.Scanner;

import java.util.Date;

public class Main {

       public static void main(String[] args){
    	   
     //				ZADANIE 1
    System.out.println("Hello world"); 
    
    	   
    //					ZADANIE 2   
   	System.out.println("Edyta");
    System.out.println("22");
	   
    //					ZADANIE 3   
     Date date = new Date();
	System.out.println(date);
    
    	   
    //				ZADANIE 4   
 	System.out.println("Podaj pierwsza liczbe");
    Scanner pobierz = new Scanner(System.in);
    int a, b;
    a = pobierz.nextInt();
    System.out.println("Podaj drug¹ liczbe");
    b = pobierz.nextInt();
    System.out.println("\n");
    System.out.println("Suma to: "+(a+b));
    System.out.println("Ró¿nica to: "+(a-b));
    System.out.println("Iloczyn to: "+(a*b));
     
    	   
    //  				ZADANIE 5
    System.out.println("Podaj liczbê która chcesz podnieœc do kwadratu: ");
    Scanner pobierz2 = new Scanner(System.in);
    int c;
    c = pobierz2.nextInt();
    System.out.println("Liczba podniesiona do kwadratu to: "+(c*c));
    
    	   
   //  				  ZADANIE 6
    int[] tablica = {1, 5, 76, 93, 45, 33};
	for (int i=0; i<6; i++)
		System.out.println(tablica[i]);
	
    }
}