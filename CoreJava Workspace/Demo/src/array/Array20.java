package array;

public class Array20 {

	public static void main(String[] args) {
		
		Reversee obj=new Reversee();
		obj.disp();
	}
}
class Reversee
{
	int a[]=new int[] {1,2,3,4,5};
	int temp;
	public void disp()
	{
		for(int i=a.length-1;0<=i;i--)
		//	for(i=0;i<a.length/2;i++)
		{
			//a[i] =a[i]+a[a.length-i-1]-((a[a.length-i-1])=a[i]);
			//temp=a[i];                                                           //   case 2Q reverse of an array by two types  one is direct loop decrease and other is reverse the array
			//a[i]=a[a.length-i-1];
			//a[a.length-i-1]=temp;
			System.out.println(a[i]);
		}
	
		//for(int a1:a)
	//{
		//System.out.println(a1);
	//}
	

}
}

