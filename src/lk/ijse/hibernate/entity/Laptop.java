/**
 * @author :Hansaka Malshan
 * created 3/27/2023---8:05 PM
 */
package lk.ijse.hibernate.entity;

public class Laptop {
    private String id;
    private String name;

    public Laptop() {
    }

    public Laptop(String id, String name) {
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
