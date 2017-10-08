package aor.demo.crud.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Where(clause="published=1")
public class Customer {
    @Id
    public Integer id;
    public String firstName;
    public String lastName;
    public String email;
    public String birthday;
    public String address;
    public String zipcode;
    public String city;
    public String avatar;
    public String firstSeen;
    public String lastSeen;
    public boolean hasNewsLetter;
    @ElementCollection(fetch = FetchType.EAGER)
    Collection<GroupEnum> groups;
    public String latestPurchase;
    public int nbCommands;
    public double totalSpent;
    public boolean published = true;

    public Customer() {}

    @JsonCreator
    public Customer(int id) {
        this.id = id;
    }
}
