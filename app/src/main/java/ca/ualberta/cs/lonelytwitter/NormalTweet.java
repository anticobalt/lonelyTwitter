/*
From TAs.
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Represents normal priority Tweet.
 *
 * @author anticobalt
 * @see Tweet
 */

public class NormalTweet extends Tweet {

    @Override
    public Boolean isImportant() {
        return false;
    }
}
