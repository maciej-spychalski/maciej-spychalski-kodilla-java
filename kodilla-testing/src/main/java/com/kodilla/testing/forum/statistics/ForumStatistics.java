package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        if (numberOfUsers != 0) {
            numberOfPosts = statistics.postsCount();
            numberOfComments = statistics.commentsCount();
        } else {
            numberOfPosts = 0;
            numberOfComments = 0;
        }

        averageNumberOfPostsPerUser = (numberOfUsers != 0) ? numberOfPosts / numberOfUsers : 0;
        averageNumberOfCommentsPerUser =(numberOfUsers!= 0) ? numberOfComments/ numberOfUsers : 0;
        averageNumberOfCommentsPerPost = (numberOfPosts != 0) ? numberOfComments / numberOfPosts : 0;
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

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public void showStatistics() {
        System.out.println("\nNumber of users: " + numberOfUsers);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Average number of posts per user: " + averageNumberOfPostsPerUser);
        System.out.println("Average number of comments per user: " + averageNumberOfCommentsPerUser);
        System.out.println("Average number of comments per post: " + averageNumberOfCommentsPerPost + "\n");
    }
}

