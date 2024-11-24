package RoomExp;



public class snake {

	public static void main(String[] args) {
		Baa obj=new Baa();
		obj.disp();
	}

}
class Baa{
	
	int l=1;
	int m=1;
	public void disp() {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				
				if(i%2==0)
				{
					
					System.out.print(m+" ");
					m--;
					if(j==5)
					{
						m=m+6;
					}
				}
			
				else if(i==1){
					System.out.print(m+" ");
					m++;
					if(j==5)
					{
						m=m+4;
					}
					
				}
				else {
				
					System.out.print(m+" "); 
					m++;
					if(j==5)
					{
						m=m+4;
					}
				}
			}
			System.out.println();
			Scanner sc=new Scanner(System.in)
		}
	}
}
