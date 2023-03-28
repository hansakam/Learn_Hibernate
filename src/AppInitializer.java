import lk.ijse.hibernate.entity.*;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

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
/*
                            one to one

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

       *//*
*//* Laptop l3 = new Laptop();
        l3.setLId("l003");
        l3.setDescription("Dell");
        l3.setStudent(s3);*//**//*



        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


       /* session.save(s1);
        session.save(l1);*//*

        transaction.commit();
        session.close();*/



   //--------------------------------------------------------------------------------

                    //one to many
/*
        Owner o1 = new Owner();
                o1.setOid("O002");
                o1.setName("Kulasekara");

        Pet p1 = new Pet();
            p1.setPid("p003");
            p1.setName("Fish");
            p1.setOwner(o1);

        Pet p2 = new Pet();
        p2.setPid("p004");
        p2.setName("Birds");
        p2.setOwner(o1);

        // 1st Methodology add to arry list

     *//*   ArrayList<Pet> petList = new ArrayList<>();
        petList.add(p1);
        petList.add(p2);

        o1.setPetList(petList);*//*


       // 2nd Methodology
       o1.getPetList().add(p1);
       o1.getPetList().add(p2);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        session.save(o1);
        session.save(p1);
        session.save(p2);

        transaction.commit();
       session.close(); */

   //------------------------------------------------------------------------------------------------------

                // many to Many

        Lecture l1 = new Lecture();
                l1.setId("l001");
                l1.setName("Danuja");

        Lecture l2 = new Lecture();
                l2.setId("l002");
                l2.setName("Niroth");


        Subject s1 = new Subject();
                s1.setSid("S001");
                s1.setName("PRF");


        Subject s2 = new Subject();
               s2.setSid("S002");
               s2.setName("ORM");



               // 1st methodology

        ArrayList<Subject>subjectslist=new ArrayList<>();
                 subjectslist.add(s1);
                 subjectslist.add(s2);





        ArrayList<Lecture> LectureList = new ArrayList<>();
                            LectureList.add(l1);
                            LectureList.add(l2);

        s1.setLectureList(LectureList);
        s2.setLectureList(LectureList);

        l1.setSubjectList(subjectslist);
        l2.setSubjectList(subjectslist);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


       // session.save(l1);
        session.save(l2);
        /*session.save(s1);
        session.save(s2);*/


        transaction.commit();
        session.close();


    }
}
