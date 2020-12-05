package com.gestionPharmacie.app;

public class Medecine {
	
	private int id;
	private String name;
	private String description;
	private int unit;
	private double price;

	public Medecine() {}
	
	public Medecine(int id, String name, String description, int unit, double price)
	{
		this.id = id;
		this.name = name;
		this.description = description;
		this.unit = unit;
		this.price = price;
	}
	
	//Setters & Getters
	//Setters
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public void setUnit(int unit)
	{
		this.unit = unit;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	//Getters
	public int getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public String getDescription()
	{
		return this.description;
	}
	public int getUnit()
	{
		return this.unit;
	}
	public double getPrice()
	{
		return this.price;
	}
	
	//Show Medecines
	@Override
	public String toString()
	{
		return "|"+this.id+"|"+this.name+"|"+this.description+"|"+this.price+"|";
	}

}
