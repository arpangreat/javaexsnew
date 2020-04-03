class Calc{
    int num1;
    int num2;
    int result;

    public Calc(int a,int b){
     this.num1 = a;
     this.num2 = b;
    }

}

public class Constructor{
	public static void main(String[] args){
          Calc obj = new Calc(4,5);
	  System.out.println(obj.num1);
	  System.out.println(obj.num2);
	}
}
