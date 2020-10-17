package seedu.address.model.id;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

public class SellerId extends Id {

    public static final String PREFIX_SELLER_ID = "S";
    public static final String VALIDATION_REGEX = "[S]\\p{Digit}+";
    public static final String MESSAGE_CONSTRAINTS = "Ids should start with a \""
            + PREFIX_SELLER_ID
            + "\", followed by"
            + "some numbers.";

    public SellerId(int idNumber) {
        super(PREFIX_SELLER_ID, idNumber);
    }

    public SellerId(String id) {
        super(id);
        requireNonNull(id);
        checkArgument(isValidId(id), MESSAGE_CONSTRAINTS);
    }

    @Override
    public SellerId increment() {
        return new SellerId(idNumber + 1);
    }

    /** Returns true if a given string is a valid Id. */
    public static boolean isValidId(String test) {
        return test.matches(VALIDATION_REGEX);
    }

}
