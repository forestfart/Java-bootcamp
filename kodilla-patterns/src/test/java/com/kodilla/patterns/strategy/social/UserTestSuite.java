package com.kodilla.patterns.strategy.social;

import com.sun.media.sound.SoftCubicResampler;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User martinLuther = new YGeneration("martinLuther");
        User johnFitzerald = new ZGeneration("johnFitzerald");
        User islandFitzroy = new Millenials("islandFitzroy");

        //When
        String yGenerationDefaultSocialPublisher = martinLuther.getSocialPublisher().share();
        String zGenerationDefaultSocialPublisher = johnFitzerald.getSocialPublisher().share();
        String millenialsDefaultSocialPublisher = islandFitzroy.getSocialPublisher().share();

        //Then
        Assert.assertEquals("Twitter", yGenerationDefaultSocialPublisher);
        System.out.println(martinLuther.getUserName() + " likes to share his brain on: " + yGenerationDefaultSocialPublisher);
        Assert.assertEquals("Snapchat", zGenerationDefaultSocialPublisher);
        System.out.println(johnFitzerald.getUserName() + " likes to share his brain on: " + zGenerationDefaultSocialPublisher);
        Assert.assertEquals("Facebook", millenialsDefaultSocialPublisher);
        System.out.println(islandFitzroy.getUserName() + " likes to share his brain on: " + millenialsDefaultSocialPublisher);
    }

    @Test
    public void testIndividualSharingStrategies() {
        //Given
        User martinLuther = new YGeneration("martinLuther");
        User johnFitzerald = new ZGeneration("johnFitzerald");
        User islandFitzroy = new Millenials("islandFitzroy");

        //When
        martinLuther.setSocialPublisher(new SnapchatPublisher());
        johnFitzerald.setSocialPublisher(new TwitterPublisher());
        islandFitzroy.setSocialPublisher(new SnapchatPublisher());

        //Then
        Assert.assertEquals("Snapchat", martinLuther.getSocialPublisher().share());
        System.out.println(martinLuther.getUserName() + " likes to share his brain now on: " + martinLuther.getSocialPublisher().share());
        Assert.assertEquals("Twitter", johnFitzerald.getSocialPublisher().share());
        System.out.println(johnFitzerald.getUserName() + " likes to share his brain now on: " + johnFitzerald.getSocialPublisher().share());
        Assert.assertEquals("Snapchat", islandFitzroy.getSocialPublisher().share());
        System.out.println(islandFitzroy.getUserName() + " likes to share his brain now on: " + islandFitzroy.getSocialPublisher().share());
    }
}
