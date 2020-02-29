package model;

public class CDS extends Abstract {
	
	private int height;
	private int weight;
	private String number;
	
	public CDS(String name, int age, String country, int height, int weight, String number) {
		super(age,country);
		this.height=height;
		this.weight=weight;
		this.number=number;
		
		}
	
	public boolean cdsEligible()
	{
		if(height>=152 && weight>=54 )
		{
			return true;
		}
		else
			return false;
	}

		
	}

	

	
	
	

