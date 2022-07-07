import java.util.Scanner;

class Calculator {
	double sum(double i, double k) {
		return i + k;
	}

	double sub(double i, double k) {
		return i - k;
	}

	double multi(double i, double k) {
		return i * k;
	}

	double divi(double i, double k) {
		return i / k;
	}

}

public class AdvCalculator {
	private static void norCal() {
		double num1, num2;
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
		switch (z) {
			case 1:
				System.out.println(obj.sum(num1, num2));
				break;
			case 2:
				System.out.println(obj.sub(num1, num2));
				break;
			case 3:
				System.out.println(obj.multi(num1, num2));
				break;
			case 4:
				System.out.println(obj.divi(num1, num2));
				break;
		}
	}

	public static void matrix2() {
		double[][] m2r = new double[2][2];

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Row1-Col1");
		m2r[0][0] = sc1.nextDouble();
		System.out.println("Enter Row1-Col2");
		m2r[0][1] = sc1.nextDouble();
		System.out.println("Enter Row2-Col1");
		m2r[1][0] = sc1.nextDouble();
		System.out.println("Enter Row2-Col2");
		m2r[1][1] = sc1.nextDouble();

		System.out.println(" Enter 1 for normal and 2 for determinante ");

		int n;
		n = sc1.nextInt();

		switch (n) {
			case 1:
				System.out.println("| " + m2r[0][0] + " " + m2r[0][1] + " |");
				System.out.println("| " + m2r[1][0] + " " + m2r[1][1] + " |");
				break;
			case 2:
				System.out.println(" Your result of determinante of given Matrix is:");
				System.out.println((m2r[0][0] * m2r[1][1]) - (m2r[0][1] * m2r[1][0]));
				break;
		}

	}

	public static void matrix3() {
		double[][] m3r = new double[3][3];

		Scanner sc2 = new Scanner(System.in);

		System.out.println("Enter Row1-Col1");
		m3r[0][0] = sc2.nextDouble();
		System.out.println("Enter Row1-Col2");
		m3r[0][1] = sc2.nextDouble();
		System.out.println("Enter Row1-Col3");
		m3r[0][2] = sc2.nextDouble();
      		System.out.println("Enter Row2-Col1");
		m3r[1][0] = sc2.nextDouble();
		System.out.println("Enter Row2-Col2");
		m3r[1][1] = sc2.nextDouble();
		System.out.println("Enter Row2-Col3");
		m3r[1][2] = sc2.nextDouble();
		System.out.println("Enter Row3-Col1");
		m3r[2][0] = sc2.nextDouble();
		System.out.println("Enter Row3-Col2");
		m3r[2][1] = sc2.nextDouble();
		System.out.println("Enter Row3-Col3");
		m3r[2][2] = sc2.nextDouble();

		double val1 = ((m3r[1][1] * m3r[2][2]) - (m3r[1][2] * m3r[2][1]));
		double val2 = ((m3r[1][0] * m3r[2][2]) - (m3r[1][2] * m3r[2][0]));
		double val3 = ((m3r[1][0] * m3r[2][1]) - (m3r[2][0] * m3r[1][1]));

		System.out.println(" Enter 1 for normal and 2 for determinante ");

		int n;
		n = sc2.nextInt();
		switch (n) {
			case 1:
				System.out.println("| " + m3r[0][0] + " " + m3r[0][1] + " " + m3r[0][2] + " |");
				System.out.println("| " + m3r[1][0] + " " + m3r[1][1] + " " + m3r[1][2] + " |");
				System.out.println("| " + m3r[2][0] + " " + m3r[2][1] + " " + m3r[2][2] + " |");

				break;
			case 2:
				System.out.println(" Your result of determinante of given Matrix is:");
				System.out.println((m3r[0][0] * val1) - (m3r[0][1] * val2) + (m3r[0][2] * val3));
				break;
		}

	}

	public static void main(String[] args) {
		System.out.println(
				"Enter 1 for normal calculator or 2 for (2*2) matrix calulator or 3 for (3*3) matrix calculator or 4 for quit");
		Scanner sc3 = new Scanner(System.in);
		int x = sc3.nextInt();
		switch (x) {
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
