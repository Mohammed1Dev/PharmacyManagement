/**
 * 
 */
package com.gestionPharmacie.app;

/**
 Person Class 
 
 */
public class Pharmacist {

	/*
	 Class attributes
	 */
	private int id;
	private String firstName;
	private String lastName;
	private int numberPhone;
	private String email;
	
	//default Constructor
	public Pharmacist() {}
	
	//real Constructor
	public Pharmacist(int id, String firstName,String lastName, int numberPhone, String email) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.numberPhone = numberPhone;
		this.email = email;
	}
	
	//Getters & Setters
	
	//Setters
	public void setId(int id)
	{
		this.id = id;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public void setNumerPhone(int numberPhone)
	{
		this.numberPhone = numberPhone;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	//Getters
	public int getId()
	{
		return this.id;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public int getNumberPhone()
	{
		return this.numberPhone;
	}
	public String getEmail()
	{
		return this.email;
	}
	
	//Show Pharmacists
	@Override
	public String toString()
	{
		return "|"+this.id+"|"+this.firstName+"|"+this.lastName+"|"+this.numberPhone+"|"+this.email+"|";
	}
	

}
