package def;

import java.time.LocalTime;

// Class to give time-based greeting at the beginning of the game
public class TimeGreeting {

    // Local time and string to hold the message
    private final LocalTime userTime = LocalTime.now();
    private String timeMessage;

    // Constructor to initialize the time message based on the current time
    public TimeGreeting() {
        int hour = userTime.getHour();
        // Get the time-based message from the enum
        timeMessage = TimeOfDay.getMessageForTime(hour);
    }

    // Override toString to include the time and message
    @Override
    public String toString() {
        return String.format("It is %s%n%s", userTime, timeMessage);
    }
}