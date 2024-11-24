package array;

public class Array33 {

	public static void main(String[] args) {
	oddEven obj=new oddEven();
	obj.sumProduct();

	}

}
class oddEven
{	int sum;
	int product=1;
	int a[]=new int[] {1,2,3,4,5,6,7,8};
	public void sumProduct()
	{
		for(int i=0;i<a.length;i=i+2)
		{                                         // 5Q even index sum,odd index product
			sum=sum+a[i];
		}
		for(int i=1;i<a.length;i=i+2)
		{
			product=product*a[i];
		}
		System.out.println("even index:"+sum);
		System.out.println("odd index:"+product);
	}
	}
