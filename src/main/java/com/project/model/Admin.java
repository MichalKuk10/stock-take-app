package com.project.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "admin")
public class Admin {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name= "id")
    private Long id;
    @Column(name= "first_name")
    private String firstName;
    @Column(name= "last_name")
    private String lastName;
    @Column(name= "address")
    private String address;
    @Column(name= "password")
    private String password;
    @Column(name= "email")
    private String email;

    public static final class Builder {
        private Long id;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private String address;


        public Admin.Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Admin.Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Admin.Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Admin.Builder email(String email) {
            this.email = email;
            return this;
        }

        public Admin.Builder password(String password) {
            this.password = password;
            return this;
        }

        public Admin.Builder address(String address) {
            this.address = address;
            return this;
        }


        public Admin build() {
            Admin admin = new Admin();
            admin.id = this.id;
            admin.firstName = this.firstName;
            admin.lastName = this.lastName;
            admin.email = this.email;
            admin.password = this.password;
            admin.address = this.address;

            return admin;
        }
    }

    /*
    DROP TABLE car;

CREATE TABLE car(id serial PRIMARY KEY,
                    manufacturer VARCHAR ( 50 )  NOT NULL,
                    car_id INT NOT NULL,
                 	rent VARCHAR ( 50 ) NOT NULL,
                 	service VARCHAR ( 55 ) NOT NULL,
                 	fuel INT NOT NULL);
     */
}
