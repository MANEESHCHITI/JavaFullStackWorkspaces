package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employe {

	public static void main(String[] args) {
		Employe1 e1=new Employe1(1, "A", 5000);
		Employe1 e2=new Employe1(1, "A", 2000);
		Employe1 e3=new Employe1(1, "A", 9000);
		
		List<Employe1> ee=new ArrayList<>();
		
		ee.add(e1);
		ee.add(e2);
		ee.add(e3);

		Comparator<Employe1> c=new Comparator<>() {

			@Override
			public int compare(Employe1 o1, Employe1 o2) {
				
				if(o1.getSalary()<o2.getSalary()) {
					return -1;
				}
				else if(o1.getSalary()>o2.getSalary()) {
					return 1;
				}
				else {
					return 0;
				}
				
			}

		};
		Collections.sort(ee,c);
		System.out.println(ee);
	}

}

class Employe1{
	
	private int id;
	private String name;
	private int salary;
	
	public Employe1(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employe1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	
}
