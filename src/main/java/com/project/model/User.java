package com.project.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "app_user")
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name= "app_user_id")
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

        public Builder email(String email) {
            this.email = email;
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


        public User build() {
            User user = new User();
            user.id = this.id;
            user.firstName = this.firstName;
            user.lastName = this.lastName;
            user.email = this.email;
            user.password = this.password;
            user.address = this.address;

            return user;
        }
    }
}
