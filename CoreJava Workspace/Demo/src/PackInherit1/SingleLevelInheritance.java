package PackInherit1;

public class SingleLevelInheritance {

	public static void main(String[] args) {

Bb obj=new Bb();
obj.disp1();
	}

}
class Aa
{
	public void disp1()
	{                                           //  General single level inheritance overriding
	System.out.println("parent");
	}
}
class Bb extends Aa
{
public void disp1()
{
	System.out.println("child");
	}
}
