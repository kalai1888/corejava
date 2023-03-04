package com.hproject.demo;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student obj=new Student();
    	obj.setId(56);
    	obj.setName("reena");
    	obj.setGender("female");
    	
    	Configuration con=new Configuration();
    	SessionFactory sf=con.buildSessionFactory();
    	Session session= sf.openSession(); 
    	session.save(obj);
    	
    }
}
