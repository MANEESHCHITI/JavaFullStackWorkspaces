package Collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class pr13 {

	public static void main(String[] args) {
	Stack<Integer> v=new Stack<>();

	

	v.push(1);
	v.push(2);
	v.push(3);         
	v.push(4);
	

	
	ListIterator<Integer> i=v.listIterator(v.size());
	while(i.hasPrevious())             // here has previous checks if i value is not equal to 
	{
		System.out.println(i.previous());
	}
	
//	System.out.println(v);
//	System.out.println(v.lastIndexOf(4));     returns element which is    parameter but if not mention parameter it returns -1 
//	System.out.println(v.lastElement());
//	System.out.println(v.peek());            // which returns last element ,we c cant keep value as parameter.
	
	}
	

}
//import java.util.Stack;
//import java.util.ListIterator;
//
//public class StackListIteratorExample {
//    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//        ListIterator<Integer> listIterator = stack.listIterator(stack.size());
//        while (listIterator.hasPrevious()) {
//            System.out.println(listIterator.previous());
//        }
//    }
//}

 