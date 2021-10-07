package OOPS;

public class Person {
	int id;
	String name;
	Address adr;
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAdr(Address adr)
	{
		this.adr=adr;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public Address getAdr()
	{
		return adr;
	}

	public static void main(String[] args) {
		Person p=new Person();
		p.setId(1);
		p.setName("snehal");
		p.setAdr(new Address());
//		p.getAdr().setZipcode(111);
	//	p.getAdr().setCity("pune");
	//	System.out.println(p.getId()+" "+p.getName()+" "+p.getAdr().getZipcode()+" "+p.getAdr().getCity());

		Address a=p.getAdr();
		a.setZipcode(100);
		a.setCity("Nagar");
		System.out.println(p.getId()+" "+p.getName()+" "+a.getZipcode()+" "+a.getCity());

	}

}
class Address
{
	int zipcode;
	String city;
	public void setZipcode(int zipcode)
	{
		this.zipcode=zipcode;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public int getZipcode()
	{
		return zipcode;
	}
	public String getCity()
	{
		return city;
	}
	
	
	}
