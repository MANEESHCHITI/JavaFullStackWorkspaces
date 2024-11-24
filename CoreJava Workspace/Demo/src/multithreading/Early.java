package multithreading;

class Student
{
   private static final Student s=new Student();     //lazy we cant use final 
   
private Student()
{
	}
public static Student disp()
{
	return s;
	                                   //early binding
	}


}


public class Early {

	public static void main(String[] args) {
	
		 Student s1=Student.disp();

	}

}


