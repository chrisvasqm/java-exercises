package org.exercises.basics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private final String title;
    private final String description;
    private int votes;
    private final Date createdAt;
    private final List<Comment> comments;

    public Post(String title, String description) {
        this.title = title;
        this.description = description;
        this.votes = 0;
        this.createdAt = new Date();
        this.comments = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getVotes() {
        return votes;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void upVote() {
        votes++;
    }

    public void downVote() {
        votes--;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void comment(Comment comment) {
        comments.add(comment);
    }

}
