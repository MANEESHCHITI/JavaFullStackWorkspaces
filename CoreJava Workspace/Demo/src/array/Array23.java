package array;

public class Array23 {

	public static void main(String[] args) {

ArrayOfObject obj[][]=new ArrayOfObject[2][2];

obj[0][0]=new ArrayOfObject(12,"maneesh");
//int obj[0]=new int[5];
obj[0][1]=new ArrayOfObject(13,"rao");
//obj[0].disp();
//obj[1].disp();

obj[0][0].disp();

		
	}

}
class ArrayOfObject
{                                          //array of objects(declaring how many objects and accessing it by array)
	int roll;
	String name;
	public ArrayOfObject(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
	public void disp()
	{
		System.out.println(roll+" "+name);
	}
	}
