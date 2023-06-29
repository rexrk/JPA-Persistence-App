package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
    public Employee() {
    }

    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "FNAME")
    private String firstName;
    @Column(name = "LNAME")
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getfFirstName() {
        return firstName;
    }

    public void setfFirstName(String fName) {
        this.firstName = fName;
    }

    public String getlLastName() {
        return lastName;
    }

    public void setlLastName(String lName) {
        this.lastName = lName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
