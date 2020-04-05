class MyThread extends Thread{
      public int[] values = {4,5,6,5,7};
	public void run(){
		for(int i=0;i<5;i++){
			values[i] = values[i]*2;
		}
        	for(int j=0;j<5;j++){
	        	System.out.println(values[j]);
        	}


	}
}
public class MultiThreadingDemo{
	public static void main(String[] args){
	Thread obj = new MyThread();
	obj.start();
	obj.run();


	}
}

