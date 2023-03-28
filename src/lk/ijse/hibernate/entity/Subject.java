/**
 * @author :Hansaka Malshan
 * created 3/28/2023---7:53 PM
 */
package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Subject {
    @Id
    private String sid;
    private String name;
    @ManyToMany
    private List<Lecture>lectureList=new ArrayList<>();

    public Subject() {
    }

    public Subject(String sid, String name) {
        this.sid = sid;
        this.name = name;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
