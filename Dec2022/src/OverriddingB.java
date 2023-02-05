
public class OverriddingB extends OverriddingA{
	int k;
	OverriddingB(int a,int b ,int c)
	{
		super(a,b);
		k=c;
		
	}
	
	
	void show()
	{   super.show();
		System.out.println("k :"+ k);
	}
}
