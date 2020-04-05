@FunctionalInterface
interface Demo{
	void abc();
	default void show(){
		System.out.println("In show");
	}
}

class DemoImp implements Demo{
	public void abc(){
		System.out.println("In abc");
	}
}
public class DefaultInterface{
	public static void main(String[] args){
	Demo obj = new DemoImp();
	obj.abc();
	obj.show();




	}
}

