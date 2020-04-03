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

public class MethodOverRidingDemo{
	public static void main(String[] args){
		B obj = new B();
		obj.show();
	}
}

