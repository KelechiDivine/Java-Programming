package chapterSeven.examples;

public class Time1 {

    private int hour;
    private int minutes;
    private int seconds;

    public void setTime(int h, int m, int s){
        if ((h >= 0 && h < 24) && (m >= 0 && m < 60)
        && (s >= 0 && s < 60)){
            hour = h;
            minutes = m;
            seconds = s;
        }

        else {
            throw new IllegalArgumentException("Hour, minutes and/or seconds was out of range");
        }
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour, minutes, seconds);
    }

    public  String toString(){
        return String.format("%d:%02d:%02d %s",
                (( hour == 0 || hour == 12 ) ? 12 : hour % 12 ),
                minutes, seconds, ( hour < 12 ? "AM" : "PM" ) );
    }
}
