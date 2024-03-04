package com.codewithej.campuscause.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "users")
public class User {

    @Id
    private String id;

    @NotEmpty
    private String username;
    private String password;
    @Email
    private String email;
    private ProfileType profileType;
    private List<String> interests;
    private String bio;

    private List<String> projectsSupported;
    private List<String> projectsCreated;

    public enum ProfileType {
        STUDENT, DONOR
    }
}
