package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_PHONE = new Prefix("p/");
    public static final Prefix PREFIX_TAG = new Prefix("t/");
    public static final Prefix PREFIX_PROPERTY_ID = new Prefix("b/");
    public static final Prefix PREFIX_CLIENT = new Prefix("c/");
    public static final Prefix PREFIX_MONEY = new Prefix("m/");

    /* Calendar Prefix definitions */
    public static final Prefix PREFIX_CALENDAR_VENUE = new Prefix("v/");
    public static final Prefix PREFIX_CALENDAR_TIME = new Prefix("t/");
    public static final Prefix PREFIX_CALENDAR_PROPERTY_ID = new Prefix("p/");
    public static final Prefix PREFIX_CALENDAR_BIDDER_ID = new Prefix("b/");
    public static final Prefix PREFIX_CALENDAR_TYPE = new Prefix("q/");

}
