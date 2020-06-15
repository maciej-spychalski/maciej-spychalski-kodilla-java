package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User adam = new Millenials("Adam");
        User alicja = new YGeneration("Alicja");
        User nikola = new ZGeneration("Nikola");

        //When
        String adamShouldUse = adam.sharePost();
        System.out.println("Adam should use " + adamShouldUse);
        String alicjaShouldUse = alicja.sharePost();
        System.out.println("Alicja should use " + alicjaShouldUse);
        String nikolaShouldUse = nikola.sharePost();
        System.out.println("Nikola should use " + nikolaShouldUse);

        //Then
        Assert.assertEquals("Facebook", adamShouldUse);
        Assert.assertEquals("Twitter", alicjaShouldUse);
        Assert.assertEquals("Snapchat", nikolaShouldUse);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User adam = new Millenials("Adam");

        //When
        String adamShouldUse = adam.sharePost();
        System.out.println("Adam should use " + adamShouldUse);
        adam.setSocialPublisher(new SnapchatPublisher());
        adamShouldUse = adam.sharePost();
        System.out.println("Adam now should use " + adamShouldUse);

        //Then
        Assert.assertEquals("Snapchat", adamShouldUse);
    }
}
