package com.thanhan;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.A320;
import com.model.Plane;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();	
    	Session session = factory.getCurrentSession();
    	Transaction t = session.beginTransaction();
    	
    	Plane plane1 = new Plane("hanh tinh", 000);
    	session.save(plane1);
    	
    	A320 a320 = new A320("sao hoa", 007, "hanh tinh thu 7");
    	session.save(a320);
    	
	    t.commit();
	    System.out.print("save successed!");
	    factory.close();
	    session.close();
    	
    }
}
