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
		System.out.println("�Ͳ��F������"+num+"�A�T�o�q��"+gas+"�����l");
	}
	
	public void vShow() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
	public void mShow() {
		System.out.println("���l������O�K");
	}
}

