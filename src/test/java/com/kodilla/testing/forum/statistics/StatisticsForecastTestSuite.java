package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class StatisticsForecastTestSuite {
    @Test
    public void testCalculateAdvStatistics(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        for(int i = 0; i < 100; i++){
            userNames.add("Użytkownik " + i);
        }
        int posts = 200;
        int comments = 400;
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        StatisticsForecast statisticsForecast = new StatisticsForecast();
        //When
        statisticsForecast.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, statisticsForecast.getNumberOfUsers());
        Assert.assertEquals(200, statisticsForecast.getNumberOfPosts());
        Assert.assertEquals(400, statisticsForecast.getNumberOfComments());
        Assert.assertEquals(2.00, statisticsForecast.getAvrPostsPerUser(), 0);
        Assert.assertEquals(4.00, statisticsForecast.getAvrCommentsPerUser(), 0);
        Assert.assertEquals(2.00, statisticsForecast.getAvrCommentsPerPost(), 0);
    }
}
