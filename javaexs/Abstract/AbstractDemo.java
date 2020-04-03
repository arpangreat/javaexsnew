abstract class Human{
	public abstract void eat();

	
	public void walk(){

	}
}

class Man extends Human{  //Concrete
	public void eat(){
         
	}

}

class Printer{
/*	public void show(Integer i){
		System.out.println(i);
	}
	public void show(Double i){
		System.out.println(i);
	}
*/

	public void show(Number i){
		System.out.println(i);	
	}
}
public class AbstractDemo{
	public static void main(String[] args){

	Printer obj = new Printer();
	obj.show(5.6);




	}
}

