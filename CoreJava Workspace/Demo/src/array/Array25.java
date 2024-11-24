package array;


class B
{
	public int method1(int b[])
	{
		int sum=0;
//	int c[]=b;
		int c[]=new int[] {};
				for(int i=0;i<b.length;i++)
				{
					c[i]=b[i];
	//	sum=sum+b[i];
					sum=sum+c[i];
			
				}
				return sum;
		
		
	}
}


class Array25 {

	public static void main(String[] args) {
	
	int a[]=new int[] {1,2,3,4,5};
	B obj=new B();
	int result=obj.method1(a);
	System.out.println(result);

	
	
	
		

	
			

	}

}

