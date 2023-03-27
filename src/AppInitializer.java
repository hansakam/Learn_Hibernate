import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.entity.Laptop;
import lk.ijse.hibernate.entity.Student;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author :Hansaka Malshan
 * created 3/12/2023---10:59 AM
 */

public class AppInitializer {
    public static void main(String[] args) {
      /*  Customer c1 = new Customer();

                c1.setId("c001");
                c1.setName("Hansaka");
                c1.setAddress("Galle");
                c1.setSalary(200000);

        Customer c2 = new Customer();

        c2.setId("c002");
        c2.setName("Harshana");
        c2.setAddress("Galle");
        c2.setSalary(100000);
        //get a new session
        Session session = FactoryConfiguration.getInstance().getSession();

        //transaction begin
        Transaction transaction = session.beginTransaction();

        session.save(c1);

     //session.update(c1);

        //for getting one customer

       *//* Customer cus = session.get(Customer.class, "c001");
        System.out.println(cus.getName()+ " - "+cus.getSalary());*//*



         *//** 1st system for delete

         //for delete Customer

         Customer customer = new Customer();
         customer.setId("c002");

         session.delete(customer);
         *//*

        //second step for delete customer
      *//*  Customer customer1 = session.get(Customer.class, "c002");
                session.delete(customer1);*//*

      //  session.save(c1);

        transaction.commit();

        session.close();
    }*/



        //-------------------------------------------------------------------------------------------------

             Student s1= new Student();
                s1.setId("s001");
                s1.setName("Hansaka");

             Laptop l1 = new Laptop();
                l1.setLId("l001");
                l1.setDescription("hp");
                l1.setStudent(s1);



        Student s2= new Student();
        s2.setId("s002");
        s2.setName("Harshana");

        Laptop l2 = new Laptop();
        l2.setLId("l003");
        l2.setDescription("Dell");
        l2.setStudent(s1);

       /* Laptop l3 = new Laptop();
        l3.setLId("l003");
        l3.setDescription("Dell");
        l3.setStudent(s3);*/


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        session.save(s1);
        session.save(l1);

        transaction.commit();
        session.close();
    }
}
