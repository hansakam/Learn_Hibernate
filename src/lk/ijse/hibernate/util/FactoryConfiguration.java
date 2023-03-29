/**
 * @author :Hansaka Malshan
 * created 3/14/2023---11:17 AM
 */
package lk.ijse.hibernate.util;

import lk.ijse.hibernate.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class   FactoryConfiguration {

    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration(){
        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Laptop.class)
                .addAnnotatedClass(Owner.class)
                .addAnnotatedClass(Pet.class)
                .addAnnotatedClass(Lecture.class)
                .addAnnotatedClass(Subject.class)
                .addAnnotatedClass(Owners.class)
                .addAnnotatedClass(Pets.class);
        sessionFactory = configuration.buildSessionFactory();
    }
    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration==null) ? factoryConfiguration = new FactoryConfiguration():factoryConfiguration;

    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
