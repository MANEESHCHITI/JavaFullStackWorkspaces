package Collections;

import java.util.ArrayList;

public class CustomPr5 extends ArrayList {
	
	public String toString()
	{
			StringBuffer sb=new StringBuffer();
			sb.append("[");
			
			for(int i=0;i<size();i++)                    //size is predefiened method in ararylist
			{
				sb.append(get(i));      //           get is of the arraylist method which returns value to append 
				if(i<size()-1)          //    as appending many values which means only one value but it is concatinating 
				{
					sb.append(",");
				}
				
			}
		 sb.append("]");                          //curly braces is for timepass knowing
		 
		 return sb.toString();
			
		
	}

	
	
	public static void main(String[] args) {
	CustomPr5 al=new CustomPr5();
	al.add(1);
	al.add(2);
	al.add(3);
	System.out.println(al);

	}

}
