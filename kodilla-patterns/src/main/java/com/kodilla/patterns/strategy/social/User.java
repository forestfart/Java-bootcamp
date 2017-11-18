package com.kodilla.patterns.strategy.social;

public class User {
    private final String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public void sharePost() {
        System.out.println("Sharing post on " + socialPublisher.share());
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String getUserName() {
        return userName;
    }

    public SocialPublisher getSocialPublisher() {
        return socialPublisher;
    }
}
