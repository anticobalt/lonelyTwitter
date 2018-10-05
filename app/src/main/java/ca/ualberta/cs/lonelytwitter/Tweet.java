/*
Modified from TAs.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a Tweet.
 *
 * @author anticobalt
 * @see NormalTweet
 * @see ImportantTweet
 * @see Mood
 */

public abstract class Tweet {

    private Date date;
    private String message;
    private static final Integer MAX_CHARS = 140;
    private ArrayList<Mood> moods = new ArrayList<Mood>();

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() <= this.MAX_CHARS){
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }

    public void setDate(Date d){
        this.date = d;
    }

    public Date getDate(){
        return this.date;
    }

    public String toString(){
        return this.date.toString() + " | " + this.message;
    }

    public abstract Boolean isImportant();

}
