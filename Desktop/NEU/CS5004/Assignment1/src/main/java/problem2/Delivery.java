package problem2;

/**
 *This class represent Delivery. Delivery has information of starting location, end location, start time, and end time.
 */
public class Delivery {
    private String startingLocation;
    private String endLocation;
    private Time startTime;
    private Time endTime;
    private static final int HOUR_PER_DAY = 24;
    private static final int MINUTE = 60;
    private static final int SECOND = 60;

    /**
     *Constructor, creating a new delivery object that has the starting location, end location, start time, and end time.
     * @param startingLocation - starting location, represented as String
     * @param endLocation - ending location, represented as String
     * @param startTime - starting time, represented as Time
     * @param endTime - ending time, represented as Time
     */
    public Delivery(String startingLocation, String endLocation, Time startTime, Time endTime){
        this.startingLocation = startingLocation;
        this.endLocation = endLocation;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * getter for starting location
     * @return starting location
     */
    public String getStartingLocation() {
        return startingLocation;
    }

    /**
     *setter for starting location
     * @param startingLocation - String, starting location
     */
    public void setStartingLocation(String startingLocation) {
        this.startingLocation = startingLocation;
    }

    /**
     * getter for ending location
     * @return ending location
     */
    public String getEndLocation() {
        return endLocation;
    }

    /**
     * setter for ending location
     * @param endLocation - String, ending location
     */
    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    /**
     * Method getDuration computes duration, which is time difference between starting time and ending time
     * @return duration
     */
    public Time getDuration() {
        int hourDifference = endTime.getHour()- startTime.getHour();
        int minDifference = endTime.getMinute()- startTime.getMinute();
        int secDifference= endTime.getSeconds()- startTime.getSeconds();
        if (secDifference < 0){
            secDifference += SECOND;
            minDifference -= 1;
        }
        if (minDifference <0){
            minDifference += MINUTE;
            hourDifference -= 1;
        }
        if (hourDifference < 0){
            hourDifference += HOUR_PER_DAY;
        }

        Time duration = new Time(hourDifference, minDifference, secDifference);
        return duration;
    }
}
