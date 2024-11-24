package PackInherit1;

public class In4 {

	public static void main(String[] args) {

		Dog obj=new Dog();

		Animal obj1=new Animal();

		Animal obj2=null;

		System.out.println(obj instanceof Animal);                  //true
		System.out.println(obj instanceof Dog);

		System.out.println(obj1 instanceof Dog); //false
		if(obj1 instanceof Animal)
		{
			System.out.println("condition with instance");
		}

		System.out.println(obj2 instanceof Animal);                  //true
		System.out.println(obj2 instanceof Dog);
	}

}
class Animal
{


}
class Dog extends Animal
{



}
