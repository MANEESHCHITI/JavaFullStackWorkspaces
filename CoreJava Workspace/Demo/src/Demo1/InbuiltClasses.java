package Demo1;

public class InbuiltClasses {
 int a=11;
 void show(int a)
 {
	 if(this.a==a)
	 {                                                            ///doubt
			int s=7;
			for(int i=2;i<s;i++)
			{
				if(s%i==0)
				{
					System.out.println("not prime");
					break;
				}
				else if(s-1==i)
				{
					System.out.println("prime");
				}
				
				 
			}
	 }
 }
}
 
 class B
 {
	 A a=new A();
	 void disp()
	 {
	 a.show(10);
	  }
 }
 class C
 {
	 public static void main(String args[])
	 {
		 B b=new B();
		 b.disp();
	 }
 }
 
