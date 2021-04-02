package com.company;


public class ClockDisplay {

    private NumberDisplay hour;
    private NumberDisplay minute;
    private NumberDisplay second;
    private String displayString;

    public ClockDisplay() {
        hour = new NumberDisplay(24);
        minute = new NumberDisplay(60);
        second = new NumberDisplay(60);
    }

    public ClockDisplay(int hour, int minute, int second) {
        this.hour = new NumberDisplay(24);
        this.minute = new NumberDisplay(60);
        this.second = new NumberDisplay(60);
        setTime(hour, minute, second);
    }

    public void timeTick() {
        second.increment();
        if (second.getValue() == 0) {
            minute.increment();
            if (minute.getValue() == 0) {
                hour.increment();
            }
        }
        updateDisplay();
    }

    public void updateDisplay() {
        displayString = hour.getDisplayValue() + ":" + minute.getDisplayValue() + ":" + second.getDisplayValue();
    }

    public String getTime() {
        return displayString;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour.setValue(hour);
        this.minute.setValue(minute);
        this.second.setValue(second);
        updateDisplay();
    }

}

/*

 */
/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before
 * midnight).
 * <p>
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 * <p>
 * Constructor for ClockDisplay objects. This constructor
 * creates a new clock set at 00:00.
 * <p>
 * Constructor for ClockDisplay objects. This constructor
 * creates a new clock set at the time specified by the
 * parameters.
 * <p>
 * This method should get called once every minute - it makes
 * the clock display go one minute forward.
 * <p>
 * Set the time of the display to the specified hour and
 * minute.
 * <p>
 * Return the current time of this display in the format HH:MM.
 * <p>
 * Update the internal string that represents the display.
 * <p>
 * Constructor for ClockDisplay objects. This constructor
 * creates a new clock set at 00:00.
 * <p>
 * Constructor for ClockDisplay objects. This constructor
 * creates a new clock set at the time specified by the
 * parameters.
 * <p>
 * This method should get called once every minute - it makes
 * the clock display go one minute forward.
 * <p>
 * Set the time of the display to the specified hour and
 * minute.
 * <p>
 * Return the current time of this display in the format HH:MM.
 * <p>
 * Update the internal string that represents the display.
 *//*

public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;    // simulates the actual display

    */
/**
 * Constructor for ClockDisplay objects. This constructor
 * creates a new clock set at 00:00.
 *//*

    public ClockDisplay() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    */
/**
 * Constructor for ClockDisplay objects. This constructor
 * creates a new clock set at the time specified by the
 * parameters.
 *//*

    public ClockDisplay(int hour, int minute) {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }

    */
/**
 * This method should get called once every minute - it makes
 * the clock display go one minute forward.
 *//*

    public void timeTick() {
        minutes.increment();
        if (minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
        }
        updateDisplay();
    }

    */
/**
 * Set the time of the display to the specified hour and
 * minute.
 *//*

    public void setTime(int hour, int minute) {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    */
/**
 * Return the current time of this display in the format HH:MM.
 *//*

    public String getTime() {
        return displayString;
    }

    */
/**
 * Update the internal string that represents the display.
 *//*

    private void updateDisplay() {
        displayString = hours.getDisplayValue() + ":" +
                minutes.getDisplayValue();
    }
}
*/
