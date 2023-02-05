
public class InheritanceC extends InheritanceB{
int i; //data members 
	
    // i and j  and showij() are also available in this C 
	    
	public InheritanceC(int a, int b) {
		// TODO Auto-generated constructor stub
		super.i=a;  //parent i 
		i=b;  // child i 
	}

	void show() //method 
	{
		System.out.println("value of i in parent :"+ super.i );
		System.out.println("value of i in child :"+ i );
	}

}
