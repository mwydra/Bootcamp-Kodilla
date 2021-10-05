package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(1, "John Smith", 'M', LocalDate.of(1990, 12, 12), 15));
        userList.add(new ForumUser(2, "Dorothy Newman", 'F', LocalDate.of(1991, 11, 11), 14));
        userList.add(new ForumUser(3, "John Wolkowitz", 'M', LocalDate.of(1992, 10, 10), 13));
        userList.add(new ForumUser(4, "Lucy Riley", 'F', LocalDate.of(1993, 9, 9), 12));
        userList.add(new ForumUser(5, "Owen Rogers", 'M', LocalDate.of(1994, 8, 8), 11));
        userList.add(new ForumUser(6, "Matilda Davies", 'F', LocalDate.of(1995, 7, 7), 10));
        userList.add(new ForumUser(7, "Declan Booth", 'M', LocalDate.of(1996, 6, 6), 9));
        userList.add(new ForumUser(8, "Corinne Foster", 'F', LocalDate.of(1997, 5, 5), 8));
        userList.add(new ForumUser(9, "Khloe Fry", 'F', LocalDate.of(1998, 4, 4), 7));
        userList.add(new ForumUser(10, "Martin Valenzuela", 'M', LocalDate.of(1999, 3, 3), 6));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(userList);
    }
}
