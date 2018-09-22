package ca.ualberta.cs.lonelytwitter;


public abstract class Mood {

    private Date date;
    private String name;

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
