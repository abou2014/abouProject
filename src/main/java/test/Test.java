package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import daoImp.PersonneImp;

public class Test {
	
	public static void main( String[] args )
    {
    	ApplicationContext context =
    		new ClassPathXmlApplicationContext("Spring-Module.xml");

    	PersonneImp pDAO = (PersonneImp) context.getBean("personneDAO");
    	//Personne personne2 = (Personne) context.getBean("personne2");
    	//Personne p = new Personne("BOUBA","Abou");
    	pDAO.create();
    }
}
