/*
From TAs.
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Represents important Tweet.
 *
 * @author anticobalt
 * @see Tweet
 */

public class ImportantTweet extends Tweet {

    @Override
    public Boolean isImportant(){
        return true;
    }

}
