import java.util.Scanner;

public class BeautyPhi{
	public static void main(String args[]){
	   double a,b,res1,res2,points;
           Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the distance between HEAD and BOTTOM of NECK in CM");
	   a = sc.nextDouble();
	   System.out.println("Enter the value between EyeBrows and BOTTOM of NECK in CM");
	   b = sc.nextDouble();
	   
	   res1 = a / b;
	   res2 = (a+b)/a;
	   points = ((100*res1)/res2)/10;
           System.out.println("The point of your beauty is " + points);
	  
           }
}

