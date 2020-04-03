class A{
	public void show(){
		System.out.println("In A");
	}
}

class B extends A{
	@Override
	public void show(){
		System.out.println("In B");
	}
}

class C extends A{
	@Override
	public void show(){
		System.out.println("In C");
	}
}

public class DMDDemo{
	public static void main(String[] args){
		A obj = new B();  //runtime polyorphishm
		obj.show();
		obj = new C();    
		obj.show();      //Dynamic Method Dispatch


	}
}

