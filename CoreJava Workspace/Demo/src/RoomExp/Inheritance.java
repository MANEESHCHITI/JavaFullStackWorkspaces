package RoomExp;

public class Inheritance {

	public static void main(String[] args) {
	B obj=new B();
	obj.i=1;
	obj.j=2;
	obj.display();

	}

}
class Aaa
{
	
int i;
}
class B extends Aaa
{
	int j;
	void display()
	{
		super.i=j+1;
		System.out.println(i);
		System.out.println(j+" "+i);
	}

}

