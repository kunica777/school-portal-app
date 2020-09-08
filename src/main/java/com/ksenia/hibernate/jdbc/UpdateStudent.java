package com.ksenia.hibernate.jdbc;

import com.ksenia.hibernate.jdbc.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {
        public static void main(String[] args){
            //create session factory
            SessionFactory factory = new Configuration()
                    .configure()
                    .addAnnotatedClass(Student.class)
                    .buildSessionFactory();
            //create new session
            Session session = factory.getCurrentSession();

            try {
                int studentId = 1;
                //begin transaction
                session.beginTransaction();

                //retrieve student  based on the id: primary key
                System.out.println("Getting student with id: "+studentId);

                //create object of retrieved student
                Student student = session.get(Student.class, studentId);

                //updating retrieved student
                student.setFirstName("Ksusha");


                //commit transaction
                session.getTransaction().commit();
                System.out.println("Done!");

                //update all students
                session = factory.getCurrentSession();
                session.beginTransaction();
                session.createQuery("update Student set email='student@hotmail.co.uk'").executeUpdate();

                //commit transaction
                session.getTransaction().commit();
                System.out.println("Done!");

            } finally {
                factory.close();
            }

        }
}
