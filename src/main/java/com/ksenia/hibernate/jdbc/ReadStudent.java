package com.ksenia.hibernate.jdbc;

import com.ksenia.hibernate.jdbc.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudent {
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
            Student tempStudent1 = new Student("Kriss", "Collins", "kriss@gmail.com");

            //start a transaction
            session.beginTransaction();

            //save the student object
            System.out.println("Saving the student...");
            session.save(tempStudent1);

            //find out student's id: primary key
            System.out.println(tempStudent1.getId());

            //get new session and start transaction
            session = factory.getCurrentSession();
            session.getTransaction();

            //retrieve student based on the id: primary key
            System.out.println("Getting student with id: "+ tempStudent1.getId());

            Student student = session.get(Student.class, tempStudent1.getId());
            System.out.println("Student retrieved: "+ student);

            //commit the transaction
            session.getTransaction().commit();
            System.out.println("Done!");

        }
        finally{
            factory.close();
        }

    }
}
