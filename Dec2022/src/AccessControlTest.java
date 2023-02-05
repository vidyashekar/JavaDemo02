
public class AccessControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessControlDemo obj1= new AccessControlDemo();
		
		obj1.a=10;
		obj1.b=20;
		obj1.setC(30);
		System.out.println("Value of a :"+ obj1.a);
		System.out.println("Value of b :"+ obj1.b);
		System.out.println("Value of c :"+ obj1.getc());
		// when a member of a class is public then it is accessed by any other code
		//if private then it cannot be access in other classess and sub classess
		// it can be access by only members of its class 
		//protected applies only when inheritance is involved 
	}

}
