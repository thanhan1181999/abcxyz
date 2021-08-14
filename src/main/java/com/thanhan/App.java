package com.thanhan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();	
    	Session session = factory.getCurrentSession();
    	Transaction t = session.beginTransaction();
//    	session.save(emp1);
	    t.commit();
	    System.out.print("save successed!");
	    factory.close();
	    session.close();
    	
    }
}
