package caseStudys;

public class SumOfDigits {

	public static void main(String[] args) {
		int n=123,sum=0,lastDigit;
		while(n>0)
		{
			lastDigit=n%10;          //sum of  integer value 5)
			sum=sum+lastDigit;
			n=n/10;
		}
		System.out.println(sum);

	}

}
