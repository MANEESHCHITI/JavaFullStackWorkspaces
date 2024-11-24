package array;

public class ClassProblemm {

	public static void main(String[] args) {
		
Number obj=new Number();
obj.disp();
	}

}
class Number
{	int a[]=new int[] {8,14,2,21,39,22,74,65,92,27};
int count;
	public void disp()
	{
		for(int b:a)                                              //printing how many 2's in given array.
		{
			if(b%10==3)
				count++;
			if(b/10==3)
				count++;
		}
		System.out.println(count);
	
	}
	
}
				
				
		
		
		
	
	
