package com.freshvotes.models;

import lombok.Data;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity
@Data
public class Vote {
    @EmbeddedId
    private VoteId pk;
    private Boolean upvote;
}
