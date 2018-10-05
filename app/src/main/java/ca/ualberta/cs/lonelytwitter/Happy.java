package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents Happy Mood.
 *
 * @author anticobalt
 * @see Mood
 */

public class Happy extends Mood {

    Happy(){
        super();
        this.name = "Happy";
    }

    Happy(Date d){
        super(d);
        this.name = "Happy";
    }
}
