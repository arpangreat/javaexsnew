import java.util.Scanner;

public class FiboNacciDemo{
	public static int fib(int n){
		if(n == 0 || n == 1){
			return n;
		}
           return fib(n-1) + fib(n -2);
	}

	public static void main(String args[]){
	int n;
	System.out.println("Enter your number");
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	System.out.println(fib(n));
        }
}

