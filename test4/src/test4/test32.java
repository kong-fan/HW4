package test4;

public class test32 {
	public static void main(String[] args)
	{
		Vehicle[] vc =new Vehicle[2];	
		
		vc[0]=new Car2(1234,20.5);
		vc[1]=new Plane(232);
		
		for(int i=0;i<vc.length;i++) {
			if(vc[i] instanceof Car2) {
				System.out.println("��"+(i+1)+"�Ӫ���OCar���O");
			}
			else
				System.out.println("��"+(i+1)+"�Ӫ��󤣬OCar���O");
		}
	}
}


