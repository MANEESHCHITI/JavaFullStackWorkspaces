package Strings;

public class Pr1 {

	public static void main(String[] args) {
		String a=" Maneesh Rao ";
		String b="Rao ";
		String d="";
		
		
												//**toUpperCase and toLowerCase
		
//		System.out.println(a.toUpperCase());
//		System.out.println(a.toLowerCase());
		
		//trim()  string doesnt contain left,rightTrim() but we can do by replaceAll
		
		
//		System.out.println(a.trim());
		
									//**startsWith(),endsWith()
		                     
//		System.out.println(a.startsWith(" Ma"));
//		System.out.println(a.endsWith("Rao "));
//		System.out.println(a.endsWith(b));
			
							//**charAt() retures character at a mentined index
		
	//	System.out.println(a.charAt(1));
//		for(int i=a.length()-1;i>=0;i--)
//		{
//			//char c= a.toLowerCase().charAt(i);
//			char c=a.charAt(i);
//			d=d+c;
//		}
//		System.out.println(d);
		
						//**length()  returns length .in array we use length but whereas in String we use length() method
			
//		System.out.println(a.length());
		
						//intern() it is used in new if the same object is present in the pool it refers otherwise it creates
						//actually it refers to pool object
		
//		String e=new String("hello").intern();
//		
//		String e1=e;
//		if(e1==e)
//		{
//			System.out.println("same");
//		}
//		else
//		{
//			System.out.println("not same");
//		}
		
								//valueOf() it is used to convert datatypes to String
		
//		int aa=10;
//		String bb=String.valueOf(aa);         we can do by values() or concat empty string with int
//		System.out.println(aa+bb);            we cant do direct cast from int to string because of different data types
		
//		int aa=10;
//		//Float bb=Float.valueOf(aa);  
		
//		Float bb=(float) aa;
//		System.out.println(aa+bb);       
		
							// replace( replace of,replace with) it is used to replace all 
		
//		System.out.println(a.replace(" ","i"));
//		System.out.println(a.replace("e","i"));
		
	}

}
