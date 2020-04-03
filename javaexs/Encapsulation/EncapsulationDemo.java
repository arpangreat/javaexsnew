//Encapsulation -> Binding Data with Methods
class Student{
	private int rollno;
	private String name;

	// Getters and Setters
	
	public void setRollno(int r){
		this.rollno = r;
	}
	public int getRollno(){
		return rollno;
	}

	public void setName(String n){
		this.name = n;
	}
	public String getName(){
		return name;
	}
}

public class EncapsulationDemo{
	public static void main(String[] args){
	    Student s1 = new Student();
	    s1.setRollno(2);
	    s1.setName("Swastik");

	    System.out.println(s1.getRollno());
	    System.out.println(s1.getName());
	}
}

