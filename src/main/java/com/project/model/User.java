package com.project.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name= "user_id")
    private Long id;
    @Column(name= "first_name")
    private String firstName;
    @Column(name= "last_name")
    private String lastName;
    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private Gender gender;
    @Column(name= "address")
    private String address;
    @Column(name= "email")
    private String email;
    @Column(name= "password")
    private String password;
    @Column(name= "is_admin")
    private boolean isAdmin;
    @OneToMany(mappedBy = "user")
    private List<Reservation> reservations;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public static final class Builder {
        private Long id;
        private String firstName;
        private String lastName;
        private Gender gender;
        private String password;
        private String address;
        private String email;
        private boolean isAdmin;
        private List<Reservation> reservations;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder isAdmin(boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }

        public Builder reservations(List<Reservation> reservations) {
            this.reservations = reservations;
            return this;
        }

        public User build() {
            User user = new User();
            user.id = this.id;
            user.firstName = this.firstName;
            user.lastName = this.lastName;
            user.gender = this.gender;
            user.email = this.email;
            user.address = this.address;
            user.password = this.password;
            user.isAdmin = this.isAdmin;
            user.reservations = this.reservations;

            return user;
        }
    }
}
