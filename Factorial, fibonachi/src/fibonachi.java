import java.util.Scanner;
public class fibonachi {
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Введите номер числа в системе Фибоначчи: ");
		int n = in.nextInt();
		in.close();
		System.out.println (n + " число равно: " + fibonachi1(n));
	}
	static int fibonachi1 (int n){
		if (n == 0){
			return 0;
		}
		if (n == 1){
			return 1;
		}
		else{
			return fibonachi1 (n - 1) + fibonachi1 (n - 2); 
		}
	}
}