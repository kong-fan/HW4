package test4;

public class test26 {
	public static void main(String[] args)
	{
		Car cars[];
		cars= new Car[2];
		
		cars[0]=new Car();
		
		cars[1]=new RacingCar();
		
		for(int i=0;i<cars.length;i++) {
			Class cl=cars[i].getClass();
			System.out.println("��"+(i+1)+"�Ӫ������O�O"+cl);
		}
	}
}
