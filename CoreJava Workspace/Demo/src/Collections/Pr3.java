package Collections;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Pr3 {

	public static void main(String[] args) {

		LinkedList <Integer>ll=new LinkedList<Integer>();
		ll.add(3);
		ll.add(4);
		ll.add(1);
		ll.add(2);
		
		System.out.println(ll);
		ll.sort(Collections.reverseOrder());
		
		
		Collections.sort(ll);
		
		




		//for loop
		//		for(int i=0;i<ll.size();i++)
		//		{
		//			System.out.println(ll.get(i));
		//		}
		//		
		//		System.out.println();

		//while loop         //entry control

		int i=0;    
		//		while(i<ll.size())
		//		{
		//			System.out.println(ll.get(i));
		//			i++;
		//		}

		//do while      //exit control
		//						do
		//						{
		//							System.out.println(ll.get(i)); 
		//							i++;									//doubt
		//						}
		//						while(i<ll.size());



		//enhanced for loop
		//		
		//		for(Integer a:ll)
		//		{
		//			System.out.println(a);
		//		}


		//forEach

		//					ll.forEach((value)->                        //value is just for use
		//					System.out.println(value) );     // doubt


		//iterator
//						Iterator ir=ll.iterator();
//						
//						while(ir.hasNext())
//						{
//							System.out.println(ir.next());
//						}
						
		//  listiterator
					
//						Iterator irr=ll.listIterator(); 
//						while(irr.hasNext()) 
//						{ 
//							System.out.println(irr.next()); 
//							
//						}
							
						
						

			//poll
						while(!ll.isEmpty())
						{                                      //remove every element till empty
							System.out.println(ll.poll());
						}





	}

	}

