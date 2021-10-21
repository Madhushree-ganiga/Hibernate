package com.wolken.store;


import com.wolken.store.entity.MarketDetails;
import com.wolken.store.dao.MarketDetailsDAO;
import com.wolken.store.dao.MarketDetailsDAOImpl;




import java.util.Scanner;
public class TestMarket {
	static Scanner sc=new Scanner(System.in);
	public static void main(String  []args)
	{
		MarketDetailsDAO dao=new MarketDetailsDAOImpl();
		MarketDetails details=new MarketDetails();
		String ans;
		do {
			System.out.println("enter choice");
			System.out.println("1. Save Market details");
			System.out.println("2.  Markete getByid");
			System.out.println("3. Markete Details update");
			System.out.println("4. delete  Market Details");
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("enter id");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("enter name");
				String name=sc.nextLine();
				System.out.println("enter location");
				String location=sc.nextLine();
				System.out.println("enter area");
				String type=sc.nextLine();
				System.out.println("enter no of shops");
				int noOfShops=sc.nextInt();
				
				details.setId(id);
				details.setName("name");
				details.setLocation("location");
				details.setNoOfShops(noOfShops);
				boolean check=dao.save(details);
				if(check)
					System.out.println("saved");
				else
					System.out.println("not saved");
			}
			else if(choice==2)
			{
				System.out.println("enter id");
				int id=sc.nextInt();
				
				dao.getByid(id);
			}
			else if(choice==3)
			{
				System.out.println("enter id");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("enter name");
				String name=sc.nextLine();
				System.out.println("enter location");
				String location=sc.nextLine();
				System.out.println("enter area");
				String type=sc.nextLine();
				System.out.println("enter no of shops");
				int noOfShops=sc.nextInt();
				details.setId(id);
				details.setName("name");
				details.setLocation("location");
				details.setNoOfShops(noOfShops);
				
				boolean check=dao.update(details);
				if(check)
					System.out.println("saved");
				else
					System.out.println("not saved");
			}
			else if(choice==4)
			{
				System.out.println("enter id to delete");
				int id=sc.nextInt();
				
				details.setId(id);
				boolean check=dao.delete(details);
				if(check)
					System.out.println("deleted");
				else
					System.out.println("not deleted");
			}
			sc.nextLine();
			System.out.println("do u want to continue");
			ans=sc.nextLine();
		}while(ans.equals("yes"));	
	}
	}

