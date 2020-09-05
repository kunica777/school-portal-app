package com.ksenia.hibernate.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.ksenia.hibernate.jdbc.entities.Student;

public class CreateStudent {
    public static void main(String[] args) {
        //create session factory
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        //create a session
        Session session = factory.getCurrentSession();

        try{
            //create student object
            System.out.println("Creating new student object...");
            Student tempStudent1 = new Student("Mark", "Paul", "mark@gmail.com");
            Student tempStudent2 = new Student("Tony", "Jefferson", "tony@gmail.com");
            Student tempStudent3 = new Student("Kara", "Stacy", "kara@gmail.com");
            Student tempStudent4 = new Student("Malcolm", "Hugo", "malcolm@gmail.com");
            //start a transaction
            session.beginTransaction();

            //save the student object
            System.out.println("Saving the student...");
            session.save(tempStudent1);
            session.save(tempStudent2);
            session.save(tempStudent3);
            session.save(tempStudent4);

            //commit the transaction
            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally{
            factory.close();
        }

    }
}
