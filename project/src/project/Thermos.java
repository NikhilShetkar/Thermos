package project;

public class Thermos {
	String brand,liquid;
	double qty;
	
	Thermos(String liquid, double qty,String brand)
	{
		this.liquid = liquid;
	}
	void add(double val)
	{
		qty = qty + val;
	}
	void sub(double val)
	{
		
	}
	void display()
	{
		System.out.println("Liquid is"+liquid);
	}
	public static void main(String[] args) {

	}

}
