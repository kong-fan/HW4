package test4;

public class test4 {
	public static void main(String[] args)
	{
		RacingCar rccar1;
		rccar1= new RacingCar();
		
		rccar1.setCar(1234, 20.5);
		
		rccar1.setCourse(5);
	}
}
	class Car{
		protected int num;
		protected double gas;
		
		public Car() {
			num=0;
			gas=0.0;
			System.out.println("�Ͳ��F���l");
		}
		public void setCar(int n,double g)
		{
			num=n;
			gas=g;
			System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
		}
		
		public void show() {
			System.out.println("�����O"+num);
			System.out.println("�T�o�q�O"+gas);
		}
		public String toString() {
			String str ="�����G"+num+"�T�o�q�G"+gas;
			return str;
		}
	}
	class RacingCar extends Car{
		private int course;
	public RacingCar() {
		course=0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public RacingCar(int n,double g,int c) {

	}
	public void newShow() {
		System.out.println("�ɨ��������O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�ɨ��s���O"+course);
	}
	public void setCourse(int c) {
		course=c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
	
	public void show() {
		System.out.println("�ɨ��������O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�ɨ��s���O"+course);
	}
	}

