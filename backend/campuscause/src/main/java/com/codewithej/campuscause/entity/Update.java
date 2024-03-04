package com.codewithej.campuscause.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Update {

    @Id
    private String id;

    private String title;
    private String content;
    private Date datePosted;
}
