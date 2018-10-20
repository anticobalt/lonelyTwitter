package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

public class TweetListTest extends ActivityInstrumentationTestCase2{

    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        // Check duplicate tweet rejected correctly
        try {
            tweets.addTweet(tweet);
        } catch (Exception e){
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    public void testDeleteTweet(){
        // Check that tweet actually removed
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        tweets.deleteTweet(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        // Check that correct tweet returned
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweets(){
        // Check that tweets returned in chronological order
        TweetList tweets = new TweetList();
        ArrayList<Tweet> local_tweets = new ArrayList<Tweet>();
        Tweet tweet1 = new NormalTweet("Tweet1");
        Tweet tweet2 = new NormalTweet("Tweet2");
        Tweet tweet3 = new NormalTweet("Tweet3");
        tweets.addTweet(tweet1);
        tweets.addTweet(tweet2);
        tweets.addTweet(tweet3);
        ArrayList<Tweet> returnedTweets = tweets.getTweets();
        for (int i = 0; i < 3; i++){
            assertEquals(local_tweets.get(i).getMessage(), returnedTweets.get(i).getMessage());
            assertEquals(local_tweets.get(i).getDate(), returnedTweets.get(i).getDate());
        }
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        ArrayList<Tweet> local_tweets = new ArrayList<Tweet>();
        Tweet tweet1 = new NormalTweet("Tweet1");
        Tweet tweet2 = new NormalTweet("Tweet2");
        Tweet tweet3 = new NormalTweet("Tweet3");
        tweets.addTweet(tweet1);
        tweets.addTweet(tweet2);
        tweets.addTweet(tweet3);
        int count = tweets.getCount();
        assertEquals(local_tweets.size(), count);
    }

}
