/**
 * @author :Hansaka Malshan
 * created 3/27/2023---9:10 PM
 */
package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pet {
    @Id
    private String pid;
    private String name;



    @ManyToOne
    private Owner owner;

    public Pet() {
    }

    public Pet(String pid, String name, Owner owner) {
        this.pid = pid;
        this.name = name;
        this.owner = owner;
    }
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "pid='" + pid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
