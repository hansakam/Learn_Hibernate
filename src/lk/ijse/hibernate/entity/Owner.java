/**
 * @author :Hansaka Malshan
 * created 3/27/2023---9:11 PM
 */
package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Owner {
    @Id
    private String oid;
    private String name;

    @OneToMany(mappedBy = "owner")
    private List<Pet>petList=new ArrayList<>();

    public Owner() {
    }

    public Owner(String oid, String name, List<Pet> petList) {
        this.oid = oid;
        this.name = name;
        this.setPetList(petList);
    }
    public List<Pet> getPetList() {
        return petList;
    }

    public void setPetList(List<Pet> petList) {
        this.petList = petList;
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
