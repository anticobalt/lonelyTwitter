/*
Modified from TAs.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet {

    private Date date;
    private String message;
    private static final Integer MAX_CHARS = 140;
    private ArrayList<Mood> moods = new ArrayList<Mood>();

    Tweet(){
        this.date = new Date();
        this.message = "This is a default message.";
    }

    Tweet(String message){
        this.date = new Date();
        this.message = message;
    }

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

    public Date getDate(){
        return this.date;
    }

    public abstract Boolean isImportant();

}
