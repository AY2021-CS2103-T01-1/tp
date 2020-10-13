package seedu.address.model.calendar;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Calendar's venue in the Calendar book.
 * Guarantees: immutable; is valid as declared in {@link #isValidCalendarVenue(String)}
 */
public class CalendarVenue {

    public static final String MESSAGE_CONSTRAINTS = "Calendar Venue should only contain alphanumeric characters"
            + " and spaces, and it should not be blank";

    /*
     * The first character of the CalendarVenue must not be a whitespace,
     * otherwise " " (a blank string) becomes a valid input.
     */
    public static final String VALIDATION_REGEX = "[^\\s].*";

    public final String venue;

    /**
     * Constructs an {@code CalendarVenue}.
     *
     * @param venue A valid CalendarVenue.
     */
    public CalendarVenue(String venue) {
        requireNonNull(venue);
        checkArgument(isValidCalendarVenue(venue), MESSAGE_CONSTRAINTS);
        this.venue = venue;
    }

    /**
     * Returns true if a given string is a valid venue.
     */
    public static boolean isValidCalendarVenue(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return this.venue;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof CalendarVenue // instanceof handles nulls
                && this.venue.equals(((CalendarVenue) other).venue)); // state check
    }

    @Override
    public int hashCode() {
        return this.venue.hashCode();
    }

}
