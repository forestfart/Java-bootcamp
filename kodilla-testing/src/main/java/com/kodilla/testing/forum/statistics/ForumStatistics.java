package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    int averagePostsPerUser;
    int averageCommentsPerUser;
    int averageCommentsPerPost;
    Statistics statistics;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    void calculateAdvStatistics(Statistics statistics) {
        if (statistics.usersNames().size()!=0) {
            averagePostsPerUser = statistics.postsCount() / statistics.usersNames().size();
        } else {
            averagePostsPerUser = 0;
        }
        if (statistics.usersNames().size()!=0) {
            averageCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        } else {
            averageCommentsPerUser = 0;
        }
        if (statistics.postsCount()!=0) {
            averageCommentsPerPost = statistics.commentsCount() / statistics.postsCount();
        } else {
            averageCommentsPerPost = 0;
        }
    }

    void showStatistics() {
        System.out.println("Average number of posts per user: " + averagePostsPerUser);
        System.out.println("Average number of comments per user: " + averageCommentsPerUser);
        System.out.println("Average number of comments per post: " + averageCommentsPerPost);
    }
}
