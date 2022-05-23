package com.sofkaU.campusDDD.domain.tasting.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.shared.values.TastingId;
import com.sofkaU.campusDDD.domain.tasting.values.Comment;

public class ChangeReviewComment extends Command {

    private final TastingId tastingId;
    private final Comment comment;

    public ChangeReviewComment(TastingId tastingId, Comment comment) {
        this.tastingId = tastingId;
        this.comment = comment;
    }

    public TastingId getTastingId() {
        return tastingId;
    }

    public Comment getComment() {
        return comment;
    }
}
