package array;

class Student
{
   
    public String name;
    Student(String name)
    {
        this.name = name;
    }
      @Override
    public String toString(){
        return name;
    }
}
  
// Elements of the array are objects of a class Student.
public class Array22
{
    public static void main (String[] args)
    {
           // declares an Array and initializing  the elements of the array
        Student[] myStudents = new Student[]{("Dharma"),("sanvi"),("Rupa"),("Ajay")};
  
        // accessing the elements of the specified array
        for(Student m:myStudents){    
            System.out.println(m);
        }
    }
}
