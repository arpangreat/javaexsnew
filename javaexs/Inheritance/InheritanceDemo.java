class Calc{     //Super,Parent
	public int add(int i,int j){
		return i+j;
	}
}

class CalcAdv extends Calc{    //Sub,Child
	public int sub(int i,int j){
		return i-j;
	}
}

class CalcVeryAdv extends CalcAdv{
	public int multi(int i,int j){
		return i*j;
	}
}

public class InheritanceDemo{
	public static void main(String[] args){
		CalcVeryAdv obj = new CalcVeryAdv();

		int res1 = obj.add(3,4);
		int res2 = obj.sub(5,6);
		int res3 = obj.multi(4,5);

		System.out.println(res1);
  	 	System.out.println(res2);
		System.out.println(res3);
	}
}

