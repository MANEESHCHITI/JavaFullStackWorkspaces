package array;

public class Class2 {


char ab[]=new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
   int count;
   int	count1;																																 //String ca[]=new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","W","x","y","z"};
public void conVowel()
{
	
	System.out.println("vowels:-");
	for(char ac:ab)
	{
		if(ac=='a'||ac=='e'||ac=='i'||ac=='o'||ac=='u')
			                                                                                                                      //if(ac=="a"||ac=="e"||ac=="i"||ac=="o"||ac=="u")
		{
			System.out.println(ac);
			count++;
		}
		else
		{
			
		}
	}
	System.out.println("toatal vowels: "+count);
	System.out.println("consonents:-");
	for(char ac:ab)
	{
		if(ac=='a'||ac=='e'||ac=='i'||ac=='o'||ac=='u')
		{
		
		}
		else
		{
			System.out.println(ac);
			count1++;
		}
	}
	System.out.println("total consonents: "+count1);
}
}