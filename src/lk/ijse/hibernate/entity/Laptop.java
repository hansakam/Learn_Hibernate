/**
 * @author :Hansaka Malshan
 * created 3/27/2023---8:05 PM
 */
package lk.ijse.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
    @Id
    private String LId;
    private String Description;



    @OneToOne
    private Student student;

    public Laptop() {
    }

    public Laptop(String LId, String description, Student student) {
        this.LId = LId;
        this.Description = description;
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getLId() {
        return LId;
    }

    public void setLId(String LId) {
        this.LId = LId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "LId='" + LId + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
