package Demo1;
class Exam1
{
int n=15;
public void show(Exam1 x)
{                                          //sir class
//	n=x;
//	for(int i=1;i<=n;i++)
//	{
//	System.out.println(i);
//	}
	System.out.println(x.n+x.n);
}
}
//class Exam2
//{
//	public void show1()
//	{
//Exam1 obj1=new Exam1();
//	obj1.show(5);
//	System.out.println(obj1.n);
//	}
//}
//class Exam3
//{
//	public void show2()
//	{
//Exam1 obj2=new Exam1();
//System.out.println(obj2.n);
//
//	obj2.show(6);
//	}
//}



public class Example {

	public static void main(String[] args) {
//		Exam2 obj3=new Exam2();
//		Exam3 obj4=new Exam3();
//		obj3.show1();
//		
//		obj4.show2();
		Exam1 obj5=new Exam1();
		Exam1 obj6=new Exam1();
		obj5.show(obj6);
		

		

	}

}
