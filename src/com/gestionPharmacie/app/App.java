package com.gestionPharmacie.app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		int id,idPurchase,unit, score, numberPhone, choix1, choix2;
		String firstName, lastName, email, keep, name, description;
		double price;
		
		Pharmacist pharmacist;
		Medecine medecine;
		Customer customer;
		
		Scanner take = new Scanner(System.in);
		
		Function function = new Function();
		
		do
		{
			
			System.out.println("----------------For the Pharmacist Management write :1: --------------");
			System.out.println("----------------For the Medecine Management write :2: --------------");
			System.out.println("----------------To Make a Purchase write :3: ------------------");
			System.out.println("----------------To See recent Customer write :4: ------------------");
			
			choix1 = take.nextInt();
			if(choix1 == 1)
			{
				System.out.println("---------------To add a new Pharmacist write :1: --------------");
				System.out.println("----------------To Update a Pharmacist write :2: --------------");
				System.out.println("----------------To Delete a Pharmacist write :3: ------------------");
				System.out.println("----------------To Find a Pharmacist write :4: ------------------");
				System.out.println("----------------Show The Pharmacist List :5: ------------------");
				
			}
			else if(choix1 == 2)
			{
				System.out.println("---------------To add a new Medecine write :1: --------------");
				System.out.println("----------------To Update a Medecine write :2: --------------");
				System.out.println("----------------To Delete a Medecine write :3: ------------------");
				System.out.println("----------------To Find a Medecine write :4: ------------------");
				System.out.println("----------------Show The Medecine List :5: ------------------");
				
			}
			else if(choix1 == 3)
			{
				System.out.println("----------------To Save a new Purchase  write :1: ------------------");
				
			}else if(choix1 == 4)
			{
				System.out.println("----------------To Show your Customer list  write :3: ------------------");
			}
			
			choix2 = take.nextInt();
			
			if(choix1 == 1)
			{
				switch(choix2)
				{
				case 1:
					System.out.println("Enter The Pharmacist id :");
					id = take.nextInt();
					System.out.println("Enter The Pharmacist firstName : ");
					firstName = take.next();
					System.out.println("Enter The Pharmacist lastName : ");
					lastName = take.next();
					System.out.println("Enter The Pharmacist numberPhone : ");
					numberPhone = take.nextInt();
					System.out.println("Enter The Pharmacist Email : ");
					email = take.next();
					pharmacist = new Pharmacist(id, firstName, lastName, numberPhone, email);
					
					if(function.addPharmacist(pharmacist))
						{
							System.out.println("Pharmacist adding Successfully!!!");
						}
					else
						{
						System.out.println("Pharmacist adding Failed???");
						}
					break;
				
				case 2:
					System.out.println("Enter The Pharmacist id to Update :");
					id = take.nextInt();
					System.out.println("Enter The new Pharmacist firstName : ");
					firstName = take.next();
					System.out.println("Enter The new Pharmacist lastName :");
					lastName = take.next();
					System.out.println("Enter The new Pharmacist numberPhone : ");
					numberPhone = take.nextInt();
					System.out.println("Enter The new Pharmacist Email : ");
					email = take.next();
					pharmacist = new Pharmacist(id, firstName, lastName, numberPhone, email);
					
					System.out.println(function.updatePharmacist(id, pharmacist));
					break;
					
				case 3:
					System.out.println("Enter The id Pharmacist to delete");
					id = take.nextInt();
					
					System.out.println(function.deletePharmacist(id));
					break;
					
				case 4:
					System.out.println("Enter The id Pharmacist to Find");
					id = take.nextInt();
					
					function.findPharmacist(id).toString();
					break;
					
				case 5:
					System.out.println(function.showPharmacist());
					break;
				}
			}else if(choix1 == 2)
				{
					switch(choix2)
					{
					case 1:
						System.out.println("Enter The Medecine id :");
						id = take.nextInt();
						System.out.println("Enter The Medecine Name : ");
						name = take.next();
						System.out.println("Enter The Medecine Description : ");
						description = take.next();
						System.out.println("Enter The Medecine Units : ");
						unit = take.nextInt();
						System.out.println("Enter The Medecine Unit Price : ");
						price = take.nextDouble();
						medecine = new Medecine(id, name, description, unit, price);
						
						if(function.addMedecine(medecine))
							{
								System.out.println("Medecine adding Successfully!!!");
							}
						else
							{
							System.out.println("Medecine adding Failed???");
							}
						break;
					
					case 2:
						System.out.println("Enter The Medecine id to Update :");
						id = take.nextInt();
						System.out.println("Enter The new Medecine Name : ");
						name = take.next();
						System.out.println("Enter The new Medecine Description :");
						description = take.next();
						System.out.println("Enter The new Medecine Units : ");
						unit = take.nextInt();
						System.out.println("Enter The new Medecine Unit Price : ");
						price = take.nextDouble();
						medecine = new Medecine(id, name, description, unit, price);
						
						System.out.println(function.updateMedecine(id, medecine));
						break;
						
					case 3:
						System.out.println("Enter The id Medecine to delete");
						id = take.nextInt();
						
						System.out.println(function.deleteMedecine(id));
						break;
						
					case 4:
						System.out.println("Enter The id Medecine to Find");
						id = take.nextInt();
						
						function.findMedecine(id).toString();
						break;
						
					case 5:
						System.out.println(function.showMedecine());
						break;
					}
				}else if(choix1 == 3)
						{
							if(choix2 == 1)
							{
								System.out.println("Enter The Customer id :");
								id = take.nextInt();
								System.out.println("Enter The Customer firstName : ");
								firstName = take.next();
								System.out.println("Enter The Customer lastName : ");
								lastName = take.next();
								System.out.println("Enter The Customer numberPhone : ");
								numberPhone = take.nextInt();
								System.out.println("Enter The Customer Email : ");
								email = take.next();
								score = 1;
								customer = new Customer(id, firstName, lastName, numberPhone, email, score);
								
								System.out.println("Enter The Medecine id to purchase");
								idPurchase = take.nextInt();
								System.out.println("Enter The Quantity they want...");
								unit = take.nextInt();
								
								System.out.println(function.addCustomer(customer, idPurchase, unit));
							}
						}
			
			
			
	
			
			System.out.println("------------Do you want to continue ... Yes-Or-No ?-------------");
			keep = take.next();
			
		}while(keep.equalsIgnoreCase("yes"));
		
		take.close();
		System.out.println("Programme Ending");
	}

}
