package Strings;

public class BufferString {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Maneesh rao");
		
		String ss=String.valueOf(s);
		
		
		//append() The append() method concatenates the given argument with this String

//		
		
//		System.out.println(s.append("chiti"));  //both o/p is same.
//		System.out.println(s);
		
		
		//insert()  method inserts the given String with this string at the given position.
		
//	s.insert(1,"chiti");
//	System.out.println(s);
		
		
		//The replace() method replaces the given String from the specified beginIndex and endIndex.
		
//		s.replace(1, 5, "howareyou");    //from 1 to exculeding 5. string has also replace() with(replace of,replacewith)
//		System.out.println(s);
		
		
		
		//reverse()
//		s.reverse();
//		System.out.println(s);
		
		//capacity()   
		
		// if we already write string in constructor it adds  count to 16 and capacity shows sum
		//if we dont write any string and we append it it validates by default 16 and if overatates it increases to (oldcapacity*2)+2
//		System.out.println(s.capacity());
		
		
		//ensureCapacity()
		// is same as capcity() but if we want to add capacity mention in paranthesesis if it below defalut wont change if it greate it follows the princiipal of capcity (old*2)+2
		//StringBuffer n=new StringBuffer();
	//	n.ensureCapacity(10);
		//n.ensureCapacity(32);
	//	n.ensureCapacity(35);  //if chance principal below it shows principal value if you do twice of principle it shows we mentioned value
		//System.out.println(n.capacity());
		
				
		

	}

}
