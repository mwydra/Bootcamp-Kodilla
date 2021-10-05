package com.kodilla.testing.forum.statistics;

public class StatisticsForecast {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double avrPostsPerUser;
    private double avrCommentsPerUser;
    private double avrCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.userNames().size();
        numberOfPosts = statistics.postCount();
        numberOfComments = statistics.commentsCount();
        avrPostsPerUser = (double)numberOfPosts/(double)numberOfUsers;
        avrCommentsPerUser = (double)numberOfComments/(double)numberOfUsers;
        avrCommentsPerPost = (double)numberOfComments/(double)numberOfPosts;
    }

    public void showStatistics(){
        System.out.println("Liczba użytkowników: " + numberOfUsers + "\n" +
                            "Liczba postów: " + numberOfPosts + "\n" +
                            "Liczba komentarzy: " + numberOfComments + "\n" +
                            "średnia liczba postów na użytkownika: " + avrPostsPerUser + "\n" +
                            "średnia liczba komentarzy na użytkownika: " + avrCommentsPerUser + "\n" +
                            "średnia liczba komentarzy na post: " + avrCommentsPerPost);
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvrPostsPerUser() {
        return avrPostsPerUser;
    }

    public double getAvrCommentsPerUser() {
        return avrCommentsPerUser;
    }

    public double getAvrCommentsPerPost() {
        return avrCommentsPerPost;
    }
}
