package com.controller.listner;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.hibernate.SessionFactory;

import com.model.persistenceFactory.HibernateSessionFactory;


@WebListener
public class Listner implements ServletContextListener {
SessionFactory sf=null;
    public void contextInitialized(ServletContextEvent event) {
       sf=HibernateSessionFactory.getConnection();
       event.getServletContext().setAttribute("sessionfactory",sf);
    }


    public void contextDestroyed(ServletContextEvent event) {
        event.getServletContext().removeAttribute("sessionfactory");
        if(sf!=null)
        	sf.close();
    }
	
}
