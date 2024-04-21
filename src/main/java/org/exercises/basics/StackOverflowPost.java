package org.exercises.basics;

import java.util.Date;

public class StackOverflowPost {
    private String title;
    private String description;
    private int votes;
    private final Date createdAt;

    public StackOverflowPost(String title, String description) {
        this.title = title;
        this.description = description;
        this.votes = 0;
        this.createdAt = new Date();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void upVote() {
        votes++;
    }

    public void downVote() {
        votes--;
    }

    public int getVotes() {
        return votes;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
