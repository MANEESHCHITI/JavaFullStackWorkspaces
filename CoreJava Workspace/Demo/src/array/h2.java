package array;

public class h2 {

	public static void main(String[] args) {
		Exm1 obj=new Exm1();
		obj.disp();

	}

}
class Exm1{
	public void disp()
	{
		char a[]=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		 char b[]=new char[] {'a','e','i','o','u'};
		 char d[]=new char[7];
		 String  c="welcome";
		 for(int i=0;i<7;i++)
		 {
			 d[i]=c.charAt(i);
		 }
		 for(int j=0;j<7;j++)
		 {
			 int p=0;
			 for(int k=0;k<5;k++)
			 {
			 p++;
				 if(d[j]==b[k]) {
					 p++;
					 
					 for(int L=0;L<26;L++)
					 {
						 if(d[j]==a[L]) {
							 System.out.println(a[L+1]);
						 }
					 }
				 }
				
					
				
			 }
		 }
		 
		 
	}
}

