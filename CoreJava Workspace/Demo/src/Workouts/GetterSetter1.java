package Workouts;
class A
{
int mul;

public int getSum() {
	return mul;
}

public void setSum() {
	for(int i=1;i<4;i++)
	{int mul=1;
		for(int j=1;j<=i;j++)
		{ 
			mul=mul*j;
		}
		this.mul=mul;
}

}
}


public class GetterSetter1 {

	public static void main(String[] args) {
	A obj=new A();
	obj.setSum();
	int a=obj.getSum();
	
	System.out.println(a);
	}
}




	


