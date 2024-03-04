package com.codewithej.campuscause.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "users")
public class User {

    @Id
    private String id;

    @NotEmpty
    @Length(max = 50, message = "Username cannot exceed 50 characters")
    private String username;

    private String password;

    @Email(message = "Email must be a valid email address")
    private String email;
    private ProfileType profileType;
    private List<String> interests;
    private String bio;

    private List<String> projectsSupported = new ArrayList<>();
    private List<String> projectsCreated = new ArrayList<>();

    public enum ProfileType {
        STUDENT, DONOR
    }
}
