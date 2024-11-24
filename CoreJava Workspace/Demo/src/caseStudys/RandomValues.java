package caseStudys;
import java.lang.Math;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class RandomValues {

	public static void main(String[] args) {
		Values obj=new Values();
		//obj.disp();
		Values1 obj1=new Values1();
	//	obj1.disp();
		Values2 obj2=new Values2();
	//	obj2.disp();
		//Values3 obj3=new Values3();
		//obj3.disp();
		
	}

}                                             // random values generation

class Values
{
	public void disp()
	{
		int max=5;
		int min=2;
		System.out.println(Math.random());
		System.out.println(Math.random()*(max-min+1)+min);
	}

}
class Values1
{
	Random obj=new Random();
	public void disp()
	{
		int a=obj.nextInt(5);
		float b=obj.nextFloat(5);
		float c=obj.nextFloat();
		double d=obj.nextDouble();        //  here if we pass value it take as bound(last) but if we dont pass anything to falot ,double it gives between 0.0 to <1.0
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(obj.nextFloat(5));
	}

}
class Values2
{
	ThreadLocalRandom obj = ThreadLocalRandom.current();
	public   void disp()
	{
		//int a=ThreadLocalRandom.current().nextInt(4); we can write like this other than with object
		int a=obj.nextInt(1,5);
		int b=obj.nextInt(3);
		System.out.println(a);
		System.out.println(b);
	}
	
}

/*class Values3
{ 
	Random obj=new Random();
	public void disp()
	{
		IntStream a=obj.ints(2,1,10);        //doubt
		System.out.println(a);
	}
}*/