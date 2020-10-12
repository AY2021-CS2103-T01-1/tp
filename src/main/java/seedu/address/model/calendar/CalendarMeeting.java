package seedu.address.model.calendar;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;


/**
 * Represents a meeting in the calendar book.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class CalendarMeeting {

    private static final String PREFIX = "p";
    // TODO: should be managed somewhere else to access last id in storage

    // Identity fields
    protected boolean isPaperWork;
    protected boolean isViewing;
    protected boolean isAdmin;
    private final CalendarBidderId calendarBidderId;
    private final CalendarPropertyId calendarPropertyId;
    private final CalendarTime calendarTime;
    private final CalendarVenue calendarVenue;
    private boolean isMeeting;


    /**
     * Every field must be present and not null.
     */
    public CalendarMeeting(CalendarBidderId calendarBidderId, CalendarPropertyId calendarPropertyId,
                           CalendarTime calendarTime, CalendarVenue calendarVenue) {
        requireAllNonNull(calendarBidderId, calendarPropertyId, calendarTime, calendarVenue);
        this.calendarBidderId = calendarBidderId;
        this.calendarPropertyId = calendarPropertyId;
        this.calendarTime = calendarTime;
        this.calendarVenue = calendarVenue;
        this.isMeeting = true;
        this.isPaperWork = false;
        this.isViewing = false;
        this.isAdmin = false;
    }

    /**
     * Checks the type of meeting.
     * @return String containing the correct meeting type.
     */
    public String checkMeetingType() {
        if (isPaperWork) {
            return "Paperwork";
        } else if (isViewing) {
            return "Viewing";
        } else if (isAdmin) {
            return "Admin";
        } else {
            throw new AssertionError("no such meeting type");
        }
    }

    public CalendarBidderId getCalendarBidderId() {
        return this.calendarBidderId;
    }

    public CalendarPropertyId getCalendarPropertyId() {
        return this.calendarPropertyId;
    }

    public CalendarTime getCalendarTime() {
        return this.calendarTime;
    }

    public CalendarVenue getCalendarVenue() {
        return this.calendarVenue;
    }

    public boolean isViewing() {
        return this.isViewing;
    }

    public boolean isPaperWork() {
        return this.isPaperWork;
    }

    public boolean isAdmin() {
        return this.isAdmin;
    }

    /**
     * Returns true if either the property id is the same or if the address is the same.
     *
     * @param otherMeeting The other property.
     * @return True if both property objects represent the same property.
     */
    public boolean isSameMeeting(CalendarMeeting otherMeeting) {
        return this == otherMeeting;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(checkMeetingType());

        builder.append(" Bidder Id: ")
                .append(getCalendarBidderId())
                .append(" Property Id: ")
                .append(getCalendarPropertyId())
                .append(" Venue: ")
                .append(getCalendarVenue())
                .append(" Time: ")
                .append(getCalendarTime());
        return builder.toString();
    }
}

