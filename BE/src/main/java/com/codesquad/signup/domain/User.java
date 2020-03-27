package com.codesquad.signup.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotEmpty;
import java.math.BigInteger;

@Getter
@Setter
@Table("USERS")
public class User {

    @Id
    private BigInteger id;

    @NotEmpty
    private String userId;

    @NotEmpty
    private String password;

    @NotEmpty
    private String name;

    @NotEmpty
    private String birthDay;

    @NotEmpty
    private String gender;

    @NotEmpty
    private String email;

    @NotEmpty
    private String mobile;

    @NotEmpty
    private String interests;

    public User(BigInteger id, @NotEmpty String userId, @NotEmpty String password, @NotEmpty String name, @NotEmpty String birthDay, @NotEmpty String gender, @NotEmpty String email, @NotEmpty String mobile, @NotEmpty String interests) {
        this.id = id;
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.email = email;
        this.mobile = mobile;
        this.interests = interests;
    }

    public boolean matchPassword(String password) {
        return this.password.equals(password);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", interests='" + interests + '\'' +
                '}';
    }


}
