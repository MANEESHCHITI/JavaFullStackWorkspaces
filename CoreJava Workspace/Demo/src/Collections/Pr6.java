package Collections;

import java.util.ArrayList;

public class Pr6 {

	public static void main(String[] args) {
	
		ArrayList al1=new ArrayList();
		ArrayList al2=new ArrayList();
		

		
		
		al1.add("a");
		al1.add("b");
		al1.add("c");
		al1.add("d");
		al1.add("e");
		
		al2.add("a");
	
		
	al2.add("e");
		
		
//		String []array1=(String[])al1.toArray(new String[5]); //if we don't mention generic we use conversion.
//		
//		for(String v:array1)
//		{
//			System.out.println(v);
//		}
//		System.out.println(array1.length);
//		

//				al1.add(1);		
//				al1.add(2);		
//				al1.add(3);		
//				al1.add("a");
//				
//				
//				Integer a[]=(Integer [])al1.toArray(new Integer[0]); // use  conversion if we dont mention generic.
//				
//				for(int b:a)
//				{
//					System.out.println(b);
//				}
	//System.out.println(al1.retainAll(al2));
	System.out.println(al1);

//	System.out.println(al1.subList(1, 4));
	al1.add(0,"z");
			
	System.out.println(al1);
	
		
		
		
	}

}
