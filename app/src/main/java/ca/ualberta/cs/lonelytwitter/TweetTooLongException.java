/*
From TAs.
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Indicates tweet is longer than 140 characters.
 *
 * @author anticobalt
 * @see Tweet
 * @see Tweetable
 */

public class TweetTooLongException extends Exception {

    TweetTooLongException(){
        super("Your tweet is too long. Maximum length is 140 characters.");
    }

}
