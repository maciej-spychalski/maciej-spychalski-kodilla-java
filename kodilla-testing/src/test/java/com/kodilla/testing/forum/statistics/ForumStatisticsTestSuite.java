package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    private List<String> generateUsersNames(int usersQuantity) {
        List<String> resultList = new ArrayList<String>();
        for (int i = 1; i <= usersQuantity; i++) {
            resultList.add("User " + i);
        }
        return resultList;
    }

    @Test
    public void testCalculateAdvStatisticsWithOPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        int numberOfUsers = 10;
        int numberOfPosts = 0;
        int numberOfComments = 0;
        double averageNumberOfPostsPerUser = numberOfPosts / numberOfUsers;
        double averageNumberOfCommentsPerUser = numberOfComments / numberOfUsers;
        double averageNumberOfCommentsPerPost = 0;

//        when(statisticsMock.usersNames()).thenReturn(generateUsersNames(0));
//        when(statisticsMock.usersNames().size()).thenReturn(numberOfUsers);
        when(statisticsMock.usersNames()).thenReturn(generateUsersNames(numberOfUsers));
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(averageNumberOfPostsPerUser, forumStatistics.getAverageNumberOfPostsPerUser(), 0.001d);
        Assert.assertEquals(averageNumberOfCommentsPerUser, forumStatistics.getAverageNumberOfCommentsPerUser(), 0.001d);
        Assert.assertEquals(averageNumberOfCommentsPerPost, forumStatistics.getAverageNumberOfCommentsPerPost(), 0.001d);
    }

    @Test
    public void testCalculateAdvStatisticsWith1000Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        int numberOfUsers = 10;
        int numberOfPosts = 1000;
        int numberOfComments = 3000;
        double averageNumberOfPostsPerUser = numberOfPosts / numberOfUsers;
        double averageNumberOfCommentsPerUser = numberOfComments / numberOfUsers;
        double averageNumberOfCommentsPerPost = numberOfComments / numberOfPosts;

        when(statisticsMock.usersNames()).thenReturn(generateUsersNames(numberOfUsers));
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(averageNumberOfPostsPerUser, forumStatistics.getAverageNumberOfPostsPerUser(), 0.001d);
        Assert.assertEquals(averageNumberOfCommentsPerUser, forumStatistics.getAverageNumberOfCommentsPerUser(), 0.001d);
        Assert.assertEquals(averageNumberOfCommentsPerPost, forumStatistics.getAverageNumberOfCommentsPerPost(), 0.001d);
    }

    @Test
    public void testCalculateAdvStatisticsWith0Comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        int numberOfUsers = 10;
        int numberOfPosts = 1000;
        int numberOfComments = 0;
        double averageNumberOfPostsPerUser = numberOfPosts / numberOfUsers;
        double averageNumberOfCommentsPerUser = numberOfComments / numberOfUsers;
        double averageNumberOfCommentsPerPost = numberOfComments / numberOfPosts;

        when(statisticsMock.usersNames()).thenReturn(generateUsersNames(numberOfUsers));
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(averageNumberOfPostsPerUser, forumStatistics.getAverageNumberOfPostsPerUser(), 0.001d);
        Assert.assertEquals(averageNumberOfCommentsPerUser, forumStatistics.getAverageNumberOfCommentsPerUser(), 0.001d);
        Assert.assertEquals(averageNumberOfCommentsPerPost, forumStatistics.getAverageNumberOfCommentsPerPost(), 0.001d);
    }

    @Test
    public void testCalculateAdvStatisticsWithNumberOfCommentsLessThenNumberOfPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        int numberOfUsers = 10;
        int numberOfPosts = 1000;
        int numberOfComments = 100;
        double averageNumberOfPostsPerUser = numberOfPosts / numberOfUsers;
        double averageNumberOfCommentsPerUser = numberOfComments / numberOfUsers;
        double averageNumberOfCommentsPerPost = numberOfComments / numberOfPosts;

        when(statisticsMock.usersNames()).thenReturn(generateUsersNames(numberOfUsers));
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(averageNumberOfPostsPerUser, forumStatistics.getAverageNumberOfPostsPerUser(), 0.001d);
        Assert.assertEquals(averageNumberOfCommentsPerUser, forumStatistics.getAverageNumberOfCommentsPerUser(), 0.001d);
        Assert.assertEquals(averageNumberOfCommentsPerPost, forumStatistics.getAverageNumberOfCommentsPerPost(), 0.001d);
    }

    @Test
    public void testCalculateAdvStatisticsWithNumberOfCommentsGreaterThenNumberOfPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        int numberOfUsers = 10;
        int numberOfPosts = 100;
        int numberOfComments = 1000;
        double averageNumberOfPostsPerUser = numberOfPosts / numberOfUsers;
        double averageNumberOfCommentsPerUser = numberOfComments / numberOfUsers;
        double averageNumberOfCommentsPerPost = numberOfComments / numberOfPosts;

        when(statisticsMock.usersNames()).thenReturn(generateUsersNames(numberOfUsers));
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(averageNumberOfPostsPerUser, forumStatistics.getAverageNumberOfPostsPerUser(), 0.001d);
        Assert.assertEquals(averageNumberOfCommentsPerUser, forumStatistics.getAverageNumberOfCommentsPerUser(), 0.001d);
        Assert.assertEquals(averageNumberOfCommentsPerPost, forumStatistics.getAverageNumberOfCommentsPerPost(), 0.001d);
    }

    @Test
    public void testCalculateAdvStatisticsWith0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        int numberOfUsers = 0;
        int numberOfPosts = 1000;
        int numberOfComments = 100;
        double averageNumberOfPostsPerUser = 0;
        double averageNumberOfCommentsPerUser = 0;
        double averageNumberOfCommentsPerPost = 0;

        when(statisticsMock.usersNames()).thenReturn(generateUsersNames(numberOfUsers));
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(averageNumberOfPostsPerUser, forumStatistics.getAverageNumberOfPostsPerUser(), 0.001d);
        Assert.assertEquals(averageNumberOfCommentsPerUser, forumStatistics.getAverageNumberOfCommentsPerUser(), 0.001d);
        Assert.assertEquals(averageNumberOfCommentsPerPost, forumStatistics.getAverageNumberOfCommentsPerPost(), 0.001d);
    }

    @Test
    public void testCalculateAdvStatisticsWith100Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        int numberOfUsers = 100;
        int numberOfPosts = 100;
        int numberOfComments = 1000;
        double averageNumberOfPostsPerUser = numberOfPosts / numberOfUsers;
        double averageNumberOfCommentsPerUser = numberOfComments / numberOfUsers;
        double averageNumberOfCommentsPerPost = numberOfComments / numberOfPosts;

        when(statisticsMock.usersNames()).thenReturn(generateUsersNames(numberOfUsers));
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(averageNumberOfPostsPerUser, forumStatistics.getAverageNumberOfPostsPerUser(), 0.001d);
        Assert.assertEquals(averageNumberOfCommentsPerUser, forumStatistics.getAverageNumberOfCommentsPerUser(), 0.001d);
        Assert.assertEquals(averageNumberOfCommentsPerPost, forumStatistics.getAverageNumberOfCommentsPerPost(), 0.001d);
    }
}