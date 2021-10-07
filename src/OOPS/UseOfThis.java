package OOPS;

public class UseOfThis {
	int id=1;
	String name="Snehal";
	
	public void accept()
	{ 
		//TO invoke current class instance variable
		System.out.println("Id:"+this.id);
		System.out.println("Name:"+this.name);
	}
	public UseOfThis() {
		System.out.println("I am in default constructor");
	}

	public UseOfThis(int id, String name) {
		//to invoke constructor
		this();
		this.id = id;
		this.name = name;
	}
	public void display()
	{
		//TO invoke method
		this.accept();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
