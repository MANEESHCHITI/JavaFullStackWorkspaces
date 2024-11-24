package java8features;

public class Lambda {

	public static void main(String[] args) {

		Runnable r=()->{
			for(int i=1;i<=5;i++){
				System.out.println(i);
				}	;
		};
		
		Thread t=new Thread(r);
		t.start();
		for(int j=10;j<=15;j++) {
			System.out.println(j);
		}
	}

}
