/**
 * @author :Hansaka Malshan
 * created 3/29/2023---1:39 PM
 */
package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pets {
    @Id
    private String pid;
    private String name;
    @ManyToOne
    private Owners owners;

    public Pets() {
    }

    public Pets(String pid, String name) {
        this.pid = pid;
        this.name = name;
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
        return "Pets{" +
                "pid='" + pid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
