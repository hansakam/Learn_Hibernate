/**
 * @author :Hansaka Malshan
 * created 3/28/2023---7:52 PM
 */
package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Lecture {
    @Id
    private String id;
    private String name;
    @ManyToMany
    private List<Subject>subjectList=new ArrayList<>();

    public Lecture() {
    }

    public Lecture(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
