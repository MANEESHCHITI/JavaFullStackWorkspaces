package array;

public class While1 {

	public static void main(String[] args) {
		Ab obj=new Ab();
		obj.disp();

	}

}
class Ab
{
	public void disp()
	{
		int a[]=new int[] {10,20,30} ;
		int i=a.length-1;
		while(i<a.length){
			System.out.println(a[i]);
			if(i==0)
				break;
			i--;
			
		}
	}
}
