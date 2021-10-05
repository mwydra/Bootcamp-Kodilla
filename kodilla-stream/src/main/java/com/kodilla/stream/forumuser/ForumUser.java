package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int ID;
    private final String userName;
    private final char sex;
    private final LocalDate birthdayDate;
    private final int numberOfPosts;

    public ForumUser(int ID, String userName, char sex, LocalDate birthdayDate, int numberOfPosts) {
        this.ID = ID;
        this.userName = userName;
        this.sex = sex;
        this.birthdayDate = birthdayDate;
        this.numberOfPosts = numberOfPosts;
    }

    public int getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ID=" + ID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthdayDate=" + birthdayDate +
                ", numberOfPosts=" + numberOfPosts +
                '}' + "\n";
    }
}
