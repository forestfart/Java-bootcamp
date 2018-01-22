package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        // Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessieJames = new ForumUser("Jessie James");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessieJames);
        javaToolsForum.registerObserver(jessieJames);

        // When
        javaHelpForum.addPost("Hi everyone! Could you please help me out with the hibernate sheet? Im having a trouble blablbala...");
        javaHelpForum.addPost("Try to go with the other blablabla...");
        javaToolsForum.addPost("Help needed pls!, my MySQL db is down...");
        javaHelpForum.addPost("Yo, you need to settle down!");
        javaToolsForum.addPost("takeover and hangover is the key to the... blablabla");

        // Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());

        // Clean-up
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.removeObserver(ivoneEscobar);
        javaHelpForum.removeObserver(jessieJames);
        javaToolsForum.removeObserver(jessieJames);
        //remove posts as well.. you should add removePost method first
    }
}
