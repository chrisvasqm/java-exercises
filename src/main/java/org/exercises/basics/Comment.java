package org.exercises.basics;

import java.util.Date;

public class Comment {
    private final String author;
    private final String message;
    private final Date createdAt;

    public Comment(String author, String message) {
        this.author = author;
        this.message = message;
        this.createdAt = new Date();
    }

    public String getAuthor() {
        return author;
    }

    public String getMessage() {
        return message;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
