/**
 * @author :Hansaka Malshan
 * created 3/27/2023---8:04 PM
 */
package lk.ijse.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @Column(name = "S_Id")
    private String id;
    private String name;

    public Student() {
    }

    public Student(String id, String name) {
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
        return "Laptop{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
