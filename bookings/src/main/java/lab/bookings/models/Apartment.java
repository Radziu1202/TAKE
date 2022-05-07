package lab.bookings.models;

import javax.persistence.*;
import java.util.List;
import javax.validation.constraints.Min;


// package and imports
@Entity
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @Min(value = 1, message = "Value must be a positive integer")
    private int capacity;

    @OneToMany(mappedBy = "apartment")
    private List<Booking> bookings;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


// getters & setters
}