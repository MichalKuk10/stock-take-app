package com.project.modelDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

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


        public UserDTO build() {
            UserDTO userDTO = new UserDTO();
            userDTO.id = this.id;
            userDTO.firstName = this.firstName;
            userDTO.lastName = this.lastName;
            userDTO.email = this.email;
            userDTO.password = this.password;
            userDTO.address = this.address;

            return userDTO;
        }
    }
}

