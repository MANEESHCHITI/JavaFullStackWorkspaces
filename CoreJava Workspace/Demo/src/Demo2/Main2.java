package Demo2;
import Demo1.Ex1;
import Demo1.Ex2;
import Demo1.Ex3;
import Demo2.Main1;


public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1 obj1=new Ex1();                         // private-we can acess only within the class
		                                            //public can access from anywhere
		                                           //protected can acess with package not allowed outside package except child in other package
		                                           //unspecified can acess only in same package but not in another package
		                                            
		                                            //but if we create methods in respective with public we can access all
		Ex2 obj2=new Ex2();
		Ex3 obj3=new Ex3();
		Main1 obj4=new Main1();
		//obj1.show1();
		//obj2.show2();
		//obj3.show3();
		//obj4.show4();
		obj1.disp1();
		obj2.disp2();
		//System.out.println(obj1.x);
		//System.out.println(obj2.y);
		//System.out.println(obj3.z);
		System.out.println(obj4.a);
		
		
		
		
		
		

	}

}

