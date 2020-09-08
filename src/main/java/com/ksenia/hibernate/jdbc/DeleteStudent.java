package com.ksenia.hibernate.jdbc;

import com.ksenia.hibernate.jdbc.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {
        public static void main(String[] args){
            //create session factory
            SessionFactory factory = new Configuration()
                    .configure()
                    .addAnnotatedClass(Student.class)
                    .buildSessionFactory();
            //create new session
            Session session = factory.getCurrentSession();

            try {
                int studentId = 5;

                //begin transaction
                //session.beginTransaction();

                //retrieve student  based on the id: primary key
                //System.out.println("Getting student with id: "+studentId);

                //create object of retrieved student
                //Student student = session.get(Student.class, studentId);

                //delete retrieved student
                //session.delete(student);

                //commit transaction
                //session.getTransaction().commit();
                //System.out.println("Student was deleted!");

                //delete with query
                session.beginTransaction();
                session.createQuery("delete from Student where id=4").executeUpdate();

                //commit transaction
                session.getTransaction().commit();
                System.out.println("Deleted!");

            } finally {
                factory.close();
            }

        }
}
