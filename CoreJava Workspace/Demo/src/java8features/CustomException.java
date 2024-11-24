package java8features;

public class CustomException {

	public static void main(String[] args) //throws CustomException1
	{
		int a=10;
		int b=0;
		int c=0;
		if(a<10) {
			System.out.println("correct");
		}
			
		else {
			throw new CustomException1("arey you shodnt send b as 0");                  // if we want to print message other clas must hava constructore with super
			//System.out.println("hlo");      unreachable code
			
			
		//if you have any number of statements keep throw statement last to overcome unreachable 
													
		}
		
	

	}

}
