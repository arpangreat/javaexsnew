interface Abc{
	void show();
}

class Implementar implements Abc{
	public void show(){
		System.out.println("Implementing the Implementar");
	}
}
public class InterfacesDemo2{
	public static void main(String[] args){

         Abc obj = new Implementar();
	 obj.show();        


	}
}

