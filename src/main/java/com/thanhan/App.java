package com.thanhan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Cat;
import com.model.Employee;
import com.model.Shoe;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	// cach 1
//    	Configuration cfg = new Configuration()
//    		    .addResource("Employee.hbm.xml")
//    			.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
//    			.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver")
//    			.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hibernate_db?useSSL=false")
//    			.setProperty("hibernate.connection.username", "thanhan")
//    			.setProperty("hibernate.connection.password", "12345aA.");
//    	
//    	SessionFactory factory = cfg.buildSessionFactory();
//    	
//    	Session session = factory.openSession(); // open a new Session
//    	
    	//cach 2---------------------------------------------------------------
//    	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();   
//    	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//    	SessionFactory factory = meta.getSessionFactoryBuilder().build();
//    	or
//    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
//    	Session session = factory.openSession();
    	//end cach 2---------------------------------------------------------------
//    	Session session = factory.getCurrentSession();
//    	Transaction t = session.beginTransaction();
//    	
//	    	Employee emp1 = new Employee();
//	    	emp1.setFirstName("Nguyen");
//	    	emp1.setLastName("annotation");
//	    	emp1.setId(1);
//    	
//	    	session.save(emp1);
//	    t.commit();
//	    System.out.print("save successed!");
//	    factory.close();
//	    session.close();
//	    
    	// cach 3 : use annotation
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	
    	Session session = factory.getCurrentSession();
    	Transaction t = session.beginTransaction();
    	
	    	Cat cat1 = new Cat();
	    	
	    	cat1.setName("mikey");
	    	cat1.setWeight(3);
	    	Shoe pink = new Shoe(); pink.setColor("pink");
	    	cat1.setShoe(pink);
	    	
	    	session.save(cat1);
//	    	
//	    	Employee emp1 = new Employee();
//	    	emp1.setFirstName("cat");
//	    	emp1.setLastName("mikey");
//    	
//	    	session.save(emp1);
	    t.commit();
	    System.out.print("save successed!");
	    factory.close();
	    session.close();
    	
    }
}
