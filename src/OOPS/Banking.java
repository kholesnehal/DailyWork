package OOPS;

 class Banking {
	
	protected void doTransection()
	{
		System.out.println("Transection done by being in queue in bank");
	}
}


class OnlineBanking extends Banking
{
	public void doTransection()
	
	{    
		super.doTransection();
		System.out.println("Transection done online");		
	}
	
}
 class OverridenExample{


	public static void main(String[] args) {
		OnlineBanking ob=new OnlineBanking();
		ob.doTransection();

	}


}