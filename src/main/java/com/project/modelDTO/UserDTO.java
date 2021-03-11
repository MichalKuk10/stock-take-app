package com.project.modelDTO;

import com.project.model.Gender;
import com.project.model.Reservation;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private String address;
    private String password;
    private String email;
    private boolean isAdmin;
    private List<Long> reservationsIds;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public void setIsAdmin(boolean admin) {
        isAdmin = admin;
    }

    public List<Long> getReservationsIds() {
        return reservationsIds;
    }

    public void setReservationsIds(List<Long> reservationsIds) {
        this.reservationsIds = reservationsIds;
    }


    public static final class Builder {
        private Long id;
        private String firstName;
        private String lastName;
        private Gender gender;
        private String address;
        private String password;
        private String email;
        private boolean isAdmin;
        private List<Long> reservationsIds;


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

        public Builder isAdmin(boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }

        public Builder reservationsIds(List<Long> reservationsIds) {
            this.reservationsIds = reservationsIds;
            return this;
        }


        public UserDTO build() {
            UserDTO userDTO = new UserDTO();
            userDTO.id = this.id;
            userDTO.firstName = this.firstName;
            userDTO.lastName = this.lastName;
            userDTO.gender = this.gender;
            userDTO.email = this.email;
            userDTO.password = this.password;
            userDTO.address = this.address;
            userDTO.isAdmin = this.isAdmin;
            userDTO.reservationsIds = this.reservationsIds;

            return userDTO;
        }
    }
}

