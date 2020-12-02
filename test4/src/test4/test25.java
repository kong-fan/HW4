package test4;

public class test25 {
	public static void main(String[] args)
	{
		Car car1=new Car();
		Car car2= new Car();
		
		Car car3;
		car3=car1;
		
		System.out.println("car1與car2相同"+car1.equals(car2));
		System.out.println("car1與car2相同"+car1.equals(car3));
	}
}
