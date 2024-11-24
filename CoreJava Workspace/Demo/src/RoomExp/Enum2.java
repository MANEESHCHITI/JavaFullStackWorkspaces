package RoomExp;

public class Enum2 {
  enum Day
  {
	  MONDAY,
	  TUESDAY,
	  WEDNESDAY,
	  THURSDAY,
	  FRIDAY,
	  SATURDAY,                            //displaying week days and weekdend by for loop
	  SUNDAY
  }
	public static void main(String[] args) {
		
		for(Day d:Day.values()) 
		{
			System.out.print(d+"-");
			switch(d)
			{
			case MONDAY:
			
			case TUESDAY:
			
			case WEDNESDAY:
				
			
			case THURSDAY:                    
				
			
			case FRIDAY:
				
			System.out.println("weekday");
			break;
			case SATURDAY:
				System.out.print("weekend");
				break;
			
			
			case SUNDAY:
				System.out.print("weekend");
				break;
			}
			System.out.println();
		}

	}

}
