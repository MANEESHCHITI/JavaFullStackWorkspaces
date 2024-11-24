package java8features;



//var args which is in overloading
class Ab{

public void disp(int b,int... a) {

	int sum=0;
	for(int a1:a) {                               //below it should not be any other overloading methods.
		sum=sum+a1;
	}
	System.out.println(sum);
}	
public void disp() {
	
}



}
public class Bin1 {

	public static void main(String[] args) {
		Ab obj1=new Ab();
		obj1.disp();
	
		obj1.disp(1);
		
		
		
	}

}
