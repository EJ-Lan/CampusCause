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
@Document(collection = "comments")
public class Comment {

    @Id
    private String id;

    @DBRef
    Project project;

    @DBRef
    User author;

    private String content;
    private Date datePosted;
}
