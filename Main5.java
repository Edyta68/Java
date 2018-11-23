public class Main5 {
	 public static void main(String[] args){
		  int c, d;
	      try {
	         c = 0;
	         d = 40 / c;
	         System.out.println(d);
	      }
	      catch (ArithmeticException e) { 
	         System.out.println("Nie mozna dzielic przez zero");
	      } 
		 
		double a = 4.754;
		int b = (int) Math.round(a);
		System.out.println(b);
		
	   }
	 }

