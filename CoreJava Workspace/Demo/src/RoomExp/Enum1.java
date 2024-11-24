package RoomExp;

class Fixed
{
	enum Day
	{
		MONDAY,
		TUESDAY,
		wednesday,
		thursday
	}
	

	public void disp()
	{
		for(Day d:Day.values())      //values is a method to call the constants in enum
		{
			System.out.println(d);
		}
	}
}                                     //display all values in Day by for.
	
	
public class Enum1 {

	public static void main(String[] args) {
		
	Fixed obj=new Fixed();
	obj.disp();

	}
}


