package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Mood {

    protected Date date;
    protected String name;

    Mood(){
        this.date = new Date();
    }

    Mood(Date d){
        this.date = d;
    }

    public Date getDate(){
        return this.date;
    }

    public void setDate(Date d){
        this.date = d;
    }

    public String getName() {
        return this.name;
    }

}
