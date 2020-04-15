import java.util.Scanner;
class Calculator{
double sum(double i,double k){
	return i + k;
}
double sub(double i,double k){
	return i - k;
}
double multi(double i,double k){
	return i * k;
}
double divi(double i,double k){
	return i / k;
}

}
public class CalculatorDemo{
	public static void main(String[] args){

	double num1,num2;
	int z;
	System.out.println("Enter Your First Number:");
	Scanner sc = new Scanner(System.in);
	num1 = sc.nextDouble();
	System.out.println("Enter Your Second Number:");
	num2 = sc.nextDouble();
	System.out.println("Enter Your Choice");
	System.out.println("1 for sum , 2 for sub , 3 for multiplication , 4 for Dividation:");
	
	z = sc.nextInt();
	Calculator obj = new Calculator();
	switch(z){
        case 1:
	   System.out.println(obj.sum(num1,num2));
	   break;
	case 2:
           System.out.println(obj.sub(num1,num2));
	   break;
	case 3:
	   System.out.println(obj.multi(num1,num2));
	   break;
	case 4:
	   System.out.println(obj.divi(num1,num2));
	   break;
	}
    }
}
