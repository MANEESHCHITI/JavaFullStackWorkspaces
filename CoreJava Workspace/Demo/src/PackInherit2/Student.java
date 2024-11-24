package PackInherit2;

interface Student {

	
	public default int noOfStudents()
	{
		return 5;
	}
	public default float avgMarks()
	{
		return 55.5f;
	}
}
