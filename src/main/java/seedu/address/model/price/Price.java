package seedu.address.model.price;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Price.
 * Guarantees: immutable; price is valid as declared in {@link #isValidPrice(double)}
 */
public class Price implements Comparable<Price> {

    public static final String MESSAGE_CONSTRAINTS = "Price should be greater than 0";

    public final double price;

    /**
     * Constructs a {@code Price}.
     *
     * @param price A valid price.
     */
    public Price(double price) {
        requireNonNull(price);
        checkArgument(isValidPrice(price), MESSAGE_CONSTRAINTS);
        this.price = price;
    }

    /**
     * Returns true if a given integer is a valid price.
     */
    public static boolean isValidPrice(double test) {
        return test > 0;
    }


    @Override
    public String toString() {
        return String.format("$%.2f", price);
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Price // instanceof handles nulls
                && price == ((Price) other).price); // state check
    }

    @Override
    public int hashCode() {
        return Double.hashCode(price);
    }

    @Override
    public int compareTo(Price o) {
        return Double.compare(this.price, o.price);
    }
}
