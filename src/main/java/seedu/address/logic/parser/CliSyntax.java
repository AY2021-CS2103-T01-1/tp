package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_PHONE = new Prefix("p/");
    public static final Prefix PREFIX_TAG = new Prefix("t/");

    /* Calendar Prefix definitions */
    public static final Prefix PREFIX_Calendar_Venue = new Prefix("v/");
    public static final Prefix PREFIX_Calendar_Time = new Prefix("t/");
    public static final Prefix PREFIX_Calendar_Property_ID = new Prefix("pID/");
    public static final Prefix PREFIX_Calendar_Bidder_ID = new Prefix("bID/");

}
