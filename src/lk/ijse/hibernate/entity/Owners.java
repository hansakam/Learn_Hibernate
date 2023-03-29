/**
 * @author :Hansaka Malshan
 * created 3/29/2023---1:41 PM
 */
package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Owners {
    @Id
    private String oid;
    private String name;
    @OneToMany(mappedBy = "Owners")
    private List<Pets>petsList=new ArrayList<>();

    public Owners() {
    }

    public Owners(String oid, String name) {
        this.oid = oid;
        this.name = name;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owners{" +
                "oid='" + oid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
