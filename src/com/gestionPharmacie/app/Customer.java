package com.gestionPharmacie.app;

public class Customer extends Pharmacist{
	
	private int score;
	
	public Customer() {}
	
	public Customer(int id, String firstName, String lastName,  int numberPhone, String email, int score)
	{
		super(id, firstName, lastName, numberPhone, email);
		this.score = score;
		
	}
	
	//Setters & Getters
	//Setters
	public void setScore(int score)
	{
		this.score = score;
	}
	//Getters
	public int getScore()
	{
		return this.score;
	}
	
	//Show Customer
	@Override
	public String toString()
	{
		return super.toString()+"|"+this.score+"|";
	}
}
