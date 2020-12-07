package com.gestionPharmacie.app;

import java.util.ArrayList;

public class Function {
	
	private ArrayList<Pharmacist> pharmacist;
	private ArrayList<Customer> customer;
	private ArrayList<Medecine> medecine;
	
	public Function()
	{
		this.pharmacist = new ArrayList<Pharmacist>();
		this.customer = new ArrayList<Customer>();
		this.medecine = new ArrayList<Medecine>();
	}
	
	
	/* Pharmacist Management*/
	public boolean addPharmacist(Pharmacist employer)
	{
		boolean result = false;
		if(this.pharmacist.add(employer))
		{
			result = true;
		}
		return result;
	}
	
	
	public String updatePharmacist(int id, Pharmacist newEmployer)
	{
		String result = "";
		for(int i=0; i<this.pharmacist.size(); i++)
		{
			if(this.pharmacist.get(i) != null)
			{
				if(this.pharmacist.get(i).getId() == id)
				{
					this.pharmacist.set(id, newEmployer);
					result = "Updating Succes!!!";
				}
				else
				{
					result = "The Id dosn't exist..";
				}
			}
			else
			{
				result = "The Pharmacist List is empty";
			}
		}
		return result;
	}
	
	public String deletePharmacist(int id)
	{
		String result = "";
		for(int i=0; i<this.pharmacist.size(); i++)
		{
			if(this.pharmacist.get(i) != null)
			{
				if(this.pharmacist.get(i).getId() == id)
				{
					this.pharmacist.remove(i);
					result = "Deleting Succes!!!";
				}
				else
				{
					result = "The Id dosn't exist..";
				}
			}
			else
			{
				result = "The Pharmacist List is empty";
			}
		}
		return result;
		
	}
	
	public Pharmacist findPharmacist(int id)
	{
		Pharmacist result = null;
		for(int i=0; i<this.pharmacist.size(); i++)
		{
			if(this.pharmacist.get(i) != null)
			{
				if(this.pharmacist.get(i).getId() == id)
				{
					result = this.pharmacist.get(i);
				}
			}
		}
		return result;
	}
	
	public String showPharmacist() {
		
		String result = "";
		
		for(int i = 0; i < this.pharmacist.size(); i++) {
			
			if(this.pharmacist.get(i) != null) {
				
				result += "\n+----------+---------------+----------------+-----------------+---------------+\n"+this.pharmacist.get(i).toString();
			}else {
				result =  "The Pharmacist List is Empty ...Please fill it.!!!";
			}
			
		}
		
		return result;
		
	}
	
	/*Medicine Management*/
	public boolean addMedecine(Medecine medecine)
	{
		
		boolean result = false;
		if(this.medecine.add(medecine))
		{
			result = true;
		}
		return result;
	}
	
	
	public String updateMedecine(int id, Medecine newMedecine)
	{
		String result = "";
		for(int i=0; i<this.medecine.size(); i++)
		{
			if(this.medecine.get(i) != null)
			{
				if(this.medecine.get(i).getId() == id)
				{
					this.medecine.set(id, newMedecine);
					result = "Updating Succes!!!";
				}
				else
				{
					result = "The Id dosn't exist..";
				}
			}
			else
			{
				result = "The Medecine List is empty";
			}
		}
		return result;
	}
	
	public String deleteMedecine(int id)
	{
		String result = "";
		for(int i=0; i<this.medecine.size(); i++)
		{
			if(this.medecine.get(i) != null)
			{
				if(this.medecine.get(i).getId() == id)
				{
					this.medecine.remove(i);
					result = "Deleting Succes!!!";
				}
				else
				{
					result = "The Id dosn't exist..";
				}
			}
			else
			{
				result = "The Medecine List is empty";
			}
		}
		return result;
		
	}
	
	public Medecine findMedecine(int id)
	{
		Medecine result = null;
		for(int i=0; i<this.medecine.size(); i++)
		{
			if(this.medecine.get(i) != null)
			{
				if(this.medecine.get(i).getId() == id)
				{
					result = this.medecine.get(i);
				}
			}
		}
		return result;
	}
	
	public String showMedecine() {
		
		String result = "";
		
		for(int i = 0; i < this.medecine.size(); i++) {
			
			if(this.medecine.get(i) != null) {
				
				result = "+----------+---------------+----------------+-----------------+---------------+\n"+this.medecine.get(i).toString();
			}else {
				result =  "The Medecine List is Empty ...Please fill it.!!!";
			}
			
		}
		
		return result;
		
	}
	
	//Save Purchase Part 2 :
	public void updateQuantityMedicine(int id, int quantity)
	{
		int newQuntity = 0;
		for(int i=0; i<this.medecine.size(); i++)
		{
			if(this.medecine.get(i) != null)
			{
				if(this.medecine.get(i).getId() == id)
				{
					newQuntity = this.medecine.get(i).getUnit() - quantity;
					this.medecine.get(i).setUnit(newQuntity);
				}
			}
		}
	}
	
	/*Customer Manipulation*/
	//Save Purchase Part 1 :
	public String addCustomer(Customer customer, int id, int quantity)
	{
		int score = 0;
		String result = "";
		for(int i=0; i<this.customer.size(); i++)
		{
			if(this.customer.get(i).equals(customer))
			{
				if(this.customer.get(i).getScore() >= 3)
				{
					score = this.customer.get(i).getScore() + 1;
					this.customer.get(i).setScore(score);
					this.updateQuantityMedicine(id, quantity);
					result = "Purchase Succes...This is a loyal customer.";
				}
				else
				{
					score = this.customer.get(i).getScore() + 1;
					this.customer.get(i).setScore(score);
					this.updateQuantityMedicine(id, quantity);
					result = "Purchase Succes...This is not a loyal customer.";
				}
				
			}
			else
			{
				this.customer.add(customer);
				this.updateQuantityMedicine(id, quantity);
				result = "Purchase Succes...This is a new customer.";
			}
		}
		return result;
	}
	
	
	public String updateCustomer(int id, Customer newCustomer)
	{
		String result = "";
		for(int i=0; i<this.customer.size(); i++)
		{
			if(this.customer.get(i) != null)
			{
				if(this.customer.get(i).getId() == id)
				{
					this.customer.set(id, newCustomer);
					result = "Updating Succes!!!";
				}
				else
				{
					result = "The Id dosn't exist..";
				}
			}
			else
			{
				result = "The Customer List is empty";
			}
		}
		return result;
	}
	
	public String deleteCustomer(int id)
	{
		String result = "";
		for(int i=0; i<this.customer.size(); i++)
		{
			if(this.customer.get(i) != null)
			{
				if(this.customer.get(i).getId() == id)
				{
					this.customer.remove(i);
					result = "Deleting Succes!!!";
				}
				else
				{
					result = "The Id dosn't exist..";
				}
			}
			else
			{
				result = "The Customer List is empty";
			}
		}
		return result;
		
	}
	
	public Customer findCustomer(int id)
	{
		Customer result = null;
		for(int i=0; i<this.customer.size(); i++)
		{
			if(this.customer.get(i) != null)
			{
				if(this.customer.get(i).getId() == id)
				{
					result = this.customer.get(i);
				}
			}
		}
		return result;
	}
	
	public String showCustomer() {
		
		String result = "";
		
		for(int i = 0; i < this.customer.size(); i++) {
			
			if(this.customer.get(i) != null) {
				
				result = "+----------+---------------+----------------+-----------------+---------------+-------+\n"+this.customer.get(i).toString();
			}else {
				result =  "The Customer List is Empty ...Please fill it.!!!";
			}
			
		}
		
		return result;
		
	}
	
	
}
