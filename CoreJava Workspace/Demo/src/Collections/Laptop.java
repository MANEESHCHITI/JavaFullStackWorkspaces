package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Laptop {

	public static void main(String[] args) {
		
	Laptop1 l1=new Laptop1(10000.00, "dell", 4);
	Laptop1 l2=new Laptop1(20000.00, "hp", 8);
	Laptop1 l3=new Laptop1(30000.00, "lenova", 8);
	Laptop1 l4=new Laptop1(40000.00, "Mac Book", 8);

//	
//	List<Integer> l12=new ArrayList<>();
//	
//	l12.add(1);
//	l12.add(5);        here we dont get error because Integer implements default Comparable Interface
//	l12.add(3);
//	l12.add(2);
//	l12.add(9);
//	Collections.sort(l12);


		List<Laptop1> l11=new ArrayList<>();
		
		l11.add(l1);
		
		l11.add(l3);
		l11.add(l4);
		l11.add(l2);
		
		System.out.println(l11);
		Collections.sort(l11);
		System.out.println(l11);
		



	}

}

class Laptop1 implements  Comparable<Laptop1>{

	public Laptop1(double price, String model, int ram) {
		
		this.price = price;
		this.model = model;
		this.ram = ram;
	}
	
	@Override
	public String toString() {
		return "Laptop1 [price=" + price + ", model=" + model + ", ram=" + ram + "]";
	}

	private double price;
	private String model;
	private int ram;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}





	@Override
	public int compareTo(Laptop1 o) {

		if(this.getPrice()<o.getPrice()) {
			return -1;
		}
		else if(this.getPrice()>o.getPrice()) {
			return 1;
		}
		else {
			return 0;
		}
	
	}


	
	
}
