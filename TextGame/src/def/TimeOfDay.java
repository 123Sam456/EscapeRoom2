package def;

//ENUM to store day times for time message
public enum TimeOfDay {
    EARLY_MORNING(0, 6, "Shouldn't you be asleep?"),
    MORNING(6, 12, "Good morning! Rise and shine!"),
    NOON(12, 13, "Nothing like adventure at lunch time!"),
    AFTERNOON(13, 20, "Good afternoon, let's get to the adventure"),
    EVENING(20, 24, "Good Evening! Nothing like an adventure before bed!");

    private final int startHour;
    private final int endHour;
    private final String message;

    // Constructor
    TimeOfDay(int startHour, int endHour, String message) {
        this.startHour = startHour;
        this.endHour = endHour;
        this.message = message;
    }

    // Method to get the message based on the current hour
    public static String getMessageForTime(int hour) {
        for (TimeOfDay timeOfDay : values()) {
            if (hour >= timeOfDay.startHour && hour < timeOfDay.endHour) {
                return timeOfDay.message;
            }
        }
        return "Can't find current time. Are you a time traveler?"; // Default message
    }
}
