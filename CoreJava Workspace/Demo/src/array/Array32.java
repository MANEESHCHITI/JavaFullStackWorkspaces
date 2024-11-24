package array;

public class Array32 {

	public static void main(String[] args) {
		Numbers obj=new Numbers();
		obj.palindrome();

	}
}
	
class Numbers
{
	int a[]=new int[] {212,565,256,919};
	
	public void palindrome()
	{
		
		
	for(int i=0;i<a.length;i++)
	{	int b=a[i];
		int lastdigit;
		int reverse=0;
		while(b>0)
		{                                             // case study 4q print palindromes in an array.
			lastdigit=b%10;
			reverse=reverse*10+lastdigit;
			b=b/10;
		}
		
		if(a[i]==reverse)
		{
			System.out.println("palindrome:-"+a[i]);
		}
	
	}
	
	
	}
}

