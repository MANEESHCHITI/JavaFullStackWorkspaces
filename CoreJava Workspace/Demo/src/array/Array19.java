package array;

public class Array19 {

	public static void main(String[] args) {
		Aj obj=new Aj();
		obj.disp();

	}

}                                                            //     count even , odd in array
class Aj
{int a[]=new int[] {1,2,3,4,5,9};
	int count;
	int incr;

public void disp()
{
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			count++;
		}
		else if(a[i]%2!=0)
		{
			incr++;
		}
	}
	
	System.out.println("even"+count);
	System.out.println("odd"+incr);
	}
}
