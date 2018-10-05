package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents Sad Mood.
 *
 * @author anticobalt
 * @see Mood
 */

public class Sad extends Mood {

    Sad(){
        super();
        this.name = "Sad";
    }

    Sad(Date d){
        super(d);
        this.name = "Sad";
    }

}
