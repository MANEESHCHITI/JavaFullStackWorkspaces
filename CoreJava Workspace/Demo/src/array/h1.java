package array;

public class h1 {

	public static void main(String[] args) {
		B obj=new B();
		obj.disp();

	}

}
class B{
	
	public void disp()
	{
	 int arr[][]=new int[][] {{32,48,76,42},{24,23,29,98},{18,47,23,22},{62,74,44,54}};
		 			
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				if((arr[i][j])%2==0) {
					System.out.print("0"+"");
				}
				else {
					System.out.print("1"+"");
				}
			}
			System.out.println();
		}
	 
				
	}
}

//even numbers 0 and ot
