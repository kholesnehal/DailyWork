package OOPS;


abstract  class ObjectMovement {

	
	int speed;
	static String direction="forward";
	abstract public void move(int newspeed);
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}


}

class Ball extends ObjectMovement
{
	
	public void move(int s)
	{
		speed=s;
		System.out.println("now ball is rolling with speed"+speed+"meter/min on the ground in"+ObjectMovement.direction+"direction");
	}
	public void showColor()
	{
		System.out.println("Ball is red");
	}
	}

class Car extends ObjectMovement
{
	
public void move(int s)
{
speed=s;	
System.out.println("now car is running with speed"+speed+"km/hr on the road in"+ObjectMovement.direction+"direction");
}

public void showColor()
{
System.out.println("Car is white");	
}

}


public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectMovement om=new Car();
		om.setSpeed(120);
		System.out.println("Initial speed of car:"+om.getSpeed()+"km/hr");
		om.move(80);
		om=new Ball();
		om.setSpeed(20);
		System.out.println("Initial speed of ball :"+om.getSpeed()+"kn/hr");
		om.move(12);

	}

}
