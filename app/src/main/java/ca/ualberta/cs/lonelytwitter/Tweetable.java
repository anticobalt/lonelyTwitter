/*
From TAs.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Indicates implementing objects have time-stamped messages.
 *
 * @author anticobalt
 * @see Tweet
 */

public interface Tweetable {

    public String getMessage();
    public Date getDate();

}
