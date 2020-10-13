package seedu.address.logic.commands.property;

import static seedu.address.logic.parser.CliSyntax.PREFIX_PROPERTY_ADDRESS;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PROPERTY_ASKING_PRICE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PROPERTY_ID;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PROPERTY_IS_RENTAL;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PROPERTY_NAME;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PROPERTY_SELLER_ID;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PROPERTY_TYPE;

public class PropertyCommandTestUtil {

    public static final String VALID_PROPERTY_NAME_ANCHORVALE = "Anchorvale Vista";
    public static final String VALID_PROPERTY_NAME_BEDOK = "Bedok Vista";

    public static final String VALID_PROPERTY_ADDRESS_ANCHORVALE = "Block 123 Anchorvale Road";
    public static final String VALID_PROPERTY_ADDRESS_BEDOK = "Block 456 Bedok Road";

    public static final String VALID_PROPERTY_IS_CLOSED_DEAL_ANCHORVALE = "Active";
    public static final String VALID_PROPERTY_IS_CLOSED_DEAL_BEDOK = "Close";

    public static final String VALID_PROPERTY_IS_RENTAL_ANCHORVALE = "No";
    public static final String VALID_PROPERTY_IS_RENTAL_BEDOK = "Yes";

    public static final String VALID_PROPERTY_PROPERTY_TYPE_ANCHORVALE = "HDB 5 room";
    public static final String VALID_PROPERTY_PROPERTY_TYPE_BEDOK = "Landed";

    public static final String VALID_PROPERTY_PROPERTY_ID_ANCHORVALE = "P1";
    public static final String VALID_PROPERTY_PROPERTY_ID_BEDOK = "P2";

    public static final double VALID_PROPERTY_ASKING_PRICE_ANCHORVALE = 100;
    public static final double VALID_PROPERTY_ASKING_PRICE_BEDOK = 1000.20;

    public static final String VALID_PROPERTY_SELLER_ID_ANCHORVALE = "S1";
    public static final String VALID_PROPERTY_SELLER_ID_BEDOK = "S2";

    // desc

    public static final String PROPERTY_NAME_DESC_ANCHORVALE =
            " " + PREFIX_PROPERTY_NAME + VALID_PROPERTY_NAME_ANCHORVALE;
    public static final String PROPERTY_NAME_DESC_BEDOK =
            " " + PREFIX_PROPERTY_NAME + VALID_PROPERTY_NAME_BEDOK;

    public static final String PROPERTY_ADDRESS_DESC_ANCHORVALE =
            " " + PREFIX_PROPERTY_ADDRESS + VALID_PROPERTY_ADDRESS_ANCHORVALE;
    public static final String PROPERTY_ADDRESS_DESC_BEDOK =
            " " + PREFIX_PROPERTY_ADDRESS + VALID_PROPERTY_ADDRESS_BEDOK;

    public static final String PROPERTY_IS_CLOSED_DEAL_DESC_ANCHORVALE =
            " " + VALID_PROPERTY_IS_CLOSED_DEAL_ANCHORVALE;
    public static final String PROPERTY_IS_CLOSED_DEAL_DESC_BEDOK =
            " " + VALID_PROPERTY_IS_CLOSED_DEAL_BEDOK;

    public static final String PROPERTY_IS_RENTAL_DESC_ANCHORVALE =
            " " + PREFIX_PROPERTY_IS_RENTAL + VALID_PROPERTY_IS_CLOSED_DEAL_ANCHORVALE;
    public static final String PROPERTY_IS_RENTAL_DESC_BEDOK =
            " " + PREFIX_PROPERTY_IS_RENTAL + VALID_PROPERTY_IS_RENTAL_BEDOK;

    public static final String PROPERTY_TYPE_DESC_ANCHORVALE =
            " " + PREFIX_PROPERTY_TYPE + VALID_PROPERTY_PROPERTY_TYPE_ANCHORVALE;
    public static final String PROPERTY_TYPE_DESC_BEDOK =
            " " + PREFIX_PROPERTY_TYPE + VALID_PROPERTY_PROPERTY_TYPE_BEDOK;

    public static final String PROPERTY_ID_DESC_ANCHORVALE =
            " " + PREFIX_PROPERTY_ID + VALID_PROPERTY_PROPERTY_ID_ANCHORVALE;
    public static final String PROPERTY_ID_DESC_BEDOK =
            " " + PREFIX_PROPERTY_ID + VALID_PROPERTY_PROPERTY_ID_BEDOK;

    public static final String PROPERTY_ASKING_PRICE_DESC_ANCHORVALE =
            " " + PREFIX_PROPERTY_ASKING_PRICE + VALID_PROPERTY_ASKING_PRICE_ANCHORVALE;
    public static final String PROPERTY_ASKING_PRICE_DESC_BEDOK =
            " " + PREFIX_PROPERTY_ASKING_PRICE + VALID_PROPERTY_ASKING_PRICE_BEDOK;

    public static final String PROPERTY_SELLER_ID_DESC_ANCHORVALE =
            " " + PREFIX_PROPERTY_SELLER_ID + VALID_PROPERTY_SELLER_ID_ANCHORVALE;
    public static final String PROPERTY_SELLER_ID_DESC_BEDOK =
            " " + PREFIX_PROPERTY_SELLER_ID + VALID_PROPERTY_SELLER_ID_BEDOK;

    // invalid desc
    public static final String INVALID_PROPERTY_NAME = " " + PREFIX_PROPERTY_NAME + "abc*&";
    public static final String INVALID_PROPERTY_IS_RENTAL = " " + PREFIX_PROPERTY_IS_RENTAL + "blah";
    public static final String INVALID_PROPERTY_PROPERTY_TYPE = " " + PREFIX_PROPERTY_TYPE + "abc&*";
    public static final String INVALID_PROPERTY_ASKING_PRICE = " " + PREFIX_PROPERTY_ASKING_PRICE + "-20";
    public static final String INVALID_PROPERTY_SELLER_ID = " " + PREFIX_PROPERTY_SELLER_ID + "D1";

}
