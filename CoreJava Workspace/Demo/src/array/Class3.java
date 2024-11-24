package array;

public class Class3
{
	char ab[]=new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	int count;
	public void count()
	{
		for(char ac:ab)
		{
			count++;
		}
		System.out.println("length of array: "+count);
	}
}

