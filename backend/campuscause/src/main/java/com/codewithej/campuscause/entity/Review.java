package com.codewithej.campuscause.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "reviews")
public class Review {

    @Id
    private String id;

    @DBRef
    private User donor;

    @Min(1)
    @Max(5)
    private int rating;

    private String comment;
}
