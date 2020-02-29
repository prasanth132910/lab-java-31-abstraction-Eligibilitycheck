package model;

public abstract class Abstract {

	   private int age;
	   private String country;
	   
	 public Abstract(int age,String country)
	 {
		 this.age=age;
		 this.country=country;
	 }
	 
	   public boolean baseEligibility()
	 {
		if(age>=18 && age<=32 && (country.equals("India")||country.equals("india")))
		{
			return true;
		}
		else
			return false;
		 
	 }

}
