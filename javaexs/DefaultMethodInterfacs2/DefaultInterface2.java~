@FunctionalInterface
interface Demo{
	void abc();
	default void show(){
		System.out.println("In Demo show");
	}
}

interface MyDemo{
	default void show(){
		System.out.println("In MyDemo show");
	}
}

class DemoImp implements Demo, MyDemo{
	public void abc(){
		System.out.println("In abc");
	}
	@Override
	public void show(){
		MyDemo.super.show();
	}
}

public class DefaultInterface2{
	public static void main(String[] args){
	Demo obj = new DemoImp();
	obj.abc();
	obj.show();
	}
}

