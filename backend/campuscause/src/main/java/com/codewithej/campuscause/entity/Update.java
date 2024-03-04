package com.codewithej.campuscause.entity;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Update {

    @Id
    private String id;

    @NotEmpty
    private String title;

    @NotEmpty
    @Length(max = 1000, message = "Content cannot exceed 1000 characters")
    private String content;

    private Instant datePosted;
}
