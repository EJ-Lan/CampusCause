package com.codewithej.campuscause.entity;

import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.Instant;

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

    @Positive(message = "Amount must be greater than 0")
    private BigDecimal amount;

    private Instant donationDate;
}
