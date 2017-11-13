package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser implements User {
    String userName;

    public ForumUser() {
        this.userName = "John Smith";
    }

    @Override
    public String getUserName() {
        return userName;
    }
}
