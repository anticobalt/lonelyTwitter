/*
From TAs.
 */

package ca.ualberta.cs.lonelytwitter;

public class TweetTooLongException extends Exception {

    TweetTooLongException(){
        super("Your tweet is too long. Maximum length is 140 characters.");
    }

}
