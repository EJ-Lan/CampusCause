package com.codewithej.campuscause.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "donations")
public class Donation {

    @Id
    private String id;

    @DBRef
    private Project project;

    @DBRef
    private User donor;

    private double amount;
    private Date date;
}
