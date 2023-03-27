/**
 * @author :Hansaka Malshan
 * created 3/27/2023---9:11 PM
 */
package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Owner {
    @Id
    private String oid;
    private String name;

    public Owner() {
    }

    public Owner(String oid, String name) {
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
        return "Owner{" +
                "oid='" + oid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
