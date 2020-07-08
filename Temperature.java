public class Temperature
{
	private double temp;
	private String scale;
	
	public Temperature()
	{
		temp = 0;
		scale = "C";
	}
	
	public Temperature(String newScale)
	{
		setScale(newScale);
	}
	
	public Temperature(double newTemp)
	{
		setTemp(newTemp);
	}
	
	public Temperature(double newTemp, String newScale)
	{
		temp = newTemp;
		scale = newScale;
	}

	public void setScale(String newScale)
	{
		if (newScale.equalsIgnoreCase("C"))
			scale = "C";
		else if (newScale.equalsIgnoreCase("F"))
			scale = "F";
		else
		{
			System.out.println("Error");
			System.exit(0);
		}
	}
	
	public void setTemp(double newTemp)
	{
		temp = newTemp;
	}
	
	public void setBoth(double newTemp, String newScale)
	{
		temp = newTemp;
		setScale(newScale);
	}
	
	public double getTemp()
	{
		return temp;
	}
	
	public String getScale()
	{
		return scale;
	}
	
	public void getTempC()
	{
		if (scale.equals("C"))
			temp = temp;
		else if (scale.equals("F"))
			temp = (5 * (temp - 32) / 9);
		else
		{
			System.out.println("Error");
			System.exit(0); 
		}
	}
	
	public void getTempF()
	{
		if (scale.equals("F"))
			temp = temp;
		else if (scale.equals("C"))
			temp = 9 * (temp / 5) + 32;
		else
		{
			System.out.println("Error");
			System.exit(0);
		}
	}
	
	public boolean equals(Temperature otherTemp)
	{	
		if (scale.equalsIgnoreCase(otherTemp.scale))
		{
			return ( (temp == otherTemp.temp));
		}
		else
		{
			if (scale.equalsIgnoreCase("C"))
			{
				getTempF();
				return (temp == otherTemp.temp);
			}
			else //scale.equalsIgnoreCase("F")
			{
				getTempC();
				return (temp == otherTemp.temp);
			}
		}
	}
	
	public boolean isGreater(Temperature otherTemp)
	{
		return ( (temp > otherTemp.temp) &&
				(scale == otherTemp.scale) );
	}
	
	public String toString()
	{
		System.out.println(temp + " degrees " + scale);
		return (temp + "degrees " + scale);
	}
	
}