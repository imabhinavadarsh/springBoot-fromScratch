package com.abhinavproject.crudspringboot.entity;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "CloudVendor")
public class CloudVendor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name="firstName")
    @NonNull
    private String firstName;

    @Column(name="lastName")
    @NonNull
    private String lastName;

    @Column(name="email")
    @NonNull
    private String email;

    @Column(name="number")
    @NonNull
    private String number;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    @NonNull
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NonNull String firstName) {
        this.firstName = firstName;
    }

    @NonNull
    public String getLastName() {
        return lastName;
    }

    public void setLastName(@NonNull String lastName) {
        this.lastName = lastName;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    @NonNull
    public String getNumber() {
        return number;
    }

    public void setNumber(@NonNull String number) {
        this.number = number;
    }

    public CloudVendor() {
    }

    public CloudVendor(@NonNull String firstName, @NonNull String lastName, @NonNull String email, @NonNull String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.number = number;
    }

    @Override
    public String toString() {
        return "CloudVendor{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
