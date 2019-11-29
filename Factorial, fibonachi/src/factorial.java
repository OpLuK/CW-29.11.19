import java.util.Scanner;
public class factorial {
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		in.close();
		factorial1(n);
		System.out.println(n + "!" + " = " + factorial1(n));
	}
	static long factorial1 (long n){
		if (n == 1){
			return 1;
		}
		return n * factorial1(n-1);
	}
	
}
