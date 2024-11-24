package array;

class Array1 {

	public static void main(String[] args) {
		A obj=new A();
		obj.arrayInput();
		
		

	}

}
class A
{
	int a[]=new int [] {12,3,5,60};
	int count;
	int sum;
	
	public void arrayInput()
	{
		
		for(int i=0;i<a.length;i++)
		{
			                                   //  print array,count,sum,sum-count
			System.out.println(a[i]);
			count++;
			sum=sum+a[i];
			if(i==4)
				break;
		
			
		}
		
		
		System.out.println("count:"+count);
		System.out.println("sum:"+sum);
		System.out.println("sum-count"+" "+(sum-count));
		
		
	}
	

	
	
	
}
