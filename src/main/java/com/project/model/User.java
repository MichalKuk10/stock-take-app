package com.project.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

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
