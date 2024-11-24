package caseStudys;



public class ReverseOFInteger3 {
	
	public static void main(String[] args) {
		int num=562,reverse=0,lastDigit,count=0;
		while(num>0){
			lastDigit=num%10;
			reverse=reverse*10+lastDigit;
			num=num/10;
			count++;                     //write a program to display reverse of integer if it has 3digits only 8)
		}
		if(count==3)
		{
		System.out.println(reverse);
		}
		}
	
		

		
		

	}


