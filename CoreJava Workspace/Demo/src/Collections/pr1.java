package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class pr1 {                          //ArrayList,iterator,hasNext(),next(),

	public static void main(String[] args) {
	
			ArrayList al=new ArrayList();
			//+ArrayList<String> al=new ArrayList<String>();
			
			Values v1=new Values(123,"man",24);
			Values v2=new Values(124,"vam",24);
			Values v3=new Values(125,"sudh",24);
			Values v4=new Values(126,"vara",24);
			
			al.add(v1);
			al.add(v2);
			al.add(v3);
			al.add(v4);
			
			//System.out.println(al);// here instead of object hascode  printing,  it prints the toString values
			
			Iterator i=al.listIterator(); //iterates from index 0 and updates each by "next()"
			
			
			while(i.hasNext())     //checks if index is less than size of arraylist
			{
				Values vs=(Values)i.next();// we dont use casting in geneeric variables.//returns index element and increase index 
				System.out.println("rno:-"+vs.rno+"   name:-"+vs.name+"   age:-"+vs.age);
				
			}
			
			
			
			//System.out.println(al);
			
			
	}

}

class Values
{
	
	int rno;
	String name;
	int age;
	public Values(int rno,String name,int age)
	{
		this.rno=rno;
		this.name=name;
		this.age=age;
	}
//	public String toString()
//	{
//		return "rno-"+rno+"name-"+name+"age-"+age;
//	}

}