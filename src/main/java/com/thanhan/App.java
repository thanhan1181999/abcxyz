package com.thanhan;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Customer;
import com.model.PositionEnum;
import com.model.TypeDefs;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();	
    	Session session = factory.getCurrentSession();
    	Transaction t = session.beginTransaction();
//    	Customer e = new Customer("first customer");
//    	session.save(e);
//    	Customer e1 = new Customer("second customer");
//    	session.save(e1);
//    	Customer e2 = new Customer("third customer");
//    	session.save(e2);
    	Customer customer = session.load(Customer.class, 1);
    	System.out.println(customer.getPosition());
    	System.out.println(customer.getGetNextVersion());
//    	Customer customer = new Customer("this is a customer");
//    	customer.setDate(new Date(1999,7,11));
//    	customer.setPosition(PositionEnum.DEVELOPER);
//    	customer.setTypedef(new TypeDefs("this is name", "this is descript"));
//    	session.save(customer);
	    t.commit();
	    System.out.print("save successed!");
	    factory.close();
	    session.close();
    	
    }
}
