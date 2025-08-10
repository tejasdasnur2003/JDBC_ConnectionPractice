package com.Embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Players p1=new Players();
		p1.setPid(1);
		p1.setPname("Rohit Sharma");
		
		Games g1=new Games("Cricket");
		p1.setGames(g1);
		session.save(p1);
		
		tx.commit();
		session.close();
		sf.close();
	}
}
