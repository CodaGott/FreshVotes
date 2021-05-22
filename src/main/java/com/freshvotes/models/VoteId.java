package com.freshvotes.models;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class VoteId implements Serializable {
    private static final long serialVersionUID = -4955788289570632520L;
    @ManyToOne
    private User userId;
    @ManyToOne
    private Feature featureId;
}
