package problem2;

/**
 * This class represent Time. Time has an information of hour, minute, and second
 */
public class Time {
    private int hour;
    private int minute;
    private int seconds;
    private final int HOUR_PER_DAY = 24;
    private final int MIN_PER_HOUR = 60;
    private final int SEC_PER_MIN = 60;

    /**
     * Constructor, creating a Time object that has hour, minute, and seconds.
     * @param hour - hour, represented as int
     * @param minute -minute,  represented as int
     * @param seconds -seconds,  represented as int
     */
    public Time(int hour, int minute, int seconds){
        if(0 <= hour && hour < HOUR_PER_DAY){
            this.hour = hour;
        }
        else {
            System.out.println("Invalid hour");
        }
        if(0 <= minute && minute < MIN_PER_HOUR){
            this.minute = minute;
        }
        else {
            System.out.println("Invalid minute");
        }
        if(0 <= seconds && seconds < SEC_PER_MIN){
            this.seconds = seconds;
        }
        else {
            System.out.println("Invalid second");
        }
    }

    /**
     * getter for hour
     * @return hour, as int
     */
    public int getHour() {
        return hour;
    }

    /**
     * setter for hour
     * @param hour - int, hour
     */
    public void setHour(int hour) {
        if(0 <= hour && hour < HOUR_PER_DAY){
            this.hour = hour;
        }
        else {
            System.out.println("Invalid hour");
        }
    }

    /**
     * getter for minute
     * @return -minute
     */
    public int getMinute() {
        return minute;
    }

    /**
     * setter for minute
     * @param minute - int, minute
     */
    public void setMinute(int minute) {
        if(0 <= minute && minute < MIN_PER_HOUR) {
            this.minute = minute;
        }
        else {
            System.out.println("Invalid minute");
        }
    }

    /**
     * getter for seconds
     * @return seconds
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * setter for seconds
     * @param seconds - int, seconds
     */
    public void setSeconds(int seconds) {
        if(0 <= seconds && seconds < SEC_PER_MIN) {
            this.seconds = seconds;
        }
        else {
            System.out.println("Invalid seconds");
        }

    }
}
