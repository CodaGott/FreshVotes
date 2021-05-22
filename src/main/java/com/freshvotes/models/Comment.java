package com.freshvotes.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
@Data
public class Comment {
    @EmbeddedId
    private CommentId pk;
    @Column(length = 5000)
    private String text;
}
