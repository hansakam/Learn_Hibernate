import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author :Hansaka Malshan
 * created 3/12/2023---10:59 AM
 */

public class AppInitializer {
    public static void main(String[] args) {
        Customer c1 = new Customer();

                c1.setId("c001");
                c1.setName("Hansaka");
                c1.setAddress("Galle");
                c1.setSalary(100000);

       /* Customer c2 = new Customer();

        c2.setId("c002");
        c2.setName("Harshana");
        c2.setAddress("Galle");
        c2.setSalary(100000);
*/


        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        session.save(c1);

        transaction.commit();

        session.close();
    }
}
