import java.util.Scanner;
import java.util.Date;
import java.util.Random;
import java.util.Arrays;


public class L2 {

	public static void main(String[] args){
    	      	   
    //   				ZADANIE 1
	   System.out.println("Podaj liczbê: ");
	   Scanner pobierz3 = new Scanner(System.in);
	   int d;
	   d = pobierz3.nextInt();
	   if(d % 2 !=0)
	         System.out.println("Liczba jest nieparzysta");
	   else
	         System.out.println("Liczba jest parzysta");
	  
    	   
	  //   				ZADANIE 2 
        System.out.println("Podaj liczbê: ");
        Scanner pobierz4 = new Scanner(System.in);
        int o;
        o = pobierz4.nextInt();
        switch(o % 2) {
        case 0:
	   		System.out.printf("\n %d jest liczb¹ parzyst¹", o);
		break;
		case 1:
			System.out.printf("\n %d jest liczb¹ nieparzyst¹", o);	
        break;         
        }
	  

	   //  			ZADANIE 3 II
	   int tablica3[] = new int[10];
       for (int i=0; i<tablica3.length; i++)
             tablica3[i] = (int)(Math.random() *10);
       for (int j : tablica3)
             System.out.println(j);
	     
    	   
    	// 				ZADANIE 4 II
	   	int f;
  	 	int suma = 0;
  	 	while (true) {
  	 		System.out.println("Podaj liczbê: ");
  	 		Scanner pobierz5 = new Scanner(System.in);
  	 		f = pobierz5.nextInt();  
  	 		suma += f;
  	 		if (f == 0){
  	 			System.out.printf("Suma wynosi: %d ", +suma); 
  	 			break;}
  	 	    else
  	 	    	continue;
      	     } 
      	  
    	   
	   //   			ZADANIE 5 II
	   Scanner pobierz8 = new Scanner(System.in);
       int e;
       e = pobierz8.nextInt(); 
       if (e >=1 && e <10)
             System.out.println("Liczba mieœci siê w zakresie");
       else
             System.out.println("Liczba jest spoza zakresu"); 	   
      
    
	   //				ZADANIE 6 II
	   int g;
	   while (true) {
           System.out.println("Podaj liczbê: ");
           Scanner pobierz5 = new Scanner(System.in);
           g = pobierz5.nextInt();  
           if (f == 5 || f ==0)
        	   break;
         }
       
    	   
	   //   			ZADANIE 7 II
	   Scanner pobierz10 = new Scanner(System.in);
	   int u;
	   System.out.println("Podaj liczbê: ");
	   u = pobierz10.nextInt();
	   String[] sprawdz = { "parzysta", "nieparzysta" };
	   System.out.println(u + " jest " + sprawdz[u % 2]);
      } 
}