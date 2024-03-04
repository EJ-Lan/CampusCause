package com.codewithej.campuscause.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "projects")
public class Project {

    @Id
    private String id;

    @DBRef
    private User owner;

    private String title;
    private String description;
    private BigDecimal goalAmount;
    private BigDecimal currentAmount = BigDecimal.ZERO;
    private String category;
    private ProjectStatus status;
    private List<Update> updates;
}
