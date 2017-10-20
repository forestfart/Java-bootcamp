package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char userSex;
    private final LocalDate userDOB;
    private final int userPostCount;

    public ForumUser(final int userID,final String userName,final char userSex,final LocalDate userDOB,final int userPostCount) {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.userDOB = userDOB;
        this.userPostCount = userPostCount;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUserDOB() {
        return userDOB;
    }

    public int getUserPostCount() {
        return userPostCount;
    }

    @Override
    public String toString() {
        final int age = Period.between(userDOB, LocalDate.now()).getYears();
        return "forumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userDOB=" + userDOB +
                ", userPostCount=" + userPostCount +
                ", userAge=" + age + '}';
    }
}
