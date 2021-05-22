package com.freshvotes.models;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@Data
public class CommentId implements Serializable {
    private static final long serialVersionUID = -8348534339984631256L;
    @ManyToOne
    private User userId;
    @ManyToOne
    private Feature featureId;
}
