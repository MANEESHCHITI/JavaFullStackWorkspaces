package applications;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {

		System.out.println("welcome to Shoppingmart");
		CaseStudy cs=new CaseStudy();
		cs.disp();

	}

}

class CaseStudy
{
	LinkedList ll=new LinkedList(); 


	CaseStudy1 obj1=new CaseStudy1(1,"WhiteShirt",800);
	CaseStudy1 obj2=new CaseStudy1(2,"whitePant",1000);
	CaseStudy1 obj3=new CaseStudy1(3,"BlackShirt",700);
	CaseStudy1 obj4=new CaseStudy1(4,"BlackPant",1200);

	Scanner s=new Scanner(System.in);

	public void disp()
	{


		System.out.println(obj1.no+"  "+obj1.shirt);
		System.out.println(obj2.no+"  "+obj2.shirt);
		System.out.println(obj3.no+"  "+obj3.shirt);
		System.out.println(obj4.no+" "+obj4.shirt);
		System.out.println();
		System.out.println("add item to cart");
		System.out.println();
		disp1();
	}
	public void disp1()
	{

		System.out.print("enter:-");
		int a=s.nextInt();
		System.out.println();
		switch(a)
		{
		case 1:
		{
			ll.add(obj1);
			disp3();
			break;
		}
		case 2:
		{
			ll.add(obj2);
			disp3();
			break;
		}
		case 3:
		{
			ll.add(obj3);
			disp3();
			break;
		}
		case 4:
		{
			ll.add(obj4);
			disp3();
			break;
		}
		default :
		{
			System.out.println("selected invalid item");
		}

		}

	}
	public void disp3()
	{
		int value=1;
		Iterator i=ll.iterator();
		System.out.println("----------Shopping Cart----------");
		System.out.println();
		while(i.hasNext())
		{
			CaseStudy1 cc=(CaseStudy1)i.next();

			System.out.println(value+")"+"  "+cc.shirt+" "+cc.price);
			System.out.println();
			value++;
		}
		disp2();

	}
	public void disp2()
	{
		System.out.println("1) Add more         2)remove        3)total cost of cart items          4)open cart          5)close App");
		System.out.println();
		System.out.print("Enter:- ");
		int a=s.nextInt();
		System.out.println();
		if(1==a)
		{
			disp();

		}
		else if(2==a)
		{
			System.out.print("enter:- ");
			System.out.println();
			int c=s.nextInt();
			if(ll.size()>c-1)
			{
				ll.remove(c-1);
				disp3();
			}
			else
			{
				System.out.println("entered incorrect");
				System.out.print("enter:- ");
				System.out.println();
				int ccc=s.nextInt();
				if(ll.size()>ccc-1)
				{
					ll.remove(c-1);
					disp3();
				}
				
			}

		}
		else if(3==a)
		{	int	total=0;
		Iterator ii=ll.iterator();
		while(ii.hasNext())
		{
			CaseStudy1 cc=(CaseStudy1)ii.next();
			total=total+cc.price;
		}
		System.out.println("Total price:-  "+total);
		disp2();
		}
		else if(4==a)
		{
			disp3();
		}
		else if(5==a)
		{
			System.out.println("ThankYou");
		}
		else
		{
			System.out.println("entered incorrect value");
			disp2();
		}
	}



}
class CaseStudy1
{
	int  no;
	String shirt;
	int price ;

	public CaseStudy1 (int a,String b,int c )
	{
		no=a;
		shirt=b;
		price=c;


	}
}
