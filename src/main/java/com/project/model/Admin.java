package com.project.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Admin {
    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String password;
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
}
