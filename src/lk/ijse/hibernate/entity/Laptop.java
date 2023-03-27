/**
 * @author :Hansaka Malshan
 * created 3/27/2023---8:05 PM
 */
package lk.ijse.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Laptop {
    private String LId;
    private String Description;

    public Laptop() {
    }

    public Laptop(String LId, String description) {
        this.LId = LId;
        this.Description = description;
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
