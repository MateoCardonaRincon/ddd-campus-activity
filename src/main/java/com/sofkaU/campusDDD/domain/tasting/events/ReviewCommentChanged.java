package com.sofkaU.campusDDD.domain.tasting.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.tasting.values.Comment;

public class ReviewCommentChanged extends DomainEvent {

    private final Comment comment;

    public ReviewCommentChanged(Comment comment) {
        super("campusddd.tasting.reviewcommentchanged");
        this.comment = comment;
    }

    public Comment getComment() {
        return comment;
    }
}
