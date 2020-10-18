package seedu.address.model.bid;

import java.util.Objects;

import seedu.address.model.id.BidderId;
import seedu.address.model.id.PropertyId;
import seedu.address.model.price.Price;

public class Bid {

    public static final String MESSAGE_CONSTRAINTS_BID_AMOUNT =
            "Bid Amount should only contain numerical values, and it should not be blank";

    public static final String MESSAGE_CONSTRAINTS_PROPERTY_ID =
            "Property Id should only contain one alphanumeric characters "
                    + "followed by numerical characters, and it should not be blank";

    public static final String MESSAGE_CONSTRAINTS_BIDDER_ID =
            "Bidder Id should only contain one alphanumeric characters "
                     + "followed by numerical characters, and it should not be blank";

    public static final String DEFAULT_PROPERTY_ID = "P0";
    private PropertyId propertyId;
    private BidderId bidderId;
    private Price bidAmount;

    /**
     * Constructor for Bid Object
     * @param propertyId string id of the property to bid for
     * @param bidderId string id of the bidder wanting the property
     * @param bidAmount Price value of the amount the bidder wants the property for
     */
    public Bid(PropertyId propertyId, BidderId bidderId, Price bidAmount) {
        this.propertyId = propertyId;
        this.bidderId = bidderId;
        this.bidAmount = bidAmount;
    }

    public PropertyId getPropertyId() {
        return propertyId;
    }

    public BidderId getBidderId() {
        return bidderId;
    }

    public Price getBidAmount() {
        return bidAmount;
    }

    public boolean isValidPropertyId() {
        return false; //will check against propertyList to see if propertyId exists
    }

    public boolean isValidBidderId() {
        return false; //will check against bidderList to see if propertyId exists
    }

    /**
     * compares one bid with another bid to see if they are the same in content
     * @param otherBid bid to compare to
     * @return boolean value if they are the same or not
     */
    public boolean isSameBid(Bid otherBid) {
        if (otherBid == this) {
            return true;
        }

        return otherBid != null
                && otherBid.getPropertyId().equals(getPropertyId())
                && (otherBid.getBidderId().equals(getBidderId()))
                && ((otherBid.getBidAmount().equals(getBidAmount()))); // added this in
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(propertyId, bidderId, bidAmount);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Bid)) {
            return false;
        }

        Bid otherBid = (Bid) other;
        return otherBid.getPropertyId().equals(this.getPropertyId())
                && otherBid.getBidderId().equals(this.getBidderId())
                && otherBid.getBidAmount().equals(this.getBidAmount());
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Bid of ")
                .append(getBidAmount())
                .append(" by ")
                .append(getBidderId())
                .append(" to property: ")
                .append(getPropertyId());

        return builder.toString();
    }
}
