package com.kodilla.testing.forum;

import java.util.Objects;

public class ForumPost {
    String author;
    String postbody;

    public ForumPost(String author, String postbody) {
        this.author = author;
        this.postbody = postbody;
    }

    public String getPostbody() {
        return postbody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumPost forumPost = (ForumPost) o;
        return postbody.equals(forumPost.postbody) &&
                author.equals(forumPost.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postbody, author);
    }
}
