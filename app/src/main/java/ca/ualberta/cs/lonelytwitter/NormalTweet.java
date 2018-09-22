/*
From TAs.
 */

package ca.ualberta.cs.lonelytwitter;

public class NormalTweet extends Tweet {

    Tweet(){
        super();
    }

    Tweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return false;
    }
}
