package RoomExp;

public class CopyConstructor {

	public static void main(String[] args) {
	
		Student obj=new Student(1,"Maneesh");
		
		Student obj1=new Student(obj);
		
		System.out.println(obj1.roll);

	}                                            // copy constructor by sending object 

}
class Student
{
	int roll;
	String name;
	Student(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
	Student(Student object)
	{
		this.roll=object.roll;
	}
	
	
	
}
