
public class FibonacciSeries {
	//here this code is printing a fibonacci series, where i can set the maximum numbers to be printed.
	   public static void main(String args[]) {
	       int n1 = 0, n2 = 1, n3, i, max = 6;
	       System.out.print(n1 + " " + n2);
	       for (i = 2; i < max; ++i) {
	          n3 = n1 + n2;
	          System.out.print(" " + n3);
	          n1 = n2;
	          n2 = n3;
	       }
	    }
	 }

