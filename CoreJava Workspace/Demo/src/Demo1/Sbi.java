package Demo1;





public class Sbi{
	public static void main(String args[]) {
		
		int a=5;
		for(int i=1;i<=10;i++) {
			if(i%3==0) {
				System.out.println(a+"*"+i+"="+"T");
			}
			else {
				System.out.println(a+"*"+i+"="+a*i);
			}
		}
	}
}
