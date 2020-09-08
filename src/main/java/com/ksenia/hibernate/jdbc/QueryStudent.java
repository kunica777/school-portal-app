package com.ksenia.hibernate.jdbc;

import com.ksenia.hibernate.jdbc.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudent {

   public static void main(String[] args) {
       //create session factory
       SessionFactory factory = new Configuration()
               .configure()
               .addAnnotatedClass(Student.class)
               .buildSessionFactory();

       //create a session
       Session session = factory.getCurrentSession();

       try{

           //start a transaction
           session.beginTransaction();

           //query the students
           List <Student> students = session.createQuery("from Student").getResultList();

           //display the students
           displayStudents(students);

           //query students: last name='Rybakova'
           students = session.createQuery("from Student s where s.lastName='Rybakova'").getResultList();

           //display the students
           System.out.println("Students who have last name of Rybakova");
           displayStudents(students);

           //query students: last name = 'Stacy' or first name = 'Kara'
           students = session.createQuery("from Student s where s.lastName='Stacy' OR s.firstName='Kara'").getResultList();

           //display the students
           System.out.println("Students who have last name of Stacy or first name of Kara");
           displayStudents(students);

           //query student, whose email is gmail.com
           students = session.createQuery("from Student s where s.email LIKE '%gmail.com'").getResultList();

           //display students
           System.out.println("Students with email ending on gmail.com");
           displayStudents(students);

           //commit the transaction
           session.getTransaction().commit();
           System.out.println("Done!");

       }
       finally{
           factory.close();
       }

   }

    private static void displayStudents(List<Student> students) {
        for(Student student: students){
            System.out.println(student);
        }
    }
}
