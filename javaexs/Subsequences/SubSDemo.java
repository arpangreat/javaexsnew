import java.util.Scanner;

public class SubSDemo{
 public static void Subs(String input,String output){
		if(input.length() == 0){
                System.out.println(output);
		return;
		}

	  Subs(input.substring(1),output);
	  Subs(input.substring(1),output+input.charAt(0));
	}
	public static void main(String args[]){
	String input;
	String output="";
	System.out.println("Enter your String:");
        
	Scanner sc = new Scanner(System.in);
	input = sc.nextLine();
	Subs(input,output);
	return;

           }
}

