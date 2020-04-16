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
public class AdvCalculator{
       private static void norCal(){
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
       public static void matrix2(){
	       double[][] matrix2arr = new double[2][2];
	       double r1c1,r1c2,r2c1,r2c2;
	       r1c1 = matrix2arr[0][0];
	       r1c2 = matrix2arr[0][1];
	       r2c1 = matrix2arr[1][0];
	       r2c2 = matrix2arr[1][1];

	       Scanner sc1 = new Scanner(System.in);
	       System.out.println("Enter Row1-Col1");
	       r1c1 = sc1.nextDouble();
	       System.out.println("Enter Row1-Col2");
	       r1c2 = sc1.nextDouble();
	       System.out.println("Enter Row2-Col1");
	       r2c1 = sc1.nextDouble();
	       System.out.println("Enter Row2-Col2");
	       r2c2 = sc1.nextDouble();

	       System.out.println(" Enter 1 for normal and 2 for determinante ");

	       int n;
	       n = sc1.nextInt();

	       switch(n){
		       case 1:
			  System.out.println("| " + r1c1 + " " + r1c2 + " |");
			  System.out.println("| " + r2c1 + " " + r2c2 + " |");
			break;
	               case 2:
			  System.out.println(" Your result of determinante of given Matrix is:");
			  System.out.println((r1c1*r2c2)-(r1c2*r2c1));
			break;
	       }

       }

       public static void matrix3(){
         double[][] matrix3arr = new double[3][3];
          double r1c1,r1c2,r1c3,r2c1,r2c2,r2c3,r3c1,r3c2,r3c3;
          r1c1 = matrix3arr[0][0];
          r1c2 = matrix3arr[0][1];
          r1c3 = matrix3arr[0][2];
          r2c1 = matrix3arr[1][0];
          r2c2 = matrix3arr[1][1];
          r2c3 = matrix3arr[1][2];
          r3c1 = matrix3arr[2][0];
          r3c2 = matrix3arr[2][1];
          r3c3 = matrix3arr[2][2];
	  
	  Scanner sc2 = new Scanner(System.in);

          
	 	  System.out.println("Enter Row1-Col1");
         	  r1c1 = sc2.nextDouble();
		  System.out.println("Enter Row1-Col2");
                  r1c2 = sc2.nextDouble();
                  System.out.println("Enter Row1-Col3");
                  r1c3 = sc2.nextDouble();
                  System.out.println("Enter Row2-Col1");
                  r2c1 = sc2.nextDouble();
                  System.out.println("Enter Row2-Col2");
                  r2c2 = sc2.nextDouble();
                  System.out.println("Enter Row2-Col3");
                  r2c3 = sc2.nextDouble();
                  System.out.println("Enter Row3-Col1");
                  r3c1 = sc2.nextDouble();
                  System.out.println("Enter Row3-Col2");
                  r3c2 = sc2.nextDouble();
                  System.out.println("Enter Row3-Col3");
                  r3c3 = sc2.nextDouble();

		   double val1 = ((r2c2*r3c3)-(r2c3*r3c2));
        	   double val2 = ((r2c1*r3c3)-(r2c3*r3c1));
 	           double val3 = ((r2c1*r3c2)-(r3c1*r2c2));

		  System.out.println(" Enter 1 for normal and 2 for determinante ");
  
                  int n;
                  n = sc2.nextInt();
 		switch(n){
                          case 1:                                                                                                                
                             System.out.println("| " + r1c1 + " " + r1c2 + " " + r1c3 + " |");
                             System.out.println("| " + r2c1 + " " + r2c2 + " " + r2c3 + " |");
			     System.out.println("| " + r3c1 + " " + r3c2 + " " + r3c3 + " |");

                           break;
                          case 2:
			     System.out.println(" Your result of determinante of given Matrix is:");
                             System.out.println((r1c1*val1)-(r1c2*val2)+(r1c3*val3));
                           break;
                  }

       }

       public static void main(String[] args){
	System.out.println("Enter 1 for normal calculator or 2 for (2*2) matrix calulator or 3 for (3*3) matrix calculator or 4 for quit");
	Scanner sc3 = new Scanner(System.in);
	int x = sc3.nextInt();
	switch(x){
              case 1:
                  norCal();
                  break;
              case 2:
                  matrix2();
                  break;
              case 3:
                  matrix3();
                  break;
              case 4:
                  break;
 
              default:
                   break;
       }

       }
}    
