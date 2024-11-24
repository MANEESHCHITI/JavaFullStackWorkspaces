 package caseStudys;

import java.util.Scanner;

class A10
{int lastDigit,reverse=0,reversee=0,a,b,sum,reverseee=0,n3,c;
public void show()
{
	Scanner s=new Scanner(System.in);
	int e=s.nextInt();
	int f=s.nextInt();                     // sum of palindromees is palindromes or not if any invalid palindrome asking again 9)

	disp(e,f);

	
	}
 public void disp(int n,int n1)
 {   a=n;
     b=n1;
    
 while(n>0)
 {
	 lastDigit=n%10;
	 reverse=reverse*10+lastDigit;
	 n=n/10;
 }
 if(a==reverse)
 {
	 while(n1>0)
	 {
		 lastDigit=n1%10;
		 reversee=reversee*10+lastDigit;
		 n1=n1/10;
	 }
	 if(b==reversee)
	 {
		 sum=reverse+reversee;
	 }
	 else
	 {
		 System.out.println("entered incorrect palindrome");
		 show();
	 }
 }
 else
 {
	 System.out.println("entered incorrect palindromee");
	 show();
 }
 c=sum;
 while(sum>0)
 {
	lastDigit=sum%10;
	reverseee=reverseee*10+lastDigit;
	sum=sum/10;
 }
 if(c==reverseee)
 {
	 System.out.println("sum of palindrome is palindrome");
	 
 }
 else
 {
	 System.out.println("sum of palindrome is not palindrome");
 }
 }
 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
public class SumOfPalindromes {
	
	public static void main(String[] args) {
		
A10 obj=new A10();


obj.show();
	}

}
