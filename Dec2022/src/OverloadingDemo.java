
public class OverloadingDemo {
	
	void hello()
	{
		System.out.println("hello with no parameters ");
	}
	
	void hello(int b)
	{
		System.out.println("hello with 1 parameters of type integer "+n);
	}
	
	
	void hello(int a,int b)
	{
		System.out.println("hello with 2 parameters of type integer :"+ a+","+ b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo obj1 =new OverloadingDemo();
		
		obj1.hello();
		obj1.hello(20);
		obj1.hello(20,30);

}
}
