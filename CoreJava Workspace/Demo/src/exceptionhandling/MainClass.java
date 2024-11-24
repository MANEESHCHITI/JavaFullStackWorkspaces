package exceptionhandling;

import java.util.Scanner;



class LectureLogin {
	
	
	StudentData obj1=new StudentData();
	StudentLogin obj2=new  StudentLogin();
	
	
	static Scanner s=new Scanner(System.in);
	static String username="maneesh";
	static 	String password="rao";
	static String username1;
	static String password1;
	
	/*static int username=123;
	static int password=456;
	static int username1;
	static int password1;*/
	
	static int a;
	
	
	public static void select1()
	{	System.out.println(StudentData.backMagenta+"								 TELANGANA BOARD OF SECONDARY EDUCATION 																							"+StudentData.resetAll);
		System.out.println();
		System.out.println(StudentData.textGreen+"									1)DEPARTMENT LOGIN"+StudentData.resetAll);
		System.out.println();
		System.out.println(StudentData.textGreen+"									2) RESULT "+StudentData.resetAll);
		System.out.println();
		System.out.println(StudentData.backGreen+"									Select 1 or 2																														"+StudentData.resetAll);
		System.out.println();
		
		 reEntry();
	}
	public static void reEntry()
	{
		System.out.print(StudentData.textGreen+"Enter:-"+StudentData.resetAll);
		 a=s.nextInt();
		 System.out.println();
		 choose();
	}
	public static void choose()
	{
		if(a==1)
		{
		login();
		}
		else if(a==2)
		{
		StudentLogin.studEntry();
		}
		else
		{
			System.out.println(StudentData.textRed+"INVALID"+StudentData.resetAll);
			reEntry();
		}
		
	}
	public static void login()
	{
		System.out.println(StudentData.backMagenta+"									 LECTURER LOGIN																																										"+StudentData.resetAll);
		
		System.out.println();
		loginPage();
	}
	public static void loginPage()
	{
		
		System.out.print(StudentData.textGreen+"USERNAME:-"+StudentData.resetAll);
		 username1=s.next();
		//username1=s.nextInt();
		 System.out.println();
		System.out.print(StudentData.textGreen+"PASSWORD:-"+StudentData.resetAll);
	password1=s.next();
		//password1=s.nextInt();
		System.out.println();
		
		if(username1.equals(username))
		{                                                      // string comparing means use .equals.
			
			if(password1.equals(password))
			{
				System.out.println(StudentData.backGreen+"										SUCCESSFULL LOGIN   																																																                                                                                                                                "+StudentData.resetAll);
				System.out.println();
				StudentData.std();
			}
			else
			{
				
			error();
			}
		}
		else
		{
			
		error();
		}
	}
	public static void error()
	{
		System.out.println(StudentData.textRed+"INVALID CREDENTIALS"+StudentData.resetAll);
		loginPage();
		
	}
}


public class MainClass {

	public static void main(String[] args) {
		//StudentData obj1=new StudentData();
		//Bin obj3=new Bin();
		LectureLogin obj4=new LectureLogin();
	//	StudentLogin obj2=new  StudentLogin();
		obj4.select1();
		//obj1.std();
		//obj1.passFail();
		
		
		//obj2.studEntry();
		

	}

}




class StudentData 
{
	//LectureLogin obj4=new LectureLogin();
	
	    static   String textBlack="\u001B[30m";
	      
	    static  String textRed= "\u001B[31m";
	      
	    static   String textGreen="\u001B[32m";
	        
	    static   String textYellow="\u001B[33m";
	       
	    static  String textBlue="\u001B[34m";
	       
	    static String textMagenta="\u001B[35m";
	       
	    static String textCyan = "\u001B[36m";
	       
	    static String textWhite= "\u001B[37m";
	        
	    static String backBlack="\u001B[40m";
	      
	    static  String backRed= "\u001B[41m";
	       
	    static  String backGreen= "\u001B[42m";
	       
	    static  String backYellow= "\u001B[43m";
	       
	    static   String backBlue=  "\u001B[44m";
	     
	    static   String backMagenta= "\u001B[45m";
	       
	    static  String backCyan=  "\u001B[46m";
	       
	    static  String backWhite="\u001B[47m";
	       
	    static  String resetAll="\u001B[0m";
	     
	   static Scanner s=new Scanner(System.in);
	    
	     
	     
	 static    String subjects[]=new String[] {"Telugu","Hindi","English","Maths","Science","Social"};
	 
	 static    String studen1[]=new String[6];
	 static    String studen2[]=new String[6];
	 static    String studen3[]=new String[6];    // PASS OR FAIL
	 static    String studen4[]=new String[6];
	                                                       // the difference btwn bothe is student -studen========t missing.
	   static int student1[]=new int[6];
	   static int student2[]=new int[6];
	   static int student3[]=new int[6];            // MARKS
	   static int student4[]=new int[6];
	   
	   
	     static String grade1[]=new String[6];
	     static String grade2[]=new String[6];             //grades
	     static String grade3[]=new String[6];
	     static String grade4[]=new String[6];
	     
	     
	     static String overallGrade[]=new String[4];
	     
	     static int  sumAll[]=new int [4];
	                 
	     
	    static int count=1;
	    static int studNumber1=1;
	    static int i=0;
	    static int a=0;
	   static  int sum1;
	    static int sum2;
	    static int sum3;
	    static int sum4;
	    
	  
	
	public static void std()
	{  
		i=0;
		if(studNumber1==1)
		{
			
		System.out.println( backMagenta+"										1738616811												"+resetAll);
			studNumber1++;
			telugu();
		}
		else if(studNumber1==2)
		{
			System.out.println(backMagenta+"										1738616812															"+resetAll);
			studNumber1++;
			telugu();
		}
		else if(studNumber1==3)
		{
			System.out.println(backMagenta+"										1738616813																				"+resetAll);
			studNumber1++;
			telugu();
		}
		else if(studNumber1==4)
		{
			System.out.println(backMagenta+"										1738616814																"+resetAll);
			studNumber1=1;
			telugu();
		}
	}
	public static void error()
	{
		System.out.println(textRed+"Invalid "+resetAll);
		
	}
	public static void grade1()
	{ //System.out.println(a);
		if(a>=35 && a<50)
		{
			grade1[i]="C";
		}
		else if(a>=50 && a<75)
		{
			grade1[i]="B";
		}
		else if(a>=75 && a<90)
		{
			grade1[i]="A";
		}
		else if(a>=90)
		{
			grade1[i]="A+";
		}
		else 
		{
			grade1[i]="F";
		}
	}
	public static void grade2()
	{
		if(a>=35 && a<50)
		{
			grade2[i]="C";
		}
		else if(a>=50 && a<75)
		{
			grade2[i]="B";
		}
		else if(a>=75 && a<90)
		{
			grade2[i]="A";
		}
		else if(a>=90)
		{
			grade2[i]="A+";
		}
		else 
		{
			grade2[i]="F";
		}
	}
	public static void grade3()
	{
		if(a>=35 && a<50)
		{
			grade3[i]="C";
		}
		else if(a>=50 && a<75)
		{
			grade3[i]="B";
		}
		else if(a>=75 && a<90)
		{
			grade3[i]="A";
		}
		else if(a>=90)
		{
			grade3[i]="A+";
		}
		else 
		{
			grade3[i]="F";
		}
	}
	public static  void grade4()
	{
		if(a>=35 && a<50)
		{
			grade4[i]="C";
		}
		else if(a>=50 && a<75)
		{
			grade4[i]="B";
		}
		else if(a>=75 && a<90)
		{
			grade4[i]="A";
		}
		else if(a>=90)
		{
			grade4[i]="A+";
		}
		else 
		{
			grade4[i]="F";
		}
	}
	
	public static void telugu()
	{
		System.out.print(textGreen+"Enter Telugu Marks:- "+resetAll);
		
		a=s.nextInt();
		
		System.out.println();
			if(a>=0 && a<=100)
			{
				if(count==1)
				{
					
					student1[0]=a;
				
					grade1();
					i++;
					hindi();
				}
				else if(count==2)
				{
					
					
					
					student2[0]=a;
				
					grade2();
					
					i++;
					hindi();
				}
				else if(count==3)
				{
					student3[0]=a;
					
					grade3();
					i++;
					hindi();
				}
				else if(count==4)
				{
					student4[0]=a;
				
					grade4();
					i++;
					hindi();
				}
				
			
			}
			else
			{
				error();
				telugu();
			}
	
	}
	public static  void hindi()
	{
		System.out.print(textGreen+"Enter Hindi Marks:- "+resetAll);
		a=s.nextInt();
		System.out.println();
		if(a>=0 && a<=100)
		{
			if(count==1)
			{
				student1[1]=a;
				
				grade1();
				i++;
				english();
			}
			else if(count==2)
			{
				student2[1]=a;
				
				grade2();
				i++;
				english();
			}
			else if(count==3)
			{
				student3[1]=a;
			
				grade3();
				i++;
				english();
			}
			else if(count==4)
			{
				student4[1]=a;
			
				grade4();
				i++;
				english();
			}
		}
		else
		{
			error();
			hindi();
		}
	
	}

	public static void english()
	{
		System.out.print(textGreen+"Enter English Marks:- "+resetAll);
		a=s.nextInt();
		System.out.println();
		if(a>=0 && a<=100)
		{	
				if(count==1)
				{
					student1[2]=a;
				
					grade1();
					i++;
					maths();
				}
				else if(count==2)
				{
					student2[2]=a;
					
					grade2();
					i++;
					maths();
				}
				else if(count==3)
				{
					student3[2]=a;
				
					grade3();
					i++;
					maths();
				}
				else if(count==4)
				{
					student4[2]=a;
				
					grade4();
					i++;
					maths();
				}
				
		}                                                                         //
		else
		{
			error();
			english();
			
		}

	}
	public static void maths()
	{
		System.out.print(textGreen+"Enter Maths Marks:- "+resetAll);
		a=s.nextInt();
		System.out.println();
		if(a>=0 && a<=100)
		{
			if(count==1)
			{
				student1[3]=a;
			
				grade1();
				i++;
				science();
			}
			else if(count==2)
			{
				student2[3]=a;
			
				grade2();
				i++;
				science();
			}
			else if(count==3)
			{
				student3[3]=a;
		
				grade3();
				i++;
				science();
			}
			else if(count==4)
			{
				student4[3]=a;
		
				grade4();
				i++;
				science();
			}
			
		}
		else
		{
			error();
			maths();
			
		}

	}
	public static void science()
	{
		System.out.print(textGreen+"Enter Science Marks:- "+resetAll);
		a=s.nextInt();
		System.out.println();
		if(a>=0 && a<=100)
		{
			if(count==1)
			{
				student1[4]=a;
			
				grade1();
				i++;
				social();
			}
			else if(count==2)
			{
				student2[4]=a;
			
				grade2();
				i++;
				social();
			}
			else if(count==3)
			{
				student3[4]=a;
				
				grade3();
				i++;
				social();
			}
			else if(count==4)
			{
				student4[4]=a;
			
				grade4();
				i++;
				social();
			}
		}
			
		
		else
		{
			error();
			science();
			
		}
	
	}
	public static void social()
	{
		System.out.print(textGreen+"Enter Social Marks:- "+resetAll);
		a=s.nextInt();
		
		System.out.println();
		if(a>=0 && a<=100)
		{
			if(count==1)
			{
				student1[5]=a;
				
				grade1();
				totalMarks();
				std();
			
			}
			else if(count==2)
			{
				student2[5]=a;
			
				grade2();
			totalMarks();
				std();
				
			}
			else if(count==3)
			{
				student3[5]=a;
			
				grade3();
				totalMarks();
				std();
				
			}
			else if(count==4)
			{
				student4[5]=a;
			
				grade4();
				totalMarks();
				
				
			}
			
		}
		else
		{
			error();
			social();
		}
	
		
		
	}
	public static void totalMarks()
	{
		if(count==1)
		{
			for(int a:student1)
			{
				sum1=sum1+a;
				
			}
				sumAll[count-1]=sum1;
			count++;
	
			
		}
		
		else if(count==2)
		{
			for(int a:student2)
			{
				sum2=sum2+a;
				
			}
			sumAll[count-1]=sum2;                  				            //we can write this line in the replacement sum variable directly.
			count++;
		
		}
		
		else if(count==3)
		{
			for(int a:student3)
			{
				sum3=sum3+a;
				
			}
			sumAll[count-1]=sum3;
			count++;
		
		}
		
		else if(count==4)
		{
			for(int a:student4)
			{
				sum4=sum4+a;
			
				
			}
			sumAll[count-1]=sum4;
			count=1;
			passFail();
		
		}
		
		
	
	
	
	}
	public static void passFail()
	{
		for(String b:grade1)
		{
			if(b=="F")
			{
				overallGrade[0]="FAIL";
				break;
			}
			else
			{
				overallGrade[0]="PASS";
			}
		}
		for(String b:grade2)
		{
			if(b=="F")
			{
				overallGrade[1]="FAIL";
				break;
			}
			else
			{
				overallGrade[1]="PASS";
			}
		}
		for(String b:grade3)
		{
			if(b=="F")
			{
				overallGrade[2]="FAIL";
				break;
			}
			else
			{
				overallGrade[2]="PASS";
			}
		}
		for(String b:grade4)
		{
			if(b=="F")
			{
				overallGrade[3]="FAIL";
				break;
			}
			else
			{
				overallGrade[3]="PASS";
			}
		}
		LectureLogin.select1();
	}

}







class StudentLogin {

	
	
	
	static Scanner ss=new Scanner(System.in);
	public static  void studEntry()
	{
		
		System.out.print(StudentData.textCyan+"					Enter hallticket Number:-"+StudentData.resetAll);
		int anyStud=ss.nextInt();
		System.out.println();
		
		if(1738616811==anyStud)  
			
		{
			
		
			System.out.println(StudentData.textCyan+"						NAME:-"+StudentData.resetAll+"CHITI MANEESH");
			
			System.out.println();
			
			System.out.println(StudentData.backCyan+"						Subjects		"+"Marks		"+ "Grade																			"+StudentData.resetAll);
			System.out.println();
			for(int i=0;i<StudentData.student1.length;i++)
			{
				System.out.println("					"+StudentData.subjects[i]+"			  "+StudentData.student1[i]+"		 "+StudentData.grade1[i]);
				System.out.println();
			}
			System.out.println();
			System.out.println(StudentData.textGreen+"							TOTAL MARKS:-"+StudentData.resetAll+StudentData.sum1);
			System.out.println();
			System.out.println(StudentData.textGreen+"                            				OVERALL GRADE:-"+StudentData.resetAll+StudentData.overallGrade[0]);
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		//	studEntry();
			LectureLogin.select1();
			
		}
		else if(1738616812==anyStud)
		{
		//	System.out.println("1911120402");
			//System.out.println();
			
			System.out.println(StudentData.textCyan+"						NAME:-"+StudentData.resetAll+"YADAGIRI VAMSHI"+StudentData.resetAll);
			System.out.println();
		
			System.out.println(StudentData.backCyan+"						Subjects		"+"Marks		"+ "Grade																			"+StudentData.resetAll);
			System.out.println();
			for(int i=0;i<StudentData.student2.length;i++)
			{
				System.out.println("					"+StudentData.subjects[i]+"			  "+StudentData.student2[i]+"		 "+StudentData.grade2[i]);
				System.out.println();
			}
			System.out.println();
			System.out.println(StudentData.textGreen+"							TOTAL MARKS:-"+StudentData.resetAll+StudentData.sum2);
			System.out.println();
			System.out.println(StudentData.textGreen+"                            				OVERALL GRADE:-"+StudentData.resetAll+StudentData.overallGrade[1]);
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		//	studEntry();
			LectureLogin.select1();
		}
		else if(1738616813==anyStud)
		{
		
		
			System.out.println(StudentData.textCyan+"						NAME:-"+StudentData.resetAll+"BONGIR VARDHAN");
			
			System.out.println();
			System.out.println(StudentData.backCyan+"						Subjects		"+"Marks		"+ "Grade																			"+StudentData.resetAll);
			System.out.println();
			for(int i=0;i<StudentData.student3.length;i++)
			{
				System.out.println("					"+StudentData.subjects[i]+"			  "+StudentData.student3[i]+"		 "+StudentData.grade3[i]);
				System.out.println();
			}
			System.out.println();
			System.out.println(StudentData.textGreen+"							TOTAL MARKS:-"+StudentData.resetAll+StudentData.sum3);
			System.out.println();
			System.out.println(StudentData.textGreen+"                            				OVERALL GRADE:-"+StudentData.resetAll+StudentData.overallGrade[2]);
			System.out.println();
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			//studEntry();
			LectureLogin.select1();
		}
		else if(1738616814==anyStud)
		{
		
			
			System.out.println(StudentData.textCyan+"						NAME:-"+StudentData.resetAll+"GOVARDHANA KRISHNA"+StudentData.resetAll);
			System.out.println();
			
			System.out.println(StudentData.backCyan+"						Subjects		"+"Marks		"+ "Grade																			"+StudentData.resetAll);
			System.out.println();
			for(int i=0;i<StudentData.student4.length;i++)
			{
				System.out.println("					"+StudentData.subjects[i]+"			  "+StudentData.student4[i]+"		 "+StudentData.grade4[i]);
				System.out.println();
			}
			System.out.println();
			System.out.println(StudentData.textGreen+"							TOTAL MARKS:-"+StudentData.resetAll+StudentData.sum4);
			System.out.println();
			System.out.println(StudentData.textGreen+"                            				OVERALL GRADE:-"+StudentData.resetAll+StudentData.overallGrade[3]);
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			//studEntry();
			LectureLogin.select1();
			
		}
		else
		{
			System.out.println("Invalid");
			studEntry();
			
		}
		
		
	}
	
}
