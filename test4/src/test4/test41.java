package test4;

public class test41 {
	public static void main(String[] args)
	{
	Car4 car1 =new Car4(1234,20.5);	
	
	car1.vShow();
	car1.mShow();
}
}
interface iVehicle2
{
	void vShow();
}
interface iMaterial{
	void mShow();
}
class Car4 implements iVehicle2,iMaterial{
	protected int num;
	protected double gas;
	
	public Car4(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
	public void vShow() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	public void mShow() {
		System.out.println("車子的材質是鐵");
	}
}

